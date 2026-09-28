package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R



@Composable
fun BanderaAlemaniaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (negro, rojo, amarillo) = createRefs()
        val lineaInf = createGuidelineFromBottom(0.33f)
        val lineaSup = createGuidelineFromBottom(0.66f)

        Box(modifier = Modifier.background(Color.Black).constrainAs(negro)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaSup)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_alemania)).constrainAs(rojo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaSup)
            bottom.linkTo(lineaInf)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_alemania)).constrainAs(amarillo)
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
fun BanderaAlemaniaPreview() {
        BanderaAlemaniaC(modifier = Modifier.fillMaxSize())
}