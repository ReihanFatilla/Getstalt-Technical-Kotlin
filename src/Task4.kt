import kotlin.test.assertEquals

fun generateDataInfo(data: Map<String, Map<String, String>>): String {
    data
}

fun main(){
    val dataDiri = mapOf(
        "Bimo Nasuti" to mapOf(
            "mob" to "654544455",
            "email" to "bimonasuti@gmail.com",
            "hp" to "08123456787"
        ),
        "Bimo Nasuti" to mapOf(
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
        Nama: Bimo Nasuti
        mob: 1231354897
        email: bombomi@gmail.com
        
        Orang 3
        mob: 512512662
        email: yunisalam@gmail.com
        hp: 08123456787
    """.trimIndent()

    val actualOutput = generateDataInfo(dataDiri)
    assertEquals(expectedOutput, actualOutput)
}
