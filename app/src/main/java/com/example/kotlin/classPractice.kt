package com.example.kotlin

/** 8. class **/
open class Practice (val name : String = "Anonymous"){

    constructor(name : String, age : Int) : this(name) {
        println("my friend name is ${name}, ${age} years old")
    }

    init{
        println("new name")
    }

    val nickName = "bini"

    fun practice(){
        println("I'm studying~~~~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Practice(){
    override fun singASong() {
        super.singASong()  // "lalala"도 출력
        print("라라라")
    }
}


fun main(){
    val study = Practice("subin")
    val stranger = Practice()
    study.practice()

    val friend = Practice("sujeong",24)

    println("my name is ${study.name}")
    println("my nickname is ${study.nickName}")
    println(stranger.name)

    //상속
   val korean = Korean()
    korean.singASong()
}