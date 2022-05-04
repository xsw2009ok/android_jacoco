package com.songguo.qa.c.androidjacocotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class EditTextActivity extends AppCompatActivity {

    private Button mBtnLogin;
    private EditText mEtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mEtUserName = (EditText) findViewById(R.id.et_1);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mEtUserName.getText().toString();

                if ("9527".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("1111".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("2222".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("3333".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("4444".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ("5555".equals(s)) {
                    Toast.makeText(EditTextActivity.this, "用户:" + s + "登录成功!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(EditTextActivity.this, "用户名不存在!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
