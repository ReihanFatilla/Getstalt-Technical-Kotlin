import java.util.Currency
import kotlin.test.assertEquals

fun generatePecahan(uang: String): String {
    return StringBuilder().also {

    }.toString()
}

fun main(){
    val uang = "Rp. 1.586.000"

    val expectedOutput = """
        Rp. 100.000 = 15
        Rp. 50.000 = 1
        Rp. 20.000 = 1
        Rp. 10.000 = 1
        Rp. 5.000 = 1
        Rp. 1.000 = 1
    """.trimIndent()

    val actualOutput = generatePecahan(uang)

    print("result: ${actualOutput}")
    assertEquals(expectedOutput, actualOutput)
}
