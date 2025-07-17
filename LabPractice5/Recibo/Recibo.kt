import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReciboCompleto()
            
        }
    }
}

@Composable
fun ItemDeRecibo(nombre: String, precio: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(text = nombre, fontSize = 16.sp)

        Spacer(modifier = Modifier.weight(1f)) 

        Text(text = precio, fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun ReciboCompleto() {
    Column(modifier = Modifier.padding(16.dp)) {
        ItemDeRecibo(nombre = "Café Americano", precio = "$2.50")
        ItemDeRecibo(nombre = "Croissant", precio = "$1.75")
        ItemDeRecibo(nombre = "Jugo Natural", precio = "$3.00")
        ItemDeRecibo(nombre = "Galletas", precio = "$1.25")
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaRecibo() {
    ReciboCompleto()
}
