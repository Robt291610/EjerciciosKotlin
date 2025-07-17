import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TarjetaDeNoticia(
    titular: String,
    autor: String,
    fecha: String,
    resumen: String
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .border(1.dp, Color.Gray)
            .padding(16.dp)
    ) {
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(12.dp))

        
        Text(
            text = titular,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = autor, fontSize = 14.sp, color = Color.DarkGray)

            Spacer(modifier = Modifier.weight(1f))

            Text(text = fecha, fontSize = 14.sp, color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(8.dp))

        
        Text(text = resumen, fontSize = 16.sp)



        fun VistaPreviaTarjetaDeNoticia() {
        TarjetaDeNoticia(
        titular = "Jetpack Compose revoluciona el desarrollo Android",
        autor = "Robert Dev",
        fecha = "17 Jul 2025",
        resumen = "Jetpack Compose permite crear interfaces modernas de forma rápida y sencilla gracias a su enfoque declarativo."
    )
}
    }
}
