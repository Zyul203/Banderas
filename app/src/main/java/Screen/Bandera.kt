package Screen

import Components.Escudo
import Components.Estrellas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun Bandera(modifier : Modifier = Modifier)
{
    Canvas (modifier = modifier.fillMaxSize())
    {
        val w = size.width
        val h = size.height

        // TRIANGULO NEGRO
        val pathNegro = Path().apply {
            //moveTo(0f,0f) Si no pones el moveTo por defecto el inicio se colocará en (0,0)
            lineTo(0f , h) //Esquina Sup
            lineTo(w, h) //Esquina Inf
            close()
        }
        drawPath(path = pathNegro, color = Color.Black)

        //TRIANGULO ROJO
        val pathRojo = Path().apply {
            lineTo(w , 0f)
            lineTo(w, h)
            close()
        }
        drawPath(path = pathRojo, color = Color.Red)
    }

    Estrellas ( size = 60.dp, biasX = -0.5f, biasY = -0.1f) //Estrella Superior | -y = hacia arriba, -x = hacia la izquierda
    Estrellas ( size = 60.dp, biasX = -0.5f, biasY = 0.9f) //Estrella Inferior
    Estrellas ( size = 60.dp, biasX = -0.6f, biasY = 0.3f) //Estrella Izquierda
    Estrellas ( size = 60.dp, biasX = -0.4f, biasY = 0.3f) //Estrella Derecha
    Estrellas ( size = 30.dp, biasX = -0.45f, biasY = 0.55f) //Estrella CHIQUITA

    Escudo(biasX = 0.5f, biasY = -0.425f)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

