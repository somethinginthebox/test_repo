package com.example.myapplication

fun main(){
    var a = Fruit("apple", "red")
    var b = Fruit("banana", "yellow")
    var c = Fruit("grape", "purple")
    var d = Fruit("cherry","red")
}

 class Fruit(var fruitsNames:String, var fruitsColors : String ){
    init{
        println("${this.fruitsColors}색의 ${this.fruitsNames}가 있습니다")
    }
     constructor(fruitsNames: String) : this(fruitsNames, "red"){
         println("빨간색 과일입니다.")
     }
}