import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconosSociales() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),  
        horizontalArrangement = Arrangement.SpaceEvenly  
    ) {
        Text(text = "😍", fontSize = 32.sp)
        Text(text = "✂️", fontSize = 32.sp)
        Text(text = "📸", fontSize = 32.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaIconosSociales() {
    IconosSociales()
}
