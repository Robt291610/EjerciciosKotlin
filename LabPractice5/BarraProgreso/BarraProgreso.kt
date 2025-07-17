import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BarraDeProgreso(progreso: Float) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(16.dp)
            .background(Color.LightGray)  
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progreso.coerceIn(0f, 1f)) 
                .fillMaxHeight()
                .background(Color.Blue) 
        )
    }
}
