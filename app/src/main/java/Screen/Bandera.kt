package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier)
{
    Box(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
        .aspectRatio(1f)
        .background(Color.Red)
    ){



    }





}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaSuiza()
    }
}