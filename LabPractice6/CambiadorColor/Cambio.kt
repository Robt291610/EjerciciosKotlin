import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun CambiadorDeColor() {
    var color by remember { mutableStateOf(Color.Gray) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            color = Color(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
        }) {
            Text("Cambiar Color")
        }
    }
}
