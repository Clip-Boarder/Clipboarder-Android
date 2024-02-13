package com.clipboarder.clipboarder.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clipboarder.clipboarder.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KeyboardSettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard_setting)
    }
}