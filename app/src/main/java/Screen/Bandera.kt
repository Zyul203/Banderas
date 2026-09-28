package Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun BanderaColombia(modifier: Modifier = Modifier)
{
    Row(modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(2f).fillMaxHeight().background(colorResource(id = R.color.amarillo_colombia)))
        Box(Modifier.weight(1f).fillMaxHeight().background(colorResource(id = R.color.azul_colombia)))
        Box(Modifier.weight(1f).fillMaxHeight().background(colorResource(id = R.color.rojo_colombia)))
    }
}