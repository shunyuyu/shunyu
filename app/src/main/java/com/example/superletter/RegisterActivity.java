package com.example.superletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.superletter.databinding.ActivityLoginBinding;
import com.example.superletter.databinding.ActivityRegisterBinding;

/**
 * @author xushunyu
 */
public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding mBinding;
    String name, pwd, phone;
    boolean sms = false, protocol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.textAgreement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(RegisterActivity.this,AgreementActivity.class);
                startActivity(intent);
            }
        });
        mBinding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = mBinding.editName.getText().toString().trim();
                pwd = mBinding.editPwd.getText().toString().trim();
                phone = mBinding.editPhone.getText().toString().trim();
                protocol = mBinding.checkBox.isChecked();
                String toast;
                if (name.equals("")) {
                    toast = "请填写昵称！";
                }  else if (phone.equals("")) {
                    toast = "请填写手机号码！";
                } else if (phone.length() != 11) {
                    toast = "请输入正确的手机号码！";
                } else if(pwd.length()<5){
                    toast = "密码长度必须大于6位";
                }else if (!protocol) {
                    toast = "请同意本软件相关协议和策略！";
                } else {
                    SharedPreferences sp = getSharedPreferences("user_info", MODE_PRIVATE);
                    String temp = sp.getString("phone_" + phone, "0");
                    if (!temp.equals("0")) {
                        toast = "该手机号码已被注册";
                    } else {
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("phone_" + phone, phone);
                        editor.putString("name_" + phone, name);
                        editor.putString("pwd_" + phone, pwd);
                        editor.apply();
                        toast = "注册成功！";
                        finish();
                    }

                }
                Toast.makeText(RegisterActivity.this, toast, Toast.LENGTH_LONG).show();
            }
        });

    }
}
