import java.text.NumberFormat
import java.util.*
import kotlin.test.assertEquals

fun generatePecahan(uang: String): String {
    return StringBuilder().also { stringBuilder ->
        var sisaUang = uang.dropLast(4).fromRupiah()
        listOf(100, 50, 20, 10, 5, 1).forEach { nominal ->
            stringBuilder.append(
                "${nominal}000".toRupiah() + " = " + sisaUang / nominal + "\n"
            )
            sisaUang %= nominal
        }
    }.toString().trim()
}

fun String.toRupiah(): String{
    val localeID =  Locale("in", "ID")

    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    numberFormat.maximumFractionDigits = 0

    return numberFormat.format(this.toDouble()).toString()
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

    print(actualOutput)
    assertEquals(expectedOutput, actualOutput)
}
