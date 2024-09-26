package com.example.ejerciciouno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {  // Establece el contenido de la actividad
         Surface(  // Crea una superficie
            modifier = Modifier.fillMaxSize(),  // Modifica el tamaño de la superficie
            color = MaterialTheme.colorScheme.background  // Establece el color de fondo de la superficie
         ) {
            JetpackComposeTutorialScreen()
         }
      }
   }
}

@Composable
fun JetpackComposeTutorialScreen() {  // Función Composable para el diseño de la pantalla
   Column(modifier = Modifier.fillMaxSize()) {  // Columna para organizar elementos verticalmente
      Image(
         painter = painterResource(id = R.drawable.img_tarea_1),
         contentDescription = " Imagen de portada del Jetpack Compose tutorial",
         modifier = Modifier
            .fillMaxWidth(),  // Ajusta el tamaño de la imagen al ancho máximo
         contentScale = ContentScale.FillWidth  // Escala la imagen para que llene el espacio disposable
      )

      // Titulo
      Text(
         text = "Jetpack Compose tutorial",
         fontSize = 24.sp,
         modifier = Modifier
            .padding(16.dp)
      )


      // Primer parrafo
      Text(
         text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
         modifier = Modifier
            .padding(start = 16.dp, end = 16.dp) // Padding solo en los lados (inicio y fin)
            .fillMaxWidth(),  // Ajusta el tamaño del texto al ancho máximo
         textAlign = TextAlign.Justify // Alineación justificada del texto
      )


      // Segundo parrafo
      Text(
         text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
         modifier = Modifier
            .padding(16.dp) // Padding en todos los lados
            .fillMaxWidth(),
         textAlign = TextAlign.Justify
      )
   }
}

@Preview(showBackground = true)
@Composable
fun JetpackComposeTutorialScreenPreview() {
   JetpackComposeTutorialScreen()
}
