import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PerfilDeUsuario() {
    Column(
        modifier = Modifier
            .padding(24.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically  
        ) {
            Text(
                text = "🧑‍💻",
                fontSize = 36.sp
            )

            Spacer(modifier = Modifier.width(16.dp))  

            Column {
                Text(
                    text = "RobertDev",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "En línea",
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaPerfilDeUsuario() {
    PerfilDeUsuario()
}
