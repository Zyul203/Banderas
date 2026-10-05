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
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.R

@Composable
fun Estrella(modifier: Modifier = Modifier)
{
    ConstraintLayout(modifier = Modifier.fillMaxSize())
    {
        val centroS_v = createGuidelineFromStart(0.175f)
        val centroS_h = createGuidelineFromTop(0.5f)
        val (estrella) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.star_24px),
            contentDescription = "Estrella de Cuba",
            modifier = Modifier
                .size(100.dp)
                .constrainAs(estrella) {
                    // Centrar horizontalmente sobre la línea vertical (17.5%)
                    start.linkTo(centroS_v)
                    end.linkTo(centroS_v)

                    // Centrar verticalmente sobre la línea horizontal (50%)
                    top.linkTo(centroS_h)
                    bottom.linkTo(centroS_h)
                }
        )
    }
}
/*
Para centrar un elemento con base en una línea de referencia,
la tienes que poner en tanto en top/bottom o start/end
 */