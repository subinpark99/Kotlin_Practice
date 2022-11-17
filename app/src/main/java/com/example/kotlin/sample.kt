package com.example.kotlin

import java.util.*

fun main(){

}

/** 1. 함수 **/
fun function() {
    println("helloWorld!")
}
fun add(a : Int, b : Int) : Int{
    return a+b
}

/** 2. val VS var **/
fun value(){
    val a : Int = 10 //변하지 않는 값
    var b = 9  //변할 수 있는 값
    var name = "Subin"
}

/** 3. String Template **/
fun string() {
    val name = "Subin"
    val lastName = "Park"
    println("my name is ${name + lastName}. I'm 24.")
    println("Is this true? ${1 == 0}")
}

/** 4. 조건식 **/
fun maxBy(a : Int, b : Int ) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 ->println("this is 2 0r 3")
        else ->println("I don't know.")
    }

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
    }
}

/** 5. Array and List **/
// Array
// List (1) List - 값 변경 불가 (2) MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val array2= arrayOf(1,"one")
    val list = listOf<Int>(1,2,3)
    val list2 = listOf<Any>(2,"two")

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

/** 6. for / while **/

fun forAndWhile(){

    //for
    val students = arrayListOf<String>("subin","suhyeon","jinwoo")

    for( name in students){
        println("$name")
    }

    var sum = 0
    for( i in 1..10 step 2){
        sum +=i
    }
    println(sum)

    //while
    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }

    for( (index,name) in students.withIndex()){
        println("${index + 1} 번째 학생 : ${name}")
    }
}

/** 7. Nullable / NonNull **/

fun nullCheck(){
    //NPE: NUll pointer Exception

    var name = "subin"
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase(Locale.ROOT)
    var nullNameInUpperCase= nullName?.uppercase(Locale.ROOT)

    // ?:
    val lastName : String? = null
    val nickname = "clapbin"
    val fullName : String = name + " " + (lastName?: "No Lastname")
    val myName : String = "My nickname is " + (nickname?: "No Nickname")
    println(fullName)
    println(myName)
}

// !!
fun ignoreNulls(str : String?){
    val notNull : String = str!!
    val upper = notNull.toUpperCase()

    val email : String = "psb8909@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}