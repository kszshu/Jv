package hu.kszs.jv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val backBtn = findViewById<Button>(R.id.vissza_settings_btn)
        backBtn.setOnClickListener{
            finish()
        }
    }
}