package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import com.example.banderas.R
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension



// Estructura de datos para definir un píxel manual (columna, fila, color)
data class PixelDato( //data class: Es una clase especial diseñada para almacenar datos
    val col: Int,
    val row: Int,
    val color: Color
)

@Composable
fun PixelArt(modifier: Modifier = Modifier, cols: Int = 39, rows: Int = 44)
{

    val c1 = colorResource(id = R.color.black)
    val c2 = colorResource(id = R.color.gris)
    val c3 = colorResource(id = R.color.white)
    val c4 = colorResource(id = R.color.rojo)
    val c5 = colorResource(id = R.color.naranja)
    val c6 = colorResource(id = R.color.naranja2)
    val c7 = colorResource(id = R.color.amarillo)
    val c8 = colorResource(id = R.color.azul1)
    val c9 = colorResource(id = R.color.azul2)
    val c10 = colorResource(id = R.color.azul3)
    val c11 = colorResource(id = R.color.azul4)
    val c12 = colorResource(id = R.color.crema)
    val c13 = colorResource(id = R.color.crema2)
    val c14 = colorResource(id = R.color.cafe1)
    val c15 = colorResource(id = R.color.cafe2)


    //PIXEL ART
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
}

@Preview(showBackground = true)
@Composable
fun PixelArtGridManualPreview() {
    PixelArt()
}