package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas //Agregar manualmente
import androidx.compose.foundation.layout.fillMaxSize
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
        val vertice = Offset(0f, h) // Vértice único de origen

        // 1. FIGURA AZUL
        val pathAzul = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(0f, 0f)
            lineTo(w / 3f, 0f)
            close()                             //La función close() de la clase Path sirve para cerrar automáticamente la figura geométrica dibujando una línea recta final
        }
        drawPath(path = pathAzul, color = azul)

        // 2. FIGURA AMARILLA
        val pathAmarillo = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w / 3f, 0f)
            lineTo((2f * w) / 3f, 0f)
            close()
        }
        drawPath(path = pathAmarillo, color = amarillo)

        // 3. FIGURA ROJO
        val pathRojo = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo((2f * w) / 3f, 0f)  // 1. EsquinaSup: x = 2/3 del ancho
            lineTo(w, 0f)              // Vértice: x = El punto final del ANCHO
            lineTo(w, h / 3f)          // 1° EsquinaDer: y = 1/3 de la altura
            close()
        }
        drawPath(path = pathRojo, color = rojo)

        // 4. FIGURA BLANCO
        val pathBlanco = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w, h / 3f)                 // 1° Esquina: y = 1/3 de la altura
            lineTo(w, (2f * h) / 3f)          // 2° Esquina: y = 2/3 de la altura
            close()
        }
        drawPath(path = pathBlanco, color = blanco)

        // 5. FIGURA VERDE
        val pathVerde = Path().apply {
            moveTo(vertice.x, vertice.y)
            lineTo(w, (2f * h) / 3f)   // 1° Esquina: y = 2/3 de la altura
            lineTo(w, h)               // 2° Esquina: y = La altura completa
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
* Funciones como moveTo() y lineTo() dentro de un Path no aceptan un objeto Offset completo como parámetro,
    sino que solicitan dos números Float separados para X y Y
* En la Y del "lineTo" empieza desde el TOP
 */