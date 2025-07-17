import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacion()
        }
    }
}

@Composable
fun TarjetaDePresentacion() {
    Column(
        modifier = Modifier
            .padding(24.dp)  
    ) {
        Text(
            text = "Robert Alexander",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Desarrollador Android Jr.",
            fontSize = 18.sp,
            color = Color.Gray
        )
        Text(
            text = "robert@gmail.com",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaTarjeta() {
    TarjetaDePresentacion()
}
