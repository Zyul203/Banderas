package Components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import java.nio.file.Files.size
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import androidx.compose.foundation.Canvas
import androidx.compose.ui.res.colorResource
import com.example.banderas.R


fun starPath(
    cx: Float,
    cy: Float,
    rOuter: Float,
    rInner: Float,
    puntas: Int
): Path
{
    val path = Path()
    val totalPuntos = puntas * 2
    val pasoAngulo = (2 * PI / totalPuntos).toFloat()

    for (i in 0 until totalPuntos) {
        val angulo = i * pasoAngulo - (PI / 2).toFloat() // Apunta la primera punta hacia arriba
        val r = if (i % 2 == 0) rOuter else rInner
        val x = cx + r * cos(angulo)
        val y = cy + r * sin(angulo)

        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}
@Composable
fun figuras(modifier: Modifier = Modifier.fillMaxSize()) {
    val rojo = colorResource(id = R.color.rojo_nepal)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        // ==========================================
        // 1. LUNA
        // ==========================================
        val lunaCx = w * 0.30f
        val lunaCy = h * 0.26f

        // Radio base
        val lunaRadioExt = 84f

        // Círculo blanco de la luna
        drawCircle(
            color = Color.White,
            radius = lunaRadioExt,
            center = Offset(lunaCx, lunaCy)
        )
        // Círculo recortador rojo
        drawCircle(
            color = rojo,
            radius = lunaRadioExt * 0.85f,
            center = Offset(lunaCx, lunaCy - 24f)
        )

        // ==========================================
        // 8 PUNTOS EN ARCO (TRIPLICADOS)
        // ==========================================
        // Distancia del arco
        val radioArco = lunaRadioExt + 30f
        val numPuntosLuna = 8
        val anguloInicio = 200.0
        val anguloFin = 340.0
        val pasoLuna = (anguloFin - anguloInicio) / (numPuntosLuna - 1)

        for (i in 0 until numPuntosLuna) {
            val angRad = Math.toRadians(anguloInicio + i * pasoLuna)
            val px = lunaCx + radioArco * cos(angRad).toFloat()
            val py = lunaCy + radioArco * sin(angRad).toFloat()

            // Radio de las bolitas
            drawCircle(
                color = Color.White,
                radius = 10.5f,
                center = Offset(px, py)
            )
        }

        // ==========================================
        // 2. SOL DE 12 PUNTAS (TRIPLICADO DE TAMAÑO)
        // ==========================================
        val solCx = w * 0.28f
        val solCy = h * 0.72f

        // Radios
        val solRadioExt = 90f
        val solRadioInt = 45f

        val solPath = starPath(
            cx = solCx,
            cy = solCy,
            rOuter = solRadioExt,
            rInner = solRadioInt,
            puntas = 12
        )
        drawPath(solPath, color = Color.White)
    }
}