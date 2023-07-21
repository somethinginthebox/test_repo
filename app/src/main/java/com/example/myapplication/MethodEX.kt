package com.example.myapplication

fun main(){
    var myMathScore = readLine()!!.toInt()

    var myRank = checkRank(myMathScore)
    println("나의 등급은 : ${myRank}")
}

fun checkRank(score:Int) : String{
   return when (score){
        in 90..100 -> return "A"  //여기서 return 새로 쓰지 않아도 작동되는 이유?
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }
}