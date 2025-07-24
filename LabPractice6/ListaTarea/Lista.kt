@Composable
fun ListaDeTareas() {
    var nuevaTarea by remember { mutableStateOf("") }
    val tareas = remember { mutableStateListOf<String>() }

    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = nuevaTarea,
                onValueChange = { nuevaTarea = it },
                modifier = Modifier.weight(1f),
                label = { Text("Nueva tarea") }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    if (nuevaTarea.isNotBlank()) {
                        tareas.add(nuevaTarea)
                        nuevaTarea = ""
                    }
                }
            ) {
                Text("Añadir")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(tareas) { tarea ->
                Text(text = tarea, modifier = Modifier.padding(4.dp))
            }
        }
    }
}
