package com.example.superletter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.superletter.databinding.BottomNavBinding

class ButtomNav (context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private val mBinding:BottomNavBinding
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.bottom_nav,this).rootView
        mBinding = BottomNavBinding.bind(view)
        mBinding.imageLife.setOnClickListener {
            mBinding.imageLife.setImageResource(R.drawable.shenghuo_1)
        }
        mBinding.imageVideo.setOnClickListener {
            mBinding.imageVideo.setImageResource(R.drawable.yingshi_1)
        }
        mBinding.imageChat.setOnClickListener {
            mBinding.imageChat.setImageResource(R.drawable.liaotian_1)
        }
        mBinding.imageMy.setOnClickListener {
            mBinding.imageMy.setImageResource(R.drawable.wode_1)
        }
    }
}