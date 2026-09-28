package Screen

import android.R.attr.bottom
import android.R.attr.end
import android.R.attr.start
import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import kotlinx.coroutines.NonDisposableHandle.parent


@Composable
fun BanderaEspana(modifier: Modifier = Modifier)
{
    Column (modifier = modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.rojo_espana)))
        Box(Modifier.weight(2f).fillMaxWidth().background(colorResource(id = R.color.amarillo_espana)), contentAlignment = Alignment.Center)
        {
            Image(
                painter = painterResource(id = R.drawable.escudo_espana),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(150.dp)
            )
        }
        Box(Modifier.weight(1f).fillMaxWidth().background(colorResource(id = R.color.rojo_espana)))
    }
}

@Composable
fun BanderaEspanaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (rojo1, amarillo, rojo2) = createRefs()
        val lineaIzq = createGuidelineFromBottom(0.33f)
        val lineaDer = createGuidelineFromBottom(0.66f)

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_espana)).constrainAs(rojo1)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(amarillo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }) {
            Image(
                painter = painterResource(id = R.drawable.escudo_espana),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(150.dp)
            )
        }

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_espana)).constrainAs(rojo1))
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            bottom.linkTo()

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaEspanaC(modifier = Modifier.fillMaxSize())
    }
}