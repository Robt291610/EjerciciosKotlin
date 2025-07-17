import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ArticuloSimple() {
    Column(
        modifier = Modifier
            .padding(24.dp)  
    ) {
        Text(
            text = "Usando Jetpack Compose",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))  

        Text(
            text = "Jetpack Compose es una moderna herramienta de UI declarativa para Android que te permite construir interfaces de usuario de forma más simple y con menos código. " +
                   "Permite combinar vistas de forma flexible y actualizarlas de manera reactiva. Gracias a su integración con Kotlin, es posible escribir UIs de forma intuitiva, clara y poderosa."
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaArticuloSimple() {
    ArticuloSimple()
}
