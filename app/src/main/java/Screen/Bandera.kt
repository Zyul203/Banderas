package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaChile(modifier: Modifier = Modifier)
{
    Row (modifier = modifier.fillMaxSize())
    {
        Column(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(.66f)
                    .fillMaxHeight()
                    .background(Color.White)
            )
            Box(
                modifier = Modifier
                    .weight(.33f)
                    .fillMaxWidth()
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Star, //Se usa imageVector en los iconos
                    contentDescription = "Estrella de Chile",
                    tint = Color.White, // tint es usado para cambiar color del icono
                    modifier = Modifier.size(150.dp).rotate(200f)
                )
                //Icons.Default. Para ver los iconos disponibles
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red)
        )
    }
}










@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaChile()
    }
}