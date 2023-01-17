package com.example.quiz_o_naire

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
             R.drawable.ic_argentina_flag,
            "Argentina",
            "Morocco",
            "Bangladesh",
            "Oman",
            1
        )

        questionList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this professional athlete?",
            R.drawable.ic_stephen_curry,
            "Lebron James",
            "Chris Paul",
            "Stephen Curry",
            "Seth Curry",
            3
        )

        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_india_flag,
            "Sri Lanka",
            "India",
            "Greece",
            "Qatar",
            2
        )

        questionList.add(que3)

        val que4 = Question(
            4,
            "What city is this famous landmark located?",
            R.drawable.ic_opera_house,
            "New York City, USA",
            "Paris, France",
            "Dubai, UAE",
            "Sydney, Australia",
            4
        )

        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this animal, that went extinct back in the 1930s?",
            R.drawable.ic_tasmanian_tiger,
            "Woolly Mammoth",
            "Dodo Bird",
            "Tasmanian Tiger",
            "Bali Tiger",
            3
        )

        questionList.add(que5)

        val que6 = Question(
            6,
            "Where was Elon Musk born?",
            R.drawable.ic_elon,
            "Indiana, USA",
            "Pretoria, South Africa",
            "Manila, Philippines",
            "Athens, Greece",
            2
        )

        questionList.add(que6)

        val que7 = Question(
            7,
            "What phone company made this popular phone design?",
            R.drawable.ic_iphone,
            "Blackberry",
            "Apple",
            "Nokia",
            "Oppo",
            2
        )

        questionList.add(que7)

        val que8 = Question(
            8,
            "Which country has the White Eagle as their national animal?",
            R.drawable.ic_eagle,
            "Scotland",
            "Hungary",
            "Poland",
            "Wales",
            3
        )

        questionList.add(que8)

        val que9 = Question(
            9,
            "How many points did Michael Jordan score on his first NBA game?",
            R.drawable.ic_mj,
            "16 PTS",
            "25 PTS",
            "35 PTS",
            "20 PTS",
            1
        )

        questionList.add(que9)

        val que10 = Question(
            10,
            "In what city can you find this specific landmark?",
            R.drawable.ic_burj_khalifa,
            "Tokyo",
            "Dubai",
            "Paris",
            "London",
            2
        )

        questionList.add(que10)

        return questionList
    }

}