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
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

