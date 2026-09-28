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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaArgentinaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (azulSup, blanco, azulInf) = createRefs()
        val lineaSup = createGuidelineFromBottom(0.660f)
        val lineaInf = createGuidelineFromBottom(0.33f)

        Box(modifier = Modifier.background(colorResource(id = R.color.azul_argentina)).constrainAs(azulSup)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaSup)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(blanco)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaSup)
            bottom.linkTo(lineaInf)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }, contentAlignment = Alignment.Center)
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_argentina),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(100.dp)
            )
        }

        Box(modifier = Modifier.background(colorResource(id = R.color.azul_argentina)).constrainAs(azulInf)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaInf)
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
        BanderaArgentinaC(modifier = Modifier.fillMaxSize())
    }
}