package Screen

import Components.Estrella
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.ui.graphics.Path //ESTE LO IMPORTAS MANUALMENTE


@Composable
fun BanderaCuba(modifier : Modifier = Modifier)
{

    val colorRojo = colorResource(id = R.color.rojo_cuba)
    val colorAzul = colorResource(id = R.color.azul_cuba)

    Box(modifier = Modifier.fillMaxSize())
    {
        Canvas(modifier = modifier.fillMaxSize())
        {
            val triWidth = size.width * 0.38f //ALTURA DEL TRIANGULO (Es width porque el triángulo está acostado)
            val band = size.height / 5f //MEDIDA DE LAS FRANJAS

            for (i in 0 until 5) {
                if (i % 2 == 0)
                    drawRect(
                        color = colorAzul,
                        topLeft = Offset(0f, i * band),
                        size = Size(size.width, band)
                    )
            }

            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(triWidth, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(trianglePath, color = colorRojo)

        }

        Estrella()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaCuba()
    }
}

/* NOTAS PERSONALES
1. val band = size.height / 5f: Divide la altura total disponible del Canvas (size.height) entre 5 para calcular el alto exacto que
tendrá cada una de las 5 franjas horizontales.

2. for (i in 0 until 5):
Ejecuta un bucle 5 veces (para los índices i = 0, 1, 2, 3, 4).

3. if (i % 2 == 0) drawRect(...):
Verifica mediante el operador módulo % si el índice i es un número par (0, 2, 4):

4. topLeft = Offset(0f, i * band):
Define la esquina superior izquierda desde donde empieza a dibujarse cada rectángulo,
    multiplicando la altura de la franja (band) por la posición del índice i.

5. size = Size(size.width, band):
Asegura que el rectángulo abarque tdo el ancho de la pantalla (size.width) y tenga la altura de una franja (band)

6. drawPath
La función drawPath dentro de un Canvas en Jetpack Compose sirve para renderizar (dibujar)
    en la pantalla una figura geométrica personalizada o trazo complejo

IMPORTANTE:
*size.width y size.height son PROPIEDADES EXCLUSIVAS del CANVAS
 */