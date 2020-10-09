package com.example.superletter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.superletter.databinding.BottomNavBinding

class BottomNav(context: Context,attrs:AttributeSet): ConstraintLayout(context,attrs){
    private val mBinding:BottomNavBinding = TODO()
    init {
        LayoutInflater.from(context).inflate(R.layout.bottom_nav,this)
        mBinding.imageLife.setOnClickListener {
            mBinding.imageLife.setImageResource(R.drawable.shenghuo_1)
        }
        
    }
}