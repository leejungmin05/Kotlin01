package com.example.kotlin01.step1

import com.example.kotlin01.TestClass

class AnyTest( p : (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
        var everybody : Any?

        everybody = 1111
        everybody = "문자열 테스트"
        everybody = 221.01010
        everybody = 12.00f

        if( everybody !is String) {

            if (everybody is Float) {
                println("float입니다")
            }
        }

        //everybody = null
        println( everybody == 12.00f)
        println( everybody.equals(12.00f))

        //Unit형은 값이 없음을 정의하는 형


        //Nothing형은 미래가 없음을알리는 형

    }



}