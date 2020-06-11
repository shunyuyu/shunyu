package com.example.superletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.superletter.databinding.ActivityLoginBinding;

import java.io.Serializable;

/**
 * @author xushunyu
 */
public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding mBinding;
    private boolean bad = true;
    private static final int RESULT_CODE = 100;

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
        mBinding.registered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        mBinding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = mBinding.editPhone.getText().toString();
                String pwd = mBinding.editPwd.getText().toString();
                SharedPreferences sp = getSharedPreferences("user_info", MODE_PRIVATE);
                String tempPhone = sp.getString("phone_" + phone, "error");
                String tempPwd = sp.getString("pwd_" + phone, "error");
                if (phone.equals(tempPhone) && pwd.equals(tempPwd)) {
//                    Bundle bundle = new Bundle();
//                    UserInfo userInfo = new UserInfo(phone,pwd);
//                    bundle.putSerializable("userInfo",userInfo);
//                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                    intent.putExtras(bundle);
//                    startActivityForResult(intent,RESULT_CODE);
                } else {
                    Toast.makeText(LoginActivity.this, "手机号或密码错误！", Toast.LENGTH_LONG).show();
                }
            }
        });
        mBinding.retrievePwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,RetrievePwdActivity.class);
                startActivity(intent);
            }
        });


    }
}