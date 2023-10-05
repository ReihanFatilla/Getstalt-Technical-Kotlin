import kotlin.test.assertEquals


fun generateHalfPyramid(): String {
    return StringBuilder().also { stringBuilder ->
        repeat(10) {
            val index = it + 1
            stringBuilder.append(
                if (index < 6) {
                    "${("0".repeat(index))}${index}\n"
                } else {
                    "${(index).toString().replace("0","")}${("0".repeat(index))}\n"
                }
            )
        }
    }.toString().trimEnd()
}

fun main() {
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
    assertEquals(expectedOutput, actualOutput)
}