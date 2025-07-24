import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MensajeSecreto() {
    var mostrarMensaje by remember { mutableStateOf(false) }
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { mostrarMensaje = !mostrarMensaje }
        ) {
            Text("Revelar Secreto")
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        if (mostrarMensaje) {
            Text(
                text = "Mensaje secreto",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}