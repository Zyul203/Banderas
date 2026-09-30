package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R


@Composable
fun BanderaEspana(modifier: Modifier = Modifier)
{
    Column (modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.rojo_espana)))
        Box(Modifier.weight(2f).fillMaxWidth().background(colorResource(id = R.color.amarillo_espana)))
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_espana),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(150.dp)
                    .align(BiasAlignment( horizontalBias = -(0.33f), verticalBias = 0f
                    ) //BiasAlignment = Sirve para posicionar o alinear un elemento dentro de un contenedor (como un Box)
                )//RECOMENDADO: Si es negativo poner entre parentesis.
            )
        }
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.rojo_espana)))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
        BanderaEspana()
}