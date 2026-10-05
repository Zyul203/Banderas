package com.example.banderas

import Screen.BanderaCuba
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaCuba(modifier = Modifier.padding(innerPadding),)
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BanderaPreview() {
    BanderasTheme {
        BanderaCuba()
    }
}

/* NOTAS IMPORTANTES
* enableEdgeToEdge() despliega en pantalla completa:
    Esta función de Android le ordena a la aplicación extenderse por debajo de las barras del sistema
    (donde está la hora, batería, cámara "notch" y la barra de navegación inferior).
* Scaffold y innerPadding te protegen de esas áreas:
    Para evitar que tu diseño choque o se quede tapado por la hora o la batería,
    el contenedor Scaffold en el MainActivity te calcula una zona segura llamada innerPadding
 */