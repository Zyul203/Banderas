package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.banderas.R

@Composable
fun Escudo (modifier: Modifier = Modifier)
{
        Image(
            painter = painterResource(id = R.drawable.butan_dragon),
            contentDescription = "Estrellas",
            modifier = modifier.size(400.dp).rotate(0f)
        )
}

