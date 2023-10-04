import kotlin.test.assertEquals

fun generateLoopPattern(array: Array<String>): Array<Array<String>>{

}

fun main(){
    val array = arrayOf("Volvo","BMW","Toyota","Kijang")

    val expectedOutput = arrayOf(
        arrayOf("Volvo","BMW","Toyota","Kijang"),
        arrayOf("BMW","Volvo","Toyota","Kijang"),
        arrayOf("Toyota","Volvo","BMW","Kijang"),
        arrayOf("Kijang","Toyota","Volvo","BMW"),
    )

    val actualOutput = generateLoopPattern(array)

    print("result: $actualOutput")
    assertEquals(expectedOutput, actualOutput)
}