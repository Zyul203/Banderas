package Components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.banderas.R
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

/*
Las funciones helper (o funciones de apoyo/auxiliares) son funciones comunes en código
cuya única tarea es realizar un cálculo,
transformar datos o resolver una lógica específica para reutilizarla en varias partes del programa.

### trianglePath es una función helper porque su único trabajo es hacer operaciones matemáticas
(calcular ángulos, cosenos, senos y coordenadas $x, y$) para devolver una figura geométrica de tipo Path.

Las funciones helper (auxiliares) son funciones puras de programación cuyo objetivo principal
es procesar datos y devolver un resultado (return). No modifican ni muestran la interfaz directamente.
Toman entradas (parámetros) y devuelven una salida calculada (Path, String, Float, List, etc.).
*/

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path
{
    val path = Path()
    for (i in 0..2) {
        val angle = (rotationDeg + i * 120f) * (PI.toFloat() / 180f)
        val x = cx + r * cos(angle)
        val y = cy + r * sin(angle)

        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun EstrellaCanvas(modifier: Modifier = Modifier)
{
    val colorAzul = colorResource(R.color.azul_israel)

    Canvas(modifier = Modifier.size(250.dp)) //Crea un cuadro invisible de dibujo de 250 dp centrado en la pantalla donde se trazará la estrella.
    {
        val radius = size.minDimension / 3f
        val cx = size.width / 2f
        val cy = size.height / 2f
        val strokeWidth = 40f //GROSOR DE LOS TRIANGULOS

        // Triángulo 1 apuntando hacia arriba (-90°)
        val path1 = trianglePath(cx, cy, radius, -90f)
        drawPath(
            path = path1,
            color = colorAzul,
            style = Stroke(width = strokeWidth)
        )

        // Triángulo 2 apuntando hacia abajo (90°)
        val path2 = trianglePath(cx, cy, radius, 90f)
        drawPath(
            path = path2,
            color = colorAzul,
            style = Stroke(width = strokeWidth)
        )
    }
}

/*
NOTAS PERSONALES
* size: Es una variable propia dentro del Canvas que contiene el ancho (size.width)
    y alto (size.height) del lienzo en píxeles
* cx y cy: Calculan el punto centro horizontal (cx) y vertical (cy)
    del Canvas dividiendo sus dimensiones a la mitad.
* radius: Es el radio del círculo imaginario donde se van a colocar las tres puntas de cada triángulo.
    Usa minDimension / 2f para asegurarse de aprovechar el máximo espacio del Canvas sin salirse.

* trianglePath(cx, cy, radius, -90f): Llama a tu función helper. Al pasarle -90f en la rotación,
    calcula las coordenadas vectoriales para que la punta principal del triángulo señale hacia arriba.
* drawPath(...): Ejecuta la acción física de pintar sobre el Canvas.
    * path = path1: Usa el trazo calculado.
    * color = colorAzul: Asigna el color azul oficial.
    * style = Stroke(width = strokeWidth): Indica que no pinte un triángulo sólido relleno,
        sino únicamente su borde/contorno externo con el grosor definido (Stroke).
 */