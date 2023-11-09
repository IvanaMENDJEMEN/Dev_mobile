package com.example.dogapplication

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class IntentActivity : AppCompatActivity() {

    companion object {
        const val TAG="message afficher"
    }
     private var message:EditText= findViewById(R.id.editTextText)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val clickButton: Button = findViewById(R.id.button)
        clickButton.setOnClickListener{
            launchActivity()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu , menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.settings->{
                Toast.makeText(this,"Je suis le toast",
                    Toast.LENGTH_SHORT).show()
                return true
            }
            else -> ( return false)

        }
    }

    fun launchActivity(){
        val intent = Intent(this , Activity2::class.java)
        intent.putExtra(TAG,message.text.toString())
        startActivity(intent)
    }
}