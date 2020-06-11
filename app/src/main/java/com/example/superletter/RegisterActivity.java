package com.example.superletter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.superletter.databinding.ActivityLoginBinding;
import com.example.superletter.databinding.ActivityRegisterBinding;

/**
 * @author xushunyu
 */
public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding mBinding;
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
    }
}
