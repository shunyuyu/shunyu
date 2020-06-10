package com.example.superletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.superletter.databinding.ActivityLoginBinding;

/**
 * @author xushunyu
 */
public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding mBinding;
    private boolean bad = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.textSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bad) {
                    mBinding.textSms.setText("用密码登录");
                    mBinding.textPwd.setText("验证码");
                    mBinding.editPwd.setHint("请输入验证码");
                    bad=false;}
                else{
                    mBinding.textSms.setText("用验证码登录");
                    mBinding.textPwd.setText("密码");
                    mBinding.editPwd.setHint("请输入密码");
                    bad=true;
                }
            }
        });




    }
}