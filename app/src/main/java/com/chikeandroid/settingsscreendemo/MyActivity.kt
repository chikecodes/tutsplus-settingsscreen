package com.chikeandroid.settingsscreendemo

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my.*

class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // reading settings preferences
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        prefs.getBoolean("checkbox", false).toString()
        prefs.getString("ringtone", "<unset>")
        prefs.getString("text", "<unset>")
        prefs.getString("list", "<unset>")


    }

}
