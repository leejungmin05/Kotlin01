package com.example.kotlin01.step1

import com.example.kotlin01.TestClass

class LabelTest( p : (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
        ExitLoop()
        println(lambdaReturn())

        (0..10).forEach {
            if (it > 3) return@forEach else kotlin.io.println(it)
        }
        fun ExitLoop() {
            HereToExit@ for (i in 0..2) {
                for (j in 0..10) {
                    if (j == 5) break@HereToExit
                    kotlin.io.println("i -> $i, j->$j")
                }
                kotlin.io.println("j loop end")
            }
            kotlin.io.println("i loop end")
        }

        var lambdaReturn = Exit@{
            if (true) {
                return@Exit 3
            }
            1000
        }
    }
}