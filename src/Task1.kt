import kotlin.test.assertEquals

fun generateLoopPattern(array: ArrayList<String>): Array<Array<String>>{
    return ArrayList<ArrayList<String>>().also { arrayList ->
        arrayList.add(array)
        repeat(array.size){ index ->
            if(index == 0) return@repeat
            val newArray = arrayList[index - 1].toTypedArray().clone()
            if(index % 3 != 0){
                newArray[0] = arrayList[index - 1][index]
                newArray[index] = arrayList[index - 1][0]
                arrayList.add(newArray.toCollection(ArrayList()))
            } else {
                val arr = newArray.clone().toMutableList()
                arr.add(0, newArray[newArray.size - 1])
                arr.removeLast()
                arrayList.add(arr.toCollection(ArrayList()))
            }

        }
    }.map { it.toTypedArray() }.toTypedArray()
}

fun main(){
    val array = arrayListOf("Volvo","BMW","Toyota","Kijang")

    val expectedOutput = listOf(
        listOf("Volvo","BMW","Toyota","Kijang"),
        listOf("BMW","Volvo","Toyota","Kijang"),
        listOf("Toyota","Volvo","BMW","Kijang"),
        listOf("Kijang","Toyota","Volvo","BMW"),
    )

    val actualOutput = generateLoopPattern(array).map { it.toList() }.toList()

    print("result: ${actualOutput}")
    assertEquals(expectedOutput, actualOutput, message = "Task Failed!")
}


