package com.example.superletter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.superletter.databinding.TitleBinding

class TitleLayout(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private val mBinding: TitleBinding

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.title, this).rootView
        mBinding = TitleBinding.bind(view)
        mBinding.weChat.setOnClickListener {
            mBinding.imageView12.setImageResource(R.drawable.logo)
        }
        mBinding.imageView12.setOnClickListener {
            mBinding.imageView12.setImageResource(R.drawable.jia)
        }

//        .setOnClickListener {
//            val activity = context as Activity
//            activity.finish()
//        }
//        .setOnClickListener {
//            Toast.makeText(context,"暂未开发！",Toast.LENGTH_LONG).show()
//        }
    }

}