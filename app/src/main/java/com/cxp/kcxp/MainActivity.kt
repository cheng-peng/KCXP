package com.cxp.kcxp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cxp.kcxp.constraint_layout.ConstraintLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var context:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_bt1.setOnClickListener(this)

        context=this
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_bt1 -> {
                //ConstraintLayout 用法
                startActivity(Intent(context,ConstraintLayoutActivity::class.java))
            }
            else -> {
            }
        }
    }
}
