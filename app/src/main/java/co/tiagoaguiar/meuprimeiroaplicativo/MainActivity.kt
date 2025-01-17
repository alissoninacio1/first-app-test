package co.tiagoaguiar.meuprimeiroaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtUsername: TextView = findViewById(R.id.txt_username)
        val txtEmail: TextView = findViewById(R.id.txt_email)

        //txtUsername.text = "Hello World"  - static way/direct access

        val username = "Alisson"
        txtUsername.text = username

        //dynamic way using res/values directory - update by action
        txtEmail.setText(R.string.send)
    }

}