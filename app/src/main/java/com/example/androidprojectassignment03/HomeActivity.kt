package com.example.androidprojectassignment03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.androidprojectassignment03.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        this.title = "NIRAVIMAN"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about->{
                startActivity(Intent(this@HomeActivity, About::class.java))
            }

            R.id.course->{
                startActivity(Intent(this@HomeActivity, Course::class.java))
            }

            R.id.academic->{
                startActivity(Intent(this@HomeActivity, Academic::class.java))
            }

            R.id.project->{
                startActivity(Intent(this@HomeActivity, StudentProjects::class.java))
            }

            R.id.admission->{

                startActivity(Intent(this@HomeActivity, OnlineAdmission::class.java))
            }

        }
        return super.onOptionsItemSelected(item)
    }
}