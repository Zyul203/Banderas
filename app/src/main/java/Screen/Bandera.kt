package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BanderaJapon(modifier: Modifier = Modifier)
{
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.White))
    {
        Box(modifier = Modifier
            .align(Alignment.Center)
            .size(200.dp)
            .clip(CircleShape)
            .background(Color.Red))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaJapon()
    }
}