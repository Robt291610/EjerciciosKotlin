@Composable
fun AppDeSaludos() {
    var nombre by remember { mutableStateOf("") }
    var saludo by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Ingresa tu nombre") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            saludo = "¡Hola, $nombre!"
        }) {
            Text("Saludar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = saludo)
    }
}
