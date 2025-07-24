import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TarjetaExpandible() {
    var expandido by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(1.dp, Color.Gray)
            .clickable { expandido = !expandido }
            .padding(16.dp) 
    ) {
        Text(
            text = "Título de la tarjeta",
            fontSize = 18.sp,
            color = Color.Black
        )

        if (expandido) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Este es el contenido detallado que solo se muestra cuando la tarjeta está expandida.",
                fontSize = 14.sp,
                color = Color.DarkGray
            )
        }
    }
}
