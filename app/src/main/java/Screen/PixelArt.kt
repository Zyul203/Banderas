package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.example.banderas.R
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension



// Estructura de datos para definir un píxel manual (columna, fila, color)
data class PixelDato( //data class: Es una clase especial diseñada para almacenar datos
    val col: Int,
    val row: Int,
    val color: Color
)

@Composable
fun PixelArt(modifier: Modifier = Modifier.fillMaxSize(), gridSize: Int = 45) {

    val c1 = colorResource(id = R.color.white)
    val c2 = colorResource(id = R.color.black)
    val c3 = colorResource(id = R.color.gris)
    val rojo = colorResource(id = R.color.rojo)
    val naranja = colorResource(id = R.color.naranja)
    val naranjaClaro = colorResource(id = R.color.naranja2)
    val amarillo = colorResource(id = R.color.amarillo)
    val azulMedio = colorResource(id = R.color.azul1)
    val azulClaro = colorResource(id = R.color.azul2)
    val azulFuerte = colorResource(id = R.color.azul3)
    val verdeAzul = colorResource(id = R.color.azul4)
    val cremaClaro = colorResource(id = R.color.crema)
    val cremaFuerte = colorResource(id = R.color.crema2)
    val cafeClaro = colorResource(id = R.color.cafe1)
    val cafeFuerte = colorResource(id = R.color.cafe2)

//42*42
    Row(modifier = Modifier.fillMaxWidth().aspectRatio(1f))
    {
        Column(modifier = modifier.weight(1f).fillMaxSize()) //C1
        {
            Box(modifier = Modifier.weight(17f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
        }

        Column(modifier = modifier.weight(1f).fillMaxSize())//C2
        {
            Box(modifier = Modifier.weight(15f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))

        }

        Column(modifier = modifier.weight(1f).fillMaxSize())//C3
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C4
        {
            Box(modifier = Modifier.weight(13f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
        }
        Column (modifier = modifier.weight(1f).fillMaxSize())//C5
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C6
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C7
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(13f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C8
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(13f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C9
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C10
        {
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C11
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c3))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C12
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c3))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C13
        {
            Box(modifier = Modifier.weight(12f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C14
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C15
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C16
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(azulFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cremaFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeFuerte))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
        }


        Column (modifier = modifier.weight(1f).fillMaxSize())//C17
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cafeClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
        }
//aqidsadasdsad
        Column (modifier = modifier.weight(1f).fillMaxSize())//C18
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C19
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C20
        {
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C21
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C22
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C23
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C24
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(11f).fillMaxSize().background(azulMedio))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C25
        {
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(amarillo))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C26
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C27
        {
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranjaClaro))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C28
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(11f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(amarillo))



            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C29
        {
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(amarillo))


            Box(modifier = Modifier.weight(3f).fillMaxSize().background(azulClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(cremaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c2))
            Box(modifier = Modifier.weight(13f).fillMaxSize().background(c1))
        }
    //YA
        Column (modifier = modifier.weight(1f).fillMaxSize())//C30
        {
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(amarillo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(amarillo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(15f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C31
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(amarillo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(15f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C32
        {
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranjaClaro))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(15f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C33
        {
            Box(modifier = Modifier.weight(10f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(16f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C34
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(6f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(7f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(16f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C35
        {
            Box(modifier = Modifier.weight(9f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(16f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C36
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(16f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C37
        {
            Box(modifier = Modifier.weight(8f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(5f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(16f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C38
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(21f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C39
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(naranja))
            Box(modifier = Modifier.weight(4f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(22f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C40
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(2f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(22f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C41
        {
            Box(modifier = Modifier.weight(14f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(3f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(23f).fillMaxSize().background(c1))
        }

        Column (modifier = modifier.weight(1f).fillMaxSize())//C42
        {
            Box(modifier = Modifier.weight(18f).fillMaxSize().background(c1))
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(rojo))
            Box(modifier = Modifier.weight(23f).fillMaxSize().background(c1))
        }


    }


}



@Preview(showBackground = true)
@Composable
fun PixelArtPreview() {
    PixelArt()
}