package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que2)

        val que5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belgium",
            "Germany",
            "India",
            "Brazil",
            1
        )
        questionsList.add(que5)

        val que3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Argentina",
            "Austria",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Qatar",
            "Denmark",
            "Germany",
            1
        )
        questionsList.add(que4)

        return questionsList
    }
}