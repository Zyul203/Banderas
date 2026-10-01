package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier)
{
    ConstraintLayout(modifier = modifier)
    {
        val (fondo,star) = createRefs()
        val lineaStarVertical = createGuidelineFromStart(.55f)
        val lineaStarHorizontal = createGuidelineFromTop(.55f)
        val colorRojo = colorResource(id = R.color.rojo_turquia)

        Box(
            modifier = Modifier
                .background(colorRojo)
                .constrainAs(fondo)
                {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )   {
                Canvas(modifier = modifier.fillMaxSize()) //El modificador fillMaxSize() indica que el lienzo ocupará tdo el ancho y alto disponible en pantalla dentro de su contenedor.
                {
                    drawRect(color = colorRojo) // Dibuja un rectángulo que cubre tdo el lienzo con el color guardado en colorRojo
                    val cy = size.height / 2f //Centro vertical del lienzo
                    val radio = size.height * 0.30f //Es el radio del círculo
                    drawCircle(
                        color = Color.White, radius = radio,
                        center = Offset(
                            size.width * 0.38f,
                            cy
                        ) //Centro ubicado horizontalmente al 38& del ancho
                    )
                    drawCircle(
                        color = colorRojo, radius = size.height * 0.24f,
                        center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
                    )
                }
        }

        Image( //ESTRELLA
            painter = painterResource(R.drawable.star_24px),
            contentDescription = "Estrella",
            modifier = Modifier
                .size(120.dp)
                .rotate(45f)
                .constrainAs(star) {
                    // Anclamos arriba, abajo, izquierda y derecha a las Guías para que el CENTRO de la estrella coincida con el cruce de guías
                    top.linkTo(lineaStarHorizontal)
                    bottom.linkTo(lineaStarHorizontal)
                    start.linkTo(lineaStarVertical)
                    end.linkTo(lineaStarVertical)
                }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaTurquia(modifier = Modifier.fillMaxSize())
    }
}