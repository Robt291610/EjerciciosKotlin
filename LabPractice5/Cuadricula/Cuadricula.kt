import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CuadriculaSimple() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp) 
    ) {
        Row(modifier = Modifier.weight(1f)) {
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = Color.Red
            ) {}

            Surface(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = Color.Green
            ) {}
        }

        Row(modifier = Modifier.weight(1f)) {
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = Color.Blue
            ) {}

            Surface(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = Color.Yellow
            ) {}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaCuadriculaSimple() {
    CuadriculaSimple()
}
