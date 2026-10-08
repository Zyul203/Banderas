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
data class PixelData( //data class: Es una clase especial diseñada para almacenar datos
    val col: Int,
    val row: Int,
    val color: Color
)

@Composable
fun PixelArt(modifier: Modifier = Modifier)
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


    // 1. Definición manual de los 3 píxeles en el código
    val pixeles = listOf(
        //Columnas
        //7
        PixelData(col = 7 , row = 19, color = c30),
        PixelData(col = 7 , row = 20, color = c30),
        PixelData(col = 7 , row = 21, color = c30),
        PixelData(col = 7 , row = 22, color = c30),
        PixelData(col = 7 , row = 29, color = c30),
        PixelData(col = 7 , row = 30, color = c30),
        PixelData(col = 7 , row = 31, color = c30),
        PixelData(col = 7 , row = 32, color = c33),

    )

    Canvas( modifier = modifier.fillMaxWidth().aspectRatio(1f)
    ) {
        // Tamaño en píxeles
        val cellSize = size.width / gridSize

        // Dibujar fondo
        drawRect(
            color = backgroundColor.
            size = Size(size.width, size.height)
        )

        // Pintar pixeles
        pixeles.forEach { pixel ->
            drawRect(
                color = pixel.color,
                topLeft = Offset(pixel.col * cellSize, pixel.row * cellSize),
                size = Size(cellSize, cellSize)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PixelArtGridManualPreview() {
    PixelArt()
}