package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme


@Composable
fun BanderaColombiaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (amarillo , azul, rojo) = createRefs()
        val lineaSup = createGuidelineFromBottom(0.5f)
        val lineaInf = createGuidelineFromBottom(0.25f)

        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_colombia)).constrainAs(amarillo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaSup)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorResource(id = R.color.azul_colombia)).constrainAs(azul)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaSup)
            bottom.linkTo(lineaInf)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_colombia)).constrainAs(rojo)
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
        BanderaColombiaC(modifier = Modifier.fillMaxSize())
    }
}