package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
private const val TEXT_CONTENTS = "TextContent"

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate : Clicked")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")

        button.setOnClickListener {
            Log.d(TAG,"onClick : Clicked")
            textView?.append(userInput.text)
            textView?.append("\n")
            //userInput.text.clear()
            userInput.setText("")
            }

    }

    override fun onStart() {
        Log.d(TAG,"onStart : Clicked")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG,"onRestoreInstanceState : Clicked")
        super.onRestoreInstanceState(savedInstanceState)
        val savedString = savedInstanceState.getString(TEXT_CONTENTS)
        textView?.text = savedString
    }

    override fun onResume() {
        Log.d(TAG,"onResume : Clicked")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause : Clicked")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"onSaveInstanceState : Clicked")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENTS,textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG,"onStop : Clicked")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG,"onRestart : Clicked")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy : Clicked")
        super.onDestroy()
    }
}