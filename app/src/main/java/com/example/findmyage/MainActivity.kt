package com.example.findmyage

import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun buUserAgeClick(view:View){
//        buGetAge.setOnClickListener{
//            Add code to run when button is clicked
            val userDOB: Int = Integer.parseInt(etDOB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val usersAgeInYears = currentYear - userDOB
            tvShowAge.text= "Your age is $usersAgeInYears Years"
//        }
    }
}