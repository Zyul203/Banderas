package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaSuiza(modifier: Modifier = Modifier)
{
    Box( // 1. Box contenedor principal
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center) // Centra el área de contenido
            .aspectRatio(1f) // Lo restringe a una proporción cuadrada 1:1
            .background(colorResource(id = R.color.rojo_suiza))
    )
    {
        ConstraintLayout(modifier = Modifier.fillMaxSize())
        {
            val (recVertical, recHorizontal) = createRefs()
            val lineSupEx = createGuidelineFromTop(0.1875f)
            val lineInfEx = createGuidelineFromBottom( 0.1875f)
            val lineIzqEx = createGuidelineFromStart(0.1875f)
            val lineDerEx = createGuidelineFromEnd(0.1875f)

            val lineSupIn = createGuidelineFromTop(0.375f)
            val lineInfIn = createGuidelineFromBottom( 0.375f)
            val lineIzqIn = createGuidelineFromStart(0.375f)
            val lineDerIn = createGuidelineFromEnd(0.375f)


            // Franja Vertical de la Cruz Blanca
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .constrainAs(recVertical)
                    {
                        start.linkTo(lineIzqIn)
                        end.linkTo(lineDerIn)
                        top.linkTo(lineSupEx)
                        bottom.linkTo(lineInfEx)

                        height = Dimension.fillToConstraints
                        width = Dimension.fillToConstraints
                    }
            )

            // Franja Horizontal de la Cruz Blanca
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .constrainAs(recHorizontal) {
                        start.linkTo(lineIzqEx)
                        end.linkTo(lineDerEx)
                        top.linkTo(lineSupIn)
                        bottom.linkTo(lineInfIn)

                        height = Dimension.fillToConstraints
                        width = Dimension.fillToConstraints
                    }
            )
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaSuiza(modifier = Modifier.fillMaxSize())
    }
}