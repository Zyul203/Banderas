package Screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.isDebugInspectorInfoEnabled
import androidx.compose.ui.res.colorResource
import com.example.banderas.R


@Composable
fun Bandera(modifier : Modifier = Modifier) {
    val azul = colorResource(id = R.color.azul_reino)


    Box(modifier = Modifier.fillMaxSize().background(azul))
    {
        Canvas(modifier = Modifier.fillMaxSize())
        {
            val w = size.width
            val h = size.height
            val strokeDiagonal_Blanca = 150f
            val strokeCruz_Blanca = 250f
            val strokeDiagonal_Roja = 50f
            val strokeCruz_Rojo = 120f

            // ----- TACHA ---------------------------------

            // 1. Diagonal de esquina superior izquierda a inferior derecha
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = strokeDiagonal_Blanca,
                cap = StrokeCap.Square // Extiende los bordes para cubrir tdo el margen
            )

            // 2. Diagonal de esquina inferior izquierda a superior derecha
            drawLine(
                color = Color.White,
                start = Offset(0f, h),
                end = Offset(w, 0f),
                strokeWidth = strokeDiagonal_Blanca,
                cap = StrokeCap.Square
            )

            drawLine(
                color = Color.Red,
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = strokeDiagonal_Roja,
                cap = StrokeCap.Square
            )

            // 6. Diagonal roja (inferior izquierda a superior derecha)
            drawLine(
                color = Color.Red,
                start = Offset(0f, h),
                end = Offset(w, 0f),
                strokeWidth = strokeDiagonal_Roja,
                cap = StrokeCap.Square
            )

            // 3. Cruz central vertical
            drawLine(
                color = Color.White,
                start = Offset(w / 2f, 0f),
                end = Offset(w / 2f, h),
                strokeWidth = strokeCruz_Blanca,
                cap = StrokeCap.Square
            )

            // 4. Cruz central horizontal
            drawLine(
                color = Color.White,
                start = Offset(0f, h / 2f),
                end = Offset(w, h / 2f),
                strokeWidth = strokeCruz_Blanca,
                cap = StrokeCap.Square
            )

// ==========================================
            // LÍNEAS ROJAS (SUPERPUESTAS)
            // ==========================================

            // 5. Diagonal roja (superior izquierda a inferior derecha)


            // 7. Cruz central roja vertical
            drawLine(
                color = Color.Red,
                start = Offset(w / 2f, 0f),
                end = Offset(w / 2f, h),
                strokeWidth = strokeCruz_Rojo,
                cap = StrokeCap.Square
            )

            // 8. Cruz central roja horizontal
            drawLine(
                color = Color.Red,
                start = Offset(0f, h / 2f),
                end = Offset(w, h / 2f),
                strokeWidth = strokeCruz_Rojo,
                cap = StrokeCap.Square
            )
        }

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        Bandera()
    }
}

