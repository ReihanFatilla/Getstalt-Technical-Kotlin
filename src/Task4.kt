import kotlin.test.assertEquals

fun generateDataInfo(data: Map<String, Map<String, String>>): String {
    return StringBuilder().also { stringBuilder ->
        data.onEachIndexed { index, orang ->
            stringBuilder.append("Orang ${index+1}\nNama: ${orang.key}\n")
            orang.value.forEach { value ->
                stringBuilder.append("${value.key}: ${value.value}\n")

            }
            if(!orang.value.keys.contains("hp")) {
                stringBuilder.append("hp: Tidak Memiliki No Handphone\n")
            }
            stringBuilder.append("\n")
        }
    }.toString().trim()
}

fun main(){
    val dataDiri = mapOf(
        "Bimo Nasuti" to mapOf(
            "mob" to "654544455",
            "email" to "bimonasuti@gmail.com",
            "hp" to "08123456787"
        ),
        "Bimo Nasutia" to mapOf(
            "mob" to "1231354897",
            "email" to "bombomi@gmail.com"
        ),
        "Yuni Salam" to mapOf(
            "mob" to "512512662",
            "email" to "yunisalam@gmail.com",
            "hp" to "08123456787"
        )
    )

    val expectedOutput = """
        Orang 1
        Nama: Bimo Nasuti
        mob: 654544455
        email: bimonasuti@gmail.com
        hp: 08123456787
        
        Orang 2
        Nama: Bimo Nasutia
        mob: 1231354897
        email: bombomi@gmail.com
        hp: Tidak Memiliki No Handphone
        
        Orang 3
        Nama: Yuni Salam
        mob: 512512662
        email: yunisalam@gmail.com
        hp: 08123456787
    """.trimIndent()


    val actualOutput = generateDataInfo(dataDiri)

    print("result: $actualOutput")
    assertEquals(expectedOutput, actualOutput)
}
