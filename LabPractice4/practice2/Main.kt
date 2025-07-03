sealed class ResultadoAPI {
    data class Exito(val datos: String) : ResultadoAPI()
    data class Error(val mensaje: String) : ResultadoAPI()
    object Cargando : ResultadoAPI()
}


fun procesarResultado(resultado: ResultadoAPI) {
    when (resultado) {
        is ResultadoAPI.Exito -> println(resultado.datos)
        is ResultadoAPI.Error -> println(resultado.mensaje)
        ResultadoAPI.Cargando -> println("Cargando datos...")
    }
}


fun main() {
    val resultadoExito = ResultadoAPI.Exito("Datos recibidos correctamente.")
    val resultadoError = ResultadoAPI.Error("No se pudo conectar al servidor.")
    val resultadoCargando = ResultadoAPI.Cargando

    procesarResultado(resultadoExito)
    procesarResultado(resultadoError)
    procesarResultado(resultadoCargando)
}
