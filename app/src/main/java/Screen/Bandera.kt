package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaItaliaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier) //modifier CON MINUSCULAS
    {
        val (verde, blanco, rojo) = createRefs()
        val lineaIzq = createGuidelineFromStart(0.33f)
        val lineaDer = createGuidelineFromStart(0.66f)

        Box(modifier = Modifier.background(colorResource(id = R.color.verde_Italia)).constrainAs(verde)
        {
            start.linkTo(parent.start)
            end.linkTo(lineaIzq)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(blanco)
        {
            start.linkTo(lineaIzq)
            end.linkTo(lineaDer)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.Red).constrainAs(rojo)
        {
            start.linkTo(lineaDer)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview()
{
    BanderasTheme {
        BanderaItaliaC(modifier = Modifier.fillMaxSize())
    }
}