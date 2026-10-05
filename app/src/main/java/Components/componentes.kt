package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.banderas.R

@Composable
fun Estrellas (modifier : Modifier = Modifier, size : Dp, biasX : Float, biasY : Float)
{
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.star_24px),
            contentDescription = "Estrellas",
            modifier = Modifier.size(size).align(BiasAlignment(biasX, biasY))
        )
    }
}

@Composable
fun Escudo (modifier: Modifier = Modifier, biasX: Float, biasY: Float)
{
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.escudo_papuanuevaguinea),
            contentDescription = "Estrellas",
            modifier = Modifier.size(225.dp).align(BiasAlignment(biasX, biasY))
        )
    }
}

