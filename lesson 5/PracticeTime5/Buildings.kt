
open class BaseBuildingMaterial(val numberNeeded: Int = 1)


class Wood : BaseBuildingMaterial(4)


class Brick : BaseBuildingMaterial(8)



class Building<T : BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("${material::class.simpleName}: $actualMaterialsNeeded items needed")
    }
}
