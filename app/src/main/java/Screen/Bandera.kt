package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
fun BanderaMexico(modifier: Modifier = Modifier)
{
    Row (modifier = modifier.fillMaxSize()) {
        Box( //Verde
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(colorResource(id = R.color.verde_mexico))
        )
        Box( //Blanco
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.mexico_escudo),
                contentDescription = "escudo mexico",
                modifier = Modifier.size(80.dp)
            )
        }
        Box( //Rojo
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red)
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview()
{
    BanderasTheme {
        BanderaMexico()
    }
}


/* NOTAS PERSONALES:
@Preview(showBackground = true, showSystemUi = true) 1.Ver Contenido, 2. Mostrar el UI del celular

Estructura principal y parámetros
fun BanderaMexico(...): Función Compose (Composable Function). Debe llevar la anotación @Composable arriba para que Jetpack Compose la reconozca como un elemento de UI.
modifier: Modifier = Modifier: Parámetro de función con un valor por defecto. Es la buena práctica oficial en Compose para permitir que quien llame a BanderaMexico aplique estilos externos (como márgenes o tamaños específicos).

Contenedores y componentes de UI
Row: Función Composable (Layout). Coloca a todos sus elementos hijos en una sola línea horizontal (uno al lado del otro).
Box: Función Composable (Layout). Funciona como un contenedor simple o marco. Permite apilar elementos unos sobre otros o rellenar áreas de color.
Image: Función Composable. Dibuja un recurso gráfico o imagen en la pantalla.

Funciones modificadoras (Extension Methods de Modifier)Los modificadores alteran la apariencia o el comportamiento de los componentes:
.fillMaxSize(): Metodo de extensión de Modifier. Le indica a la Row que ocupe el 100% del ancho y alto disponible de su contenedor padre.
.weight(1f): Metodo de extensión de RowScope. Distribuye el espacio horizontal de la Row. Como los 3 Box tienen weight(1f), Compose divide la anchura en partes iguales ($1 + 1 + 1 = 3$), dándole a cada Box un tercio ($33.3\%$) del ancho total.
.fillMaxHeight(): Metodo de extensión de Modifier. Estira cada Box para que ocupe tdo el alto vertical de la Row.
.background(...): Metodo de extensión de Modifier. Pinta el fondo del contenedor con el color especificado.
.size(80.dp): Metodo de extensión de Modifier. Establece tanto el ancho como el alto de la Image fijándolo en 80 Density-independent Pixels (dp).

Parámetros de configuración y recursos
contentAlignment = Alignment.Center: Parámetro del Box. Define cómo se alinean sus hijos internos. Alignment.Center es un Objeto Singleton que posiciona la imagen justo en el centro exacto (tanto horizontal como verticalmente).
    painter = painterResource(id = R.drawable.mexico_escudo):
    painter: Parámetro de Image. Acepta un dibujador gráfico.
    painterResource(...): Función Composable helper. Carga una imagen rasterizada (PNG/JPG) o un VectorDrawable guardado en la carpeta res/drawable.
R.drawable.mexico_escudo: Identificador de recurso (Int estático) generado automáticamente por Android Studio.
colorResource(id = R.color.verde_mexico): Función Composable helper. Lee un color definido en el archivo res/values/colors.xml.
Color.White / Color.Red: Propiedades estáticas del objeto Color. Representan colores estándar integrados directamente en Compose sin necesidad de leer archivos XML.
contentDescription = "escudo": Parámetro de Image (de tipo String?). Texto accesible que leen los lectores de pantalla (como TalkBack) para usuarios con discapacidad visual.
 */