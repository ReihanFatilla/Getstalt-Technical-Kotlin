import java.text.DateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.test.assertEquals

fun getDateDifference(before: String, after: String): String{

}

fun main(){
    val timeBefore = "2008-03-24"
    val timeAfter = "2010-06-26"

    val expectedOutput = "2 Tahun, 3 Bulan, 4 Hari"

    val actualOutput = getDateDifference(timeBefore, timeAfter)

    print("Result: $actualOutput")
    assertEquals(expectedOutput, actualOutput, message = "Task Failed!")
}