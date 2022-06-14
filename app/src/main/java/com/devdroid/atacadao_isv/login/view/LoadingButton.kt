package com.devdroid.atacadao_isv.login.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ProgressBar
import com.devdroid.atacadao_isv.R

class LoadingButton : FrameLayout {

    private lateinit var button: Button
    private lateinit var progress: ProgressBar

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setup(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        setup(context, attrs)
    }

    fun setup(context: Context, attrs: AttributeSet) {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.button_loading, this)

        button = getChildAt(0) as Button
        progress = getChildAt(1) as ProgressBar



    }

}