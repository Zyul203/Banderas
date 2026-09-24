package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaFrancia(modifier: Modifier = Modifier)
{
    Row (modifier = modifier.fillMaxSize())
    {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(colorResource(id = R.color.azul_francia))
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White),
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFFEF4135))
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaFrancia()
    }
}