package com.example.myapplication

fun main() {
    println("나는 츄르냥이다냥 계산을 하고 싶다면 츄르를 달라.")
    println("알았다냥 / 싫다냥 중에 하나를 입력해라냥냥냥♪")
    var rightAnswer = readLine()
    when (rightAnswer) {
        "알았다냥" -> {
            println("첫번째 숫자를 달라냥!")
            var num1 = readLine()!!.toDouble()
            val calculator = CalculRator(num1)
            calculator.inputnum()
        }
        else -> {
            println("다른 츄르를 찾아봐라냥")
        }
    }
}

class CalculRator(private val num1: Double) {
    fun inputnum() {
        println("원하는 등호를 넣어라냥")
        var operator = readLine()
        when (operator) {
            "+" -> println("더할 숫자를 내놔라냥")
            "-" -> println("뺄 숫자를 내놔라냥")
            "/" -> println("나눌 숫자를 내놔라냥")
            "*" -> println("곱할 숫자를 내놔라냥")
            "%" -> println("나머지를 구하고 싶은 숫자를 내놔라냥")
            else -> println("내가 원하는 답이 아니다냥")
        }
        var num2 = readLine()!!.toDouble()
        if (operator == "+") {
            var plusResult = num1 + num2
            println("'${num1}'와 '${num2}'를 더했더니 ${plusResult}가 나왔다냥!")
        } else if (operator == "-") {
            var minusResult = num1 - num2
            println("'${num1}'와 '${num2}'를 뺐더니 ${minusResult}가 나왔다냥!")
        } else if (operator == "*") {
            var multiplyResult = num1 * num2
            println("'${num1}'와 '${num2}'를 곱했더니 ${multiplyResult}가 나왔다냥!")
        } else if (operator == "/") {
            var divideResult = num1 / num2
            println("'${num1}'와 '${num2}'를 나눴더니 ${divideResult}가 나왔다냥!")
        } else if (operator == "%") {
            var percentResult = num1 % num2
            println("'${num1}'와 '${num2}'를 계산했더니 ${percentResult}가 나왔다냥!")
        }
    }
}
