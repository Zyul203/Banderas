package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}

@Composable
fun BanderaBrasil(modifier: Modifier = Modifier)
{
    Box( modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.verde_brasil)), //Para el contentAlignment se usa coma
        contentAlignment = Alignment.Center //Para centrar tdo el contenido del BOX
    ) {
        Box( modifier = Modifier
            .fillMaxSize(0.75f)
            .clip(RombosShape)
            .background(colorResource(id = R.color.amarillo_brasil)),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_brasil),
                contentDescription = "Escudo Brasil",
                modifier = Modifier.size(400.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaBrasil()
    }
}