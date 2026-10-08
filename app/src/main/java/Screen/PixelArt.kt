package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.example.banderas.R
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension



// Estructura de datos para definir un píxel manual (columna, fila, color)
data class PixelDato( //data class: Es una clase especial diseñada para almacenar datos
    val col: Int,
    val row: Int,
    val color: Color
)

@Composable
fun PixelArt(modifier: Modifier = Modifier.fillMaxSize(), gridSize: Int = 45) {

    val c1 = colorResource(id = R.color.white)
    val c2 = colorResource(id = R.color.black)
    val c3 = colorResource(id = R.color.gris)
    val c4 = colorResource(id = R.color.rojo)
    val c5 = colorResource(id = R.color.naranja)
    val c6 = colorResource(id = R.color.naranja2)
    val c7 = colorResource(id = R.color.amarillo)
    val azulMedio = colorResource(id = R.color.azul1)
    val azulClaro = colorResource(id = R.color.azul2)
    val azulFuerte = colorResource(id = R.color.azul3)
    val c11 = colorResource(id = R.color.azul4)
    val cremaClaro = colorResource(id = R.color.crema)
    val cremaFuerte = colorResource(id = R.color.crema2)
    val cafeClaro = colorResource(id = R.color.cafe1)
    val cafeFuerte = colorResource(id = R.color.cafe2)

//42*42
    Row(modifier = Modifier.fillMaxWidth().aspectRatio(1f))
    {
        Column(modifier = modifier.weight(1f).fillMaxSize()) //C1
        {
            Box(modifier = Modifier.weight(17f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
        }

        Column(modifier = modifier.weight(1f).fillMaxSize())//C2
        {
            Box(modifier = Modifier.weight(15f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))


        }

        Column(modifier = modifier.weight(1f).fillMaxSize())//C3
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C4
        {
            Box(modifier = Modifier.weight(13f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C5
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C6
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C7
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C8
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C9
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C10
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C11
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C12
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C13
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C14
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C15
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C16
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }


        Column (modifier = modifier.weight(1f).fillMaxSize())//C17
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C18
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C19
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C20
        {
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C21
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C22
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C23
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C24
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C25
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C26
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C27
        {
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C28
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C29
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C30
        {
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C31
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C32
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C33
        {
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C34
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }


        Column (modifier = modifier.weight(1f).fillMaxSize())//C35
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }
    }


}






    /*
    val pixeles = listOf(

        PixelDato(col = 1 , row = 15, color = c10),
        PixelDato(col = 1 , row = 16, color = c10),
        PixelDato(col = 1 , row = 17, color = c10),
        PixelDato(col = 1 , row = 18, color = c10),
        PixelDato(col = 1 , row = 25, color = c10),
        PixelDato(col = 1 , row = 26, color = c10),
        PixelDato(col = 1 , row = 27, color = c10),
        PixelDato(col = 1, row = 28, color = c15)

    )

    Canvas(modifier = modifier.fillMaxWidth().aspectRatio(1f))
    {
        // Tamaño en píxeles
        val celdas = size.width / cols

        // Dibujar fondo
        drawRect(
            color = Color.White,
            size = Size(size.width, size.height))

        // Pintar pixeles
        pixeles.forEach { pixel -> //Es un bucle que toma la lista de píxeles
            drawRect(
                color = pixel.color,
                topLeft = Offset(pixel.col * celdas, pixel.row * celdas), //Define la posición inicial
                size = Size(celdas, celdas) //Define el ancho y alto que tendrá el rectángulo
            )
        }

    }
    */


@Preview(showBackground = true)
@Composable
fun PixelArtPreview() {
    PixelArt()
}