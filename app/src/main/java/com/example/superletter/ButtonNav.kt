package com.example.superletter

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.superletter.databinding.ButtonNavBinding

class ButtonNav (context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private val mBinding:ButtonNavBinding
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.button_nav,this).rootView
        mBinding = ButtonNavBinding.bind(view)
        mBinding.imageLife.setOnClickListener {
            abc()
            mBinding.imageLife.setImageResource(R.drawable.shenghuo_1)
            val intent = Intent(context,LifeActivity::class.java)
            context.startActivity(intent)
        }
        mBinding.imageVideo.setOnClickListener {
            abc()
            mBinding.imageVideo.setImageResource(R.drawable.yingshi_1)
            val intent = Intent(context,VideoActivity::class.java)
            context.startActivity(intent)
        }
        mBinding.imageChat.setOnClickListener {
            abc()
            mBinding.imageChat.setImageResource(R.drawable.liaotian_1)
            val intent = Intent(context,ChatActivity::class.java)
            context.startActivity(intent)
        }
        mBinding.imageMy.setOnClickListener {
            abc()
            mBinding.imageMy.setImageResource(R.drawable.wode_1)
            val intent = Intent(context,MyActivity::class.java)
            context.startActivity(intent)
        }
    }
    private fun abc() {
        mBinding.imageLife.setImageResource(R.drawable.shenghuo)
        mBinding.imageVideo.setImageResource(R.drawable.yingshi)
        mBinding.imageChat.setImageResource(R.drawable.liaotian)
        mBinding.imageMy.setImageResource(R.drawable.wode)
    }
}