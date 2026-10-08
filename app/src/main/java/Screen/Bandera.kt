package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import com.example.banderas.R
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun Bandera(modifier : Modifier = Modifier)
{
    val verde = colorResource(id = R.color.verde_sudafrica)
    val azul = colorResource(id = R.color.azul_sudafrica)
    val amarillo = colorResource(id = R.color.amarillo_sudafrica)

    ConstraintLayout(modifier = Modifier.fillMaxSize())
    {
        val (banderaCanvas, BoxAzul, BoxAmarillo) = createRefs()
        val line = createGuidelineFromTop(0.5f)

        Box(modifier = Modifier.background(azul).constrainAs(BoxAzul)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(line)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(amarillo).constrainAs(BoxAmarillo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(line)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })


        Canvas(modifier = modifier.constrainAs(banderaCanvas)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        {

            val apex = Offset(size.width * 0.36f, size.height / 2f)
            drawLine(Color.White, Offset(0f, 0f), apex, size.height * 0.30f)
            drawLine(Color.White, Offset(0f, size.height), apex, size.height * 0.30f)
            drawLine(Color.White, apex, Offset(size.width, size.height * 0.14f), size.height * 0.30f, cap = StrokeCap.Square)
            drawLine(Color.White, apex, Offset(size.width, size.height * 0.86f), size.height * 0.30f, cap = StrokeCap.Square)

            drawLine(verde, Offset(0f, 0f), apex, (size.height * 0.30f) * 0.8f)
            drawLine(verde, Offset(0f, size.height), apex, (size.height * 0.30f) * 0.8f)
            drawLine(verde, apex, Offset(size.width, size.height * 0.14f), (size.height * 0.30f) * 0.8f, cap = StrokeCap.Square)
            drawLine(verde, apex, Offset(size.width, size.height * 0.86f), (size.height * 0.30f) * 0.8f, cap = StrokeCap.Square)

            val triWidth = size.width * 0.3f //ALTURA DEL TRIANGULO (Es width porque el triángulo está acostado)

            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(triWidth, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(trianglePath, color = Color.Black)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

