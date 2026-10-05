package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas //Agregar manualmente
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path //Agregar manualmente
import androidx.compose.ui.res.colorResource
import com.example.banderas.R


@Composable
fun BanderaSeychelles(modifier : Modifier = Modifier)
{
    val azul = colorResource(id = R.color.azul_seychelles)
    val amarillo = colorResource(id = R.color.amarillo_seychelles)
    val rojo = colorResource(id = R.color.rojo_seychelles)
    val blanco = Color.White
    val verde = colorResource(id = R.color.verde_seychelles)

    Canvas( modifier = modifier
            .fillMaxSize()
    ) {
        val w = size.width   // Ancho del Canvas en píxeles
        val h = size.height  // Alto del Canvas en píxeles

        // Definición del vértice único de origen en la esquina inferior izquierda
        val vertice = Offset(0f, h)

        // 1. RAYO AZUL
        val pathAzul = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(0f, 0f)             // Esquina superior izquierda
            lineTo(w / 3f, 0f)         // Primer tercio del borde superior
            close()
        }
        drawPath(path = pathAzul, color = azul)

        // 2. RAYO AMARILLO
        val pathAmarillo = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w / 3f, 0f)         // Primer tercio del borde superior
            lineTo((2f * w) / 3f, 0f)  // Segundo tercio del borde superior
            close()
        }
        drawPath(path = pathAmarillo, color = amarillo)

        // 3. RAYO ROJO
        val pathRojo = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo((2f * w) / 3f, 0f)  // Segundo tercio del borde superior
            lineTo(w, 0f)              // Esquina superior derecha
            lineTo(w, h / 2f)          // Mitad del borde derecho
            close()
        }
        drawPath(path = pathRojo, color = rojo)

        // 4. RAYO BLANCO
        val pathBlanco = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w, h / 2f)          // Mitad del borde derecho
            lineTo(w, (3f * h) / 4f)   // 3/4 partes del borde derecho (divisor del blanco al verde)
            close()
        }
        drawPath(path = pathBlanco, color = blanco)

        // 5. RAYO VERDE
        // Ocupa la esquina inferior derecha restante
        val pathVerde = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w, (3f * h) / 4f)   // Desde donde termina el blanco
            lineTo(w, h)               // Esquina inferior derecha
            close()
        }
        drawPath(path = pathVerde, color = verde)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaSeychelles()
    }
}

/*
unciones como moveTo() y lineTo() dentro de un Path no aceptan un objeto Offset completo como parámetro,
sino que solicitan dos números Float separados para $X$ y $Y$
 */