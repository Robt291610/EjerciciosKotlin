import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Text(
            text = "Bienvenido",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

       
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .border(1.dp, Color.Gray),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "Usuario",
                modifier = Modifier.padding(start = 12.dp),
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .border(1.dp, Color.Gray),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "Contraseña",
                modifier = Modifier.padding(start = 12.dp),
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .padding(horizontal = 24.dp, vertical = 12.dp)
        ) {
            Text(
                text = "Iniciar Sesión",
                color = Color.White,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaPantallaLogin() {
    PantallaLogin()
}
