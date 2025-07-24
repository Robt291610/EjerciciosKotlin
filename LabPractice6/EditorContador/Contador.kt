@Composable
fun EditorDeTextoConContador() {
    var texto by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("ContadorDeCaracteres") },
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "${texto.length} / 140",
            modifier = Modifier.align(Alignment.End),
            style = MaterialTheme.typography.bodySmall
        )
    }
}
