import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.test.assertEquals


fun getDateDifference(before: String, after: String): String{
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-d")
    val dateBefore = LocalDate.parse(before, formatter)
    val dateAfter = LocalDate.parse(after, formatter)

    Period.between(dateBefore, dateAfter).also { period->
        return "${period.years} Tahun, ${period.months} Bulan, ${period.days} Hari"
    }
}

fun main(){
    val timeBefore = "2008-03-24"
    val timeAfter = "2010-06-26"

    val expectedOutput = "2 Tahun, 3 Bulan, 2 Hari"

    val actualOutput = getDateDifference(timeBefore, timeAfter)

    print("Result: $actualOutput")
    assertEquals(expectedOutput, actualOutput, message = "Task Failed!")
}