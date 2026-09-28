package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme



@Composable
fun BanderaEspanaC(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (rojoInf, amarillo,rojoSup, escudo) = createRefs()
        val lineaSup = createGuidelineFromBottom(0.75f)
        val lineaInf = createGuidelineFromBottom(0.25f)
        val lineaEscudo = createGuidelineFromStart(0.33f) //Linea de referencia para el escudo

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_espana)).constrainAs(rojoSup)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaSup)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorResource(id = R.color.amarillo_espana)).constrainAs(amarillo)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaSup)
            bottom.linkTo(lineaInf)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Image(
            painter = painterResource(id = R.drawable.escudo_espana),
            contentDescription = "Escudo nacional",
            modifier = Modifier.size(140.dp).constrainAs(escudo){

                // Centrado horizontalmente sobre la línea guía del 33%
                start.linkTo(lineaEscudo)
                end.linkTo(lineaEscudo)

                // Centrado verticalmente dentro de la franja amarilla
                top.linkTo(lineaSup)
                bottom.linkTo(lineaInf)
            }
        )

        Box(modifier = Modifier.background(colorResource(id = R.color.rojo_espana)).constrainAs(rojoInf)
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
        BanderaEspanaC(modifier = Modifier.fillMaxSize())
    }
}