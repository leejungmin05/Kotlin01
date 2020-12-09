package com.example.kotlin01.step1

import com.example.kotlin01.TestClass

class NumberTest( p : (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
        var doubleV : Double = 110.1111
        var floatV  : Float  = 110.1f
        var longV   : Long   = 110
        var intV    : Int    = 20
        var shortV  : Short  = 30
        var byteV   : Byte   = 10

        // 출력해보기
        println (doubleV)
        println (floatV)
        println (intV)

        // 크기변환 후, 대입 : 캐스팅
        // to대입할크기() 메소드를 사용한다.
        // ** as로 형변환은 기본형에서는 안된다. **
        doubleV   = intV.toDouble()

        // 회색인 이유는?
        intV = doubleV.toInt()

        // 문자열로 변환
        println ( byteV.toString() )

        // 문자를 숫자로 변환
        val sum = "123".toLong() + 10
    }
}