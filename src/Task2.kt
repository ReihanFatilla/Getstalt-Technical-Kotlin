import kotlin.test.assertEquals

fun generateHalfPyramid(): String{

}

fun main(){
    val array = arrayListOf("Volvo","BMW","Toyota","Kijang")

    val expectedOutput = """
        01
        002
        0003
        00004
        000005
        6000000
        70000000
        800000000
        9000000000
        10000000000
    """.trimIndent()

    val actualOutput = generateHalfPyramid()

    print(actualOutput)
    assertEquals(expectedOutput, actualOutput, message = "Task Passed!")
}