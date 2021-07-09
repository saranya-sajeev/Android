package com.saranya.network.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.saranya.network.networkstatus.NetworkState

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(NetworkState().isConnectedToInternet(this)){
            Log.d("MainActivity","Network Connected")
        }
    }
}