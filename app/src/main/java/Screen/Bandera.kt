package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import com.example.banderas.ui.theme.BanderasTheme

@Composable
fun BanderaEstadosUnidos(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        Column (modifier = Modifier.fillMaxSize()) {
            repeat(13) { index -> //Repeat como si fuera un FOR, index es el contador
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(
                            if (index % 2 == 0) colorResource(id = R.color.rojo_EUA) else Color.White //La operacion es para saber si es par o impar mediante residuo
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxHeight(7f / 13f) // 7/13 de ancho
                .fillMaxWidth(.4f) // 40% de altura
                .background(colorResource(id = R.color.azul_EUA))
                .align(Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            Row (
                modifier = Modifier.fillMaxSize()
            ) {
                repeat(11) { index ->

                    if (index % 2 == 0 )
                        C1(modifier = Modifier.weight(1f))
                    else C2(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}
/* LOGICA DEL BOX AZUL
    6 columnas de C1 (con 5 estrellas): 6 X 5 = 30 estrellas
    5 columnas de C2 (con 4 estrellas): 5 X 4 = 20 estrellas
    Total = 50 estrellas
*/



@Composable
fun C1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            items(5) {
                Image(
                    painter = painterResource(id = R.drawable.star_24px),
                    contentDescription = "Estrella",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun C2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            items(4) {
                Image(
                    painter = painterResource(id = R.drawable.star_24px),
                    contentDescription = "Estrella",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaEstadosUnidos()
    }
}


/* NOTAS PERSONALES
Column (Columna): Apila sus elementos verticalmente (uno debajo de otro, hacia abajo).
Row (Fila): Acomoda sus elementos horizontalmente (uno al lado de otro, de izquierda a derecha).
 */