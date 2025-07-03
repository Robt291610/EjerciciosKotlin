interface Impresora {
    fun imprimir(documento: String)
}


interface Escaner {
    fun escanear(): String
}


class ImpresoraLaser : Impresora {
    override fun imprimir(documento: String) {
        println("Imprimiendo con impresora láser: $documento")
    }
}


class EscanerDeCamaPlana : Escaner {
    override fun escanear(): String {
        return "Documento escaneado desde escáner de cama Plana."
    }
}


class Multifuncional(
    impresora: Impresora,
    escaner: Escaner
) : Impresora by impresora, Escaner by escaner


fun main() {
    val impresora = ImpresoraLaser()
    val escaner = EscanerDeCamaPlana()

    val multifuncional = Multifuncional(impresora, escaner)

    multifuncional.imprimir("Informe financiero 2025")

    val resultadoEscaneo = multifuncional.escanear()
    println(resultadoEscaneo)
}
