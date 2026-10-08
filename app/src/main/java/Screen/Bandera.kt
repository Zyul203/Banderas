package Screen

import Components.figuras
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import com.example.banderas.R
import androidx.compose.ui.graphics.Path
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Composable
fun Bandera(modifier: Modifier = Modifier)
{
    val azul = colorResource(id = R.color.azul_nepal)
    val rojo = colorResource(id = R.color.rojo_nepal)

    ConstraintLayout(modifier = Modifier.fillMaxSize().background(Color.White))
    {
        val (banderaCanvas) = createRefs()

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
            val w = size.width
            val h = size.height

            val triangSuperiorAzul = Path().apply {
                lineTo(w, size.height * 0.25f)
                lineTo(0f, h * 0.5f)
                close()
            }
            drawPath(triangSuperiorAzul, color = azul)

            val triangSuperiorRojo = Path().apply {
                lineTo(w * 0.95f, size.height * 0.25f) //Altura
                lineTo(0f, h * 0.48f)
                close()
            }
            drawPath(triangSuperiorRojo, color = rojo)

            val triangInferiorAzul = Path().apply {
                moveTo(0f, h * 0.5f)
                lineTo(w, size.height * 0.75f)
                lineTo(0f, h)
                close()
            }
            drawPath(triangInferiorAzul, color = azul)

            val triangInferiorRojo = Path().apply {
                moveTo(0f, h * 0.52f)
                lineTo(w * 0.95f, size.height * 0.75f)
                lineTo(0.5f, h - 1f)
                close()
            }
            drawPath(triangInferiorRojo, color = rojo)
        }
        figuras()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

