package com.example.ggplaystore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Prepare arrays of data
        val appList = arrayListOf<AppModel>()

        for (i in 1..20){
            appList.add(AppModel(resources.getIdentifier("thumb$i", "drawable", packageName),"App $i","4." + (i%10).toString()))
        }
        val adapter = AppAdapter(appList)

        val dexuatView : RecyclerView = findViewById(R.id.dexuat_list)
        dexuatView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        dexuatView.adapter = adapter

        val phobienView : RecyclerView = findViewById(R.id.phobien_list)
        phobienView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        phobienView.adapter = adapter

        val tinhphiView : RecyclerView = findViewById(R.id.tinhphi_list)
        tinhphiView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        tinhphiView.adapter = adapter

        val capnhatView : RecyclerView = findViewById(R.id.capnhat_list)
        capnhatView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        capnhatView.adapter = adapter
    }
}