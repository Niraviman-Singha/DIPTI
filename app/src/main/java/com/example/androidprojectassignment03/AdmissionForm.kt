package com.example.androidprojectassignment03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AdmissionForm : AppCompatActivity() {
    private lateinit var name2: TextView
    private lateinit var phone2: TextView
    private lateinit var email2: TextView
    private lateinit var course2: TextView
    private lateinit var address2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admission_form)

        name2 = findViewById(R.id.nameTV)
        phone2 = findViewById(R.id.phoneTV)
        email2 = findViewById(R.id.emailTV)
        course2 = findViewById(R.id.courseTV)
        address2 = findViewById(R.id.addressTV)

        var gname = intent.getStringExtra("username")
        var gphone = intent.getStringExtra("userphone")
        var gemail = intent.getStringExtra("useremail")
        var gcourse = intent.getStringExtra("usercourse")
        var gaddress = intent.getStringExtra("useraddress")

        name2.setText("Name "+gname)
        phone2.setText("Phone: "+gphone)
        email2.setText("Gmail: "+gemail)
        course2.setText("Course: "+gcourse)
        address2.setText("Address: "+gaddress)

    }
}