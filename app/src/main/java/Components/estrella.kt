package Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.banderas.R

@Composable
fun Estrella(modifier: Modifier = Modifier)
{
        Image(
            painter = painterResource(id = R.drawable.star_24px),
            contentDescription = "Estrella",
            modifier = Modifier.size(100.dp)
        )
}