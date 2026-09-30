package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun Bandera(modifier: Modifier = Modifier)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.rojo_turquia))
    )
    {
        Canvas(modifier = modifier.fillMaxSize())
        {
            drawRect(color = Color(0xFFE30A17)) // fondo rojo
            val cy = size.height / 2f
            val rOut = size.height * 0.30f
            drawCircle(
                color = Color.White, radius = rOut,
                center = Offset(size.width * 0.38f, cy)
            )
            drawCircle(
                color = Color(0xFFE30A17), radius = size.height * 0.24f,
                center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
            )
        }

        Image(
            painter = painterResource(R.drawable.star_24px),
            contentDescription = "Estrella",
            modifier = Modifier.size(180.dp).align(Alignment.CenterStart).offset()

        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}