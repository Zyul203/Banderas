package Screen

import Components.Escudo
import Components.Estrellas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun Bandera(modifier : Modifier = Modifier)
{
    ConstraintLayout(modifier = Modifier.fillMaxSize())
    {
        val (canvasBandera, estrellaSup, estrellaInf, estrellaIzq, estrellaDer, estrellaChica, escudo) = createRefs()

        // Líneas guía para las 5 Estrellas (Dividí las medidas de la Rama normal entre 2 para las medidas
        // Eje X
        val xEstrellaCentro = createGuidelineFromStart(0.25f)
        val xEstrellaIzq = createGuidelineFromStart(0.20f)
        val xEstrellaDer = createGuidelineFromStart(0.30f)
        val xEstrellaChica = createGuidelineFromStart(0.275f)

        // Eje Y
        val yEstrellaSup = createGuidelineFromTop(0.45f)
        val yEstrellaInf = createGuidelineFromTop(0.90f)
        val yEstrellaMedias = createGuidelineFromTop(0.65f)
        val yEstrellaChica = createGuidelineFromTop(0.775f)

        // Líneas guía para el Escudo
        val xEscudo = createGuidelineFromStart(0.66f)
        val yEscudo = createGuidelineFromTop(0.42f)

        // --- CANVAS ---
        Canvas (modifier = modifier.constrainAs(canvasBandera)
        {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        {
            val w = size.width
            val h = size.height

            // TRIANGULO NEGRO
            val pathNegro = Path().apply {
                //moveTo(0f,0f) Si no pones el moveTo por defecto el inicio se colocará en (0,0)
                lineTo(0f , h) //Esquina Sup
                lineTo(w, h) //Esquina Inf
                close()
            }
            drawPath(path = pathNegro, color = Color.Black)

            //TRIANGULO ROJO
            val pathRojo = Path().apply {
                lineTo(w , 0f)
                lineTo(w, h)
                close()
            }
            drawPath(path = pathRojo, color = Color.Red)
        }

        // --- ESTRELLAS POSICIONADAS CON LINEAS GUIAS ---
        Estrellas(
            size = 60.dp,
            modifier = Modifier.constrainAs(estrellaSup)
            {
                start.linkTo(xEstrellaCentro)
                end.linkTo(xEstrellaCentro)
                top.linkTo(yEstrellaSup)
                bottom.linkTo(yEstrellaSup)
            }
        )

        // 2. Estrella Inferior
        Estrellas(
            size = 60.dp,
            modifier = Modifier.constrainAs(estrellaInf)
            {
                start.linkTo(xEstrellaCentro)
                end.linkTo(xEstrellaCentro)
                top.linkTo(yEstrellaInf)
                bottom.linkTo(yEstrellaInf)
            }
        )

        // 3. Estrella Izquierda
        Estrellas(
            size = 60.dp,
            modifier = Modifier.constrainAs(estrellaIzq)
            {
                start.linkTo(xEstrellaIzq)
                end.linkTo(xEstrellaIzq)
                top.linkTo(yEstrellaMedias)
                bottom.linkTo(yEstrellaMedias)
            }
        )

        // 4. Estrella Derecha
        Estrellas(
            size = 60.dp,
            modifier = Modifier.constrainAs(estrellaDer)
            {
                start.linkTo(xEstrellaDer)
                end.linkTo(xEstrellaDer)
                top.linkTo(yEstrellaMedias)
                bottom.linkTo(yEstrellaMedias)
            }
        )

        // 5. Estrella Chiquita
        Estrellas(
            size = 30.dp,
            modifier = Modifier.constrainAs(estrellaChica)
            {
                start.linkTo(xEstrellaChica)
                end.linkTo(xEstrellaChica)
                top.linkTo(yEstrellaChica)
                bottom.linkTo(yEstrellaChica)
            }
        )

        //5. Escudo
        Escudo(modifier = Modifier.constrainAs(escudo)
        {
            start.linkTo(xEscudo)
            end.linkTo(xEscudo)
            top.linkTo(yEscudo)
            bottom.linkTo(yEscudo)
        })
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

