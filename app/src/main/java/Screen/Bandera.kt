package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R


@Composable
fun Bandera(modifier : Modifier = Modifier) {
    val azul = colorResource(id = R.color.azul_reino)

    ConstraintLayout (modifier = Modifier.fillMaxSize().background(azul))
    {
        val canvasBandera = createRef()


        val ( cruzBlancaVert, cruzBlancaHoriz,
            cruzRojaVert, cruzRojaHoriz) = createRefs()

        val lineY = createGuidelineFromTop(0.5f)
        val lineX = createGuidelineFromStart(0.5f)


        Canvas(modifier = modifier.constrainAs(canvasBandera)
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
            val strokeDiagonal_Blanca = 150f
            val strokeCruz_Blanca = 250f
            val strokeDiagonal_Roja = 50f
            val strokeCruz_Rojo = 120f


            // ----- DIAGONALES ---------------------------------

            // 1. Diagonal Superior-Izquierda a Inferior-Derecha
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = strokeDiagonal_Blanca,
                cap = StrokeCap.Square // Extiende los bordes para cubrir tdo el margen
            )


            // 2. Diagonal Inferior-Izquierda a Superior-Derecha
            drawLine( Color.White, Offset(0f, h), Offset(w, 0f),
                strokeDiagonal_Blanca, cap = StrokeCap.Square) //No es necesario especificar, pero tienes que seguir un orden


            // 1. Diagonal Superior-Izquierda a Inferior-Derecha
            drawLine(
                color = Color.Red,
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = strokeDiagonal_Roja,
                cap = StrokeCap.Square
            )

            // 2. Diagonal Inferior-Izquierda a Superior-Derecha
            drawLine(
                color = Color.Red,
                start = Offset(0f, h),
                end = Offset(w, 0f),
                strokeWidth = strokeDiagonal_Roja,
                cap = StrokeCap.Square
            )
        }
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cruzBlancaVert) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    // Centrada en la guía vertical
                    start.linkTo(lineX)
                    end.linkTo(lineX)

                    width = Dimension.value(100.dp) // Ancho de la cruz blanca
                    height = Dimension.fillToConstraints
                }
        )

        // Cruz Blanca Horizontal
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cruzBlancaHoriz) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    // Centrada en la guía horizontal
                    top.linkTo(lineY)
                    bottom.linkTo(lineY)

                    width = Dimension.fillToConstraints
                    height = Dimension.value(100.dp) // Alto de la cruz blanca
                }
        )

        // ----------------------------------------------------
        // CAPA 3: Cruz Roja (Superpuesta al centro)
        // ----------------------------------------------------
        // Cruz Roja Vertical
        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(cruzRojaVert) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    // Centrada en la guía vertical
                    start.linkTo(lineX)
                    end.linkTo(lineX)

                    width = Dimension.value(60.dp) // Ancho de la cruz roja
                    height = Dimension.fillToConstraints
                }
        )

        // Cruz Roja Horizontal
        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(cruzRojaHoriz)
                {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(lineY)
                    bottom.linkTo(lineY)

                    width = Dimension.fillToConstraints
                    height = Dimension.value(60.dp)
                }
        )
    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

