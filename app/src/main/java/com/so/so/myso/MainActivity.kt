package com.so.so.myso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cpp.JNITest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jniTest = JNITest()
        Toast.makeText(this, jniTest.string, Toast.LENGTH_SHORT).show()
    }
}
