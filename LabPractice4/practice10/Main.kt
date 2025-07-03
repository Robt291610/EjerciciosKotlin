sealed class ElementoSistema(open val nombre: String)

data class Archivo(
    override val nombre: String,
    val tamañoKB: Int
) : ElementoSistema(nombre)

data class Directorio(
    override val nombre: String,
    val contenidos: MutableList<ElementoSistema> = mutableListOf()
) : ElementoSistema(nombre)

object GestorArchivos {
    fun crearArchivo(nombre: String, tamañoKB: Int): Archivo {
        return Archivo(nombre, tamañoKB)
    }

    fun crearDirectorio(nombre: String): Directorio {
        return Directorio(nombre)
    }
}

fun Directorio.calcularTamañoTotal(): Int {
    var total = 0
    for (elemento in contenidos) {
        total += when (elemento) {
            is Archivo -> elemento.tamañoKB
            is Directorio -> elemento.calcularTamañoTotal()
        }
    }
    return total
}

fun main() {
    val raiz = GestorArchivos.crearDirectorio("Raíz")

    val doc = GestorArchivos.crearDirectorio("Documentos")
    val img = GestorArchivos.crearDirectorio("Imágenes")

    val archivo1 = GestorArchivos.crearArchivo("CV.pdf", 120)
    val archivo2 = GestorArchivos.crearArchivo("Foto1.jpg", 300)
    val archivo3 = GestorArchivos.crearArchivo("Notas.txt", 50)

    doc.contenidos.add(archivo1)
    doc.contenidos.add(archivo3)
    img.contenidos.add(archivo2)

    raiz.contenidos.add(doc)
    raiz.contenidos.add(img)

    println("Tamaño total del directorio raíz: ${raiz.calcularTamañoTotal()} KB")
}
