package com.example.kotlin01.step1

import com.example.kotlin01.TestClass

class ConditionTest(p : (Any)-> Unit) : TestClass(p) {
    override fun doTest() {
        ifTest(17.0f)
        loopTest(8)
        caseTest(3)

        var a  ="ABCDE"
        val result = when(a){
            is String -> {true}
            else -> {false}
        }
        kotlin.io.println(result)
        kotlin.io.println(if ("AAA".length > 3) true else "짧아요")
    }
    fun loopTest(count : Int) {
        for ( i in (0..count)){
            kotlin.io.println("i ->" + i)
        }

        var i : Int = 0
        while (i < count) { i++; kotlin.io.println("$i 입니다")
        }

        var name : String = ""

        when(name){
            "A" -> {}
            else ->{}

        }    }
    fun caseTest ( o : Any?){
        when(o) {
            "Test" -> {
                kotlin.io.println("문자:" + o)
            }
            is Float -> {
                kotlin.io.println("Float:" + o)
            }
            in (0..9) -> {
                kotlin.io.println("0부터 9까지 숫자: $o")
            }
            else     -> {
                kotlin.io.println("???")
            }
        }
    }


    fun ifTest ( a : Any?){
        if (a == "Test") {
            kotlin.io.println(a)
        }else if( a is Float){
            kotlin.io.println("Float")
        }else if(a in ( 0..9)) {
            kotlin.io.println("0-19까지의 숫자 : $a")

        }else if (a == null){
            kotlin.io.println("null")
        }

    }
}