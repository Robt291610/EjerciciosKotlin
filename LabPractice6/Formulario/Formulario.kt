import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormularioSimple() {
    var texto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Escribe algo") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            enabled = texto.isNotEmpty()
        ) {
            Text("Enviar")
        }
    }
}
