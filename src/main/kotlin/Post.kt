fun main() {
    val acl = A()
    val sad = A(x = 4, c = "rty")
    val erru = A(6, 8, "ghj")
    val tru = A(12, 54, c = "num")
    val arr = arrayOf(acl, sad, erru, tru)
    for ((z, x, _, v) in arr) {
        println("z=$z x=$x  v=$v")
    }
    val (q, e, _, r) = acl
    val comp = acl.component2()
    println(acl)
    println("q=$q e=$e r=$r comp= $comp")
    println(acl.toString())
}

data class A(
    val z: Int = 1,
    val x: Int = 3,
    val c: String = "C",
    val v: String = "v"
)
