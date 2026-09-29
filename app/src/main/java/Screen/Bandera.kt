package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R //Para que estén disponibles las imágenes
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaChileC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (azul, blanco, rojo) = createRefs()
        val lineCentral = createGuidelineFromBottom(0.5f)
        val lineAzul = createGuidelineFromStart(0.33f)

        Box(modifier = Modifier.background(Color.White).constrainAs(blanco)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineCentral)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.Blue).constrainAs(azul)
        {
            start.linkTo(parent.start)
            end.linkTo(lineAzul)
            top.linkTo(parent.top)
            bottom.linkTo(lineCentral)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }, contentAlignment = Alignment.Center)
        {
            Image(
                painter = painterResource(id = R.drawable.star_24px),
                contentDescription = "Estrella de Chile",
                modifier = Modifier.size(80.dp)
            )
        }

        Box(modifier = Modifier.background(Color.Red).constrainAs(rojo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineCentral)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaChileC(modifier = Modifier.fillMaxSize())
    }
}