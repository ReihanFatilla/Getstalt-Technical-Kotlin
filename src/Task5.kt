import java.text.NumberFormat
import java.util.*
import kotlin.test.assertEquals

fun generatePecahan(uang: String): String {
    return StringBuilder().also {

    }.toString()
}

fun Int.toRupiah(): String{
    val localeID =  Locale("in", "ID")

    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    numberFormat.maximumFractionDigits = 0

    return numberFormat.format(this).toString()
}

fun String.fromRupiah(): Int {
    val cleanRupiah = replace("[^\\d]".toRegex(), "")

    return cleanRupiah.toInt()
}

fun main(){
    val uang = "Rp1.586.000"

    val expectedOutput = """
        Rp100.000 = 15
        Rp50.000 = 1
        Rp20.000 = 1
        Rp10.000 = 1
        Rp5.000 = 1
        Rp1.000 = 1
    """.trimIndent()

    val actualOutput = generatePecahan(uang)

    print("result: ${(1000).toRupiah()}")
//    assertEquals(expectedOutput, actualOutput)
}
