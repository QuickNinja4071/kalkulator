package com.example.kalkulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var wynik = 0;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.numer0).setOnClickListener {
            findViewById<Button>(R.id.numer0).text = "0";
        }

        findViewById<Button>(R.id.numer1).setOnClickListener {
            findViewById<Button>(R.id.numer1).text = "1";
        }

        findViewById<Button>(R.id.numer2).setOnClickListener {
            findViewById<Button>(R.id.numer2).text = "2";
        }

        findViewById<Button>(R.id.numer3).setOnClickListener {
            findViewById<Button>(R.id.numer3).text = "3";
        }

        findViewById<Button>(R.id.numer4).setOnClickListener {
            findViewById<Button>(R.id.numer4).text = "4";
        }

        findViewById<Button>(R.id.numer5).setOnClickListener {
            findViewById<Button>(R.id.numer5).text = "5";
        }

        findViewById<Button>(R.id.numer6).setOnClickListener {
            findViewById<Button>(R.id.numer6).text = "6";
        }

        findViewById<Button>(R.id.numer7).setOnClickListener {
            findViewById<Button>(R.id.numer7).text = "7";
        }

        findViewById<Button>(R.id.numer8).setOnClickListener {
            findViewById<Button>(R.id.numer8).text = "8";
        }

        findViewById<Button>(R.id.numer7).setOnClickListener {
            findViewById<Button>(R.id.numer9).text = "9";
        }


        findViewById<Button>(R.id.suma).setOnClickListener {
            findViewById<Button>(R.id.suma)
        }

        findViewById<Button>(R.id.roznica).setOnClickListener {
            findViewById<Button>(R.id.roznica)
        }

        findViewById<Button>(R.id.mnozenie).setOnClickListener {
            findViewById<Button>(R.id.mnozenie)
        }

        findViewById<Button>(R.id.dzielenie).setOnClickListener {
            findViewById<Button>(R.id.dzielenie)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}