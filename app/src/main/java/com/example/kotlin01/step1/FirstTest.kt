package com.example.kotlin01.step1

import com.example.kotlin01.TestClass


class FirstTest ( p : (Any) -> Unit) : TestClass(p) {

    override fun doTest() {
        println("종결자 ;없어도 됩니다")
        println("var는 읽기쓰기 val는 읽기 전용")

        var nCount : Int = 0
        var name = "psw"

        val age =0

        var MyMoney : Int? = null
        // println(message)
        var message = "위애서는 엑세스 불가함 "
        println(hiMessage)
    }
    val hiMessage : String = "Hi"
}