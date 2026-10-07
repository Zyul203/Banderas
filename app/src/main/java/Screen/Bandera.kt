package Screen

import Components.Escudo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import com.example.banderas.R

@Composable
fun Bandera(modifier : Modifier = Modifier)
{
    val amarillo = colorResource(id = R.color.amarillo_butan)
    val naranja = colorResource(id =R.color.naranja_butan)

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Canvas(modifier = modifier.fillMaxSize())
        {
            val w = size.width
            val h = size.height

            val pathAmarillo = Path().apply {
                lineTo(0f, h) //Esquina Inf_Izq
                lineTo(w , 0f) //Esquina Sup_Der
                close()
            }
            drawPath(path = pathAmarillo, color = amarillo)

            val pathNaranja = Path().apply {
                moveTo(w, h) //Para cambiar el punto de referencia
                lineTo(0f, h)
                lineTo(w, 0f)
                close()
            }
            drawPath(path = pathNaranja, color = naranja)
        }

        Escudo()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

