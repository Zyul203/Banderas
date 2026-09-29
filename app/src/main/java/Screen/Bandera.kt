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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) //
{
    Column (modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.azul_argentina)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.White), contentAlignment = Alignment.Center)
        {
            Image(
                painter = painterResource(id =  R.drawable.escudo_argentina),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(140.dp)
            )
        }
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.azul_argentina)))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaArgentina()
    }
}