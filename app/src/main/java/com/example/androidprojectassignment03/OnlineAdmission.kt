package com.example.androidprojectassignment03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OnlineAdmission : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var phone: EditText
    private lateinit var email: EditText
    private lateinit var course: EditText
    private lateinit var address: EditText
    private lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_admission)

        name = findViewById(R.id.nameET)
        phone = findViewById(R.id.phoneET)
        email = findViewById(R.id.emailET)
        course = findViewById(R.id.courseET)
        address = findViewById(R.id.addressET)
        submit = findViewById(R.id.SubmitBTN)

        submit.setOnClickListener {
            var userName:String = name.getText().toString()
            var userPhone:String = phone.getText().toString()
            var userEmail:String = email.getText().toString()
            var userCourse:String = course.getText().toString()
            var userAddress:String = address.getText().toString()

            var intent = Intent(this@OnlineAdmission,AdmissionForm::class.java)
            intent.putExtra("username",userName)
            intent.putExtra("userphone",userPhone)
            intent.putExtra("useremail",userEmail)
            intent.putExtra("usercourse",userCourse)
            intent.putExtra("useraddress",userAddress)
            startActivity(intent)


        }
    }
}