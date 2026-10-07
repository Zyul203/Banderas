package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import com.example.banderas.R

@Composable
fun Bandera(modifier : Modifier = Modifier)
{
    val verde = colorResource(id = R.color.verde_sudafrica)

    Canvas(modifier = modifier.fillMaxSize().background(Color.Black))
    {
        val apex = Offset(size.width * 0.36f, size.height / 2f)
        drawLine(Color.White, Offset(0f, 0f), apex, size.height * 0.30f)
        drawLine(Color.White, Offset(0f, size.height), apex, size.height * 0.30f)
        drawLine(Color.White, apex, Offset(size.width, size.height * 0.14f), size.height * 0.30f)
        drawLine(Color.White, apex, Offset(size.width, size.height * 0.86f), size.height * 0.30f)


        drawLine(verde, Offset(0f, 0f), apex, (size.height * 0.30f) * 0.8f)
        drawLine(verde, Offset(0f, size.height), apex, (size.height * 0.30f) * 0.8f)
        drawLine(verde, apex, Offset(size.width, size.height * 0.14f), size.height * 0.30f)
        drawLine(verde, apex, Offset(size.width, size.height * 0.86f), size.height * 0.30f)


// Repetir las 4 lineas anteriores con Color verde y grosor menor (0.20f) encima
// Luego el triangulo negro del asta con drawPath
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

