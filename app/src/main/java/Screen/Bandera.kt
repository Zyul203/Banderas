package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
fun BanderaMexicoC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier) {
        val (caja, caja1, caja2) = createRefs()

        val lineguia1 = createGuidelineFromStart(0.33f)
        val lineguia2 = createGuidelineFromStart(0.66f)



        Box(modifier = Modifier
            .background(colorResource(id = R.color.verde_mexico))
            .constrainAs(caja) {
                start.linkTo(parent.start)
                end.linkTo(lineguia1)

                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints


            })

        Box(modifier = Modifier
            .background(Color.White)
            .constrainAs(caja1) {
                start.linkTo(lineguia1)
                end.linkTo(lineguia2)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            })

        Box(modifier = Modifier
            .background(Color.Red)
            .constrainAs(caja2) {
                start.linkTo(lineguia2)
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
        BanderaMexicoC(modifier = Modifier.fillMaxSize()) //Manda a llamar a la bandera pero dile q se abra
}

