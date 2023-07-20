package com.example.myapplication

fun main(){
    println("이름을 입력해주세요")
    var name = readLine()
    println("나이를 입력해주세요")
    var age = readLine()!!.toInt()
    println("궁수, 전사, 마법사 중 원하는 직업을 입력해주세요")
    var job = readLine()

}

class ClassTest (var names:String, var ages: Int, var jobs: String){

    init {
       println("궁수를 선택하셨습니다")
   }

}