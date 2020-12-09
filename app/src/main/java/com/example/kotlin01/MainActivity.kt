package com.example.kotlin01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin01.step1.AnyTest
import com.example.kotlin01.step1.ConditionTest
import com.example.kotlin01.step1.FunctionTest
import kotlinx.android.synthetic.main.activity_main.*
import com.example.kotlin01.step1.StringTest



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //우리가 만든 예쩨들을 이곳에서 실행시킨다.
        //doTest(FirstTest(::WriteLn))
        //doTest(NumberTest(::WriteLn))
        //doTest(StringTest(::WriteLn))
        //doTest(AnyTest(::WriteLn))'
        //doTest(FunctionTest(::WriteLn))
        //doTest(ConditionTest(::WriteLn))
        doTest(LableTest(::WriteLn))
    }
    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( any : Any) {
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}