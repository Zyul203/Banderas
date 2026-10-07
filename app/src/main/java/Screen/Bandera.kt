package Screen

import Components.EstrellaCanvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.ui.res.colorResource
import com.example.banderas.R
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


/*
androidx.compose.ui.graphics.Canvas es una interfaz interna para dibujar
píxeles de bajo nivel

androidx.compose.foundation.Canvas es el componente gráfico/Composable
que debes usar para dibujar en la pantalla.
*/

@Composable
fun BanderaIsrael(modifier: Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (blancoSup, azulSup, blancoCentral, azulInf, blancoInf) = createRefs()
        val line4 = createGuidelineFromTop(0.09375f)
        val line3 = createGuidelineFromTop(0.25f)
        val line2 = createGuidelineFromBottom(0.25f)
        val line1 = createGuidelineFromBottom(0.09375f)

        val colorAzul = colorResource(id = R.color.azul_israel)

        Box(modifier = Modifier.background(Color.White).constrainAs(blancoSup)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(line4)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(colorAzul).constrainAs(azulSup)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(line4)
            bottom.linkTo(line3)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(blancoCentral)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(line3)
            bottom.linkTo(line2)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints

        },  contentAlignment = Alignment.Center)
        {
            EstrellaCanvas() //FUNCION DE Componentes.kt
        }


        Box(modifier = Modifier.background(colorAzul).constrainAs(azulInf)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(line2)
            bottom.linkTo(line1)

            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(blancoInf)
        {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(line1)
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
        BanderaIsrael(modifier = Modifier.fillMaxSize())
    }
}