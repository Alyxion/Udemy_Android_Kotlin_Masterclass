package com.mi.playing

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity)

        // create and show fragment
        val fragmentManager = this.fragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val hello = TextViewFrag()
        fragmentTransaction.add(R.id.frag_container, hello,  "hello")
        fragmentTransaction.commit()
    }
}
