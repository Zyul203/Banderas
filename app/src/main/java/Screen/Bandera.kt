package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaColombia(modifier: Modifier = Modifier)
{
    Column (modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(2f).fillMaxWidth().background(colorResource(id = R.color.amarillo_colombia)))
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.azul_colombia)))
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.rojo_colombia)))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaColombia()
    }
}