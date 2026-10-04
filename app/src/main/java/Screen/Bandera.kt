package Screen

import Components.EstrellaCanvas
import Components.trianglePath
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Canvas // IMPORTANTE: Usar foundation.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import androidx.compose.ui.graphics.drawscope.Stroke


/*
androidx.compose.ui.graphics.Canvas es una interfaz interna para dibujar
píxeles de bajo nivel.

androidx.compose.foundation.Canvas es el componente gráfico/Composable
que debes usar para dibujar en la pantalla.

*/

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier)
{
    val colorAzul = colorResource(id = R.color.azul_israel)
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {


        Column(modifier = Modifier.fillMaxSize())
        {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.15625f)
                    .background(colorAzul)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.6875f)
                    .background(Color.White), contentAlignment = Alignment.Center
            ) {

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.15625f)
                    .background(colorAzul)
            )
        }

        EstrellaCanvas() //FUNCION DE Componentes.kt
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaIsrael()
    }
}