package com.example.todosample.signup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.todosample.R;
import com.example.todosample.base.BaseActivity;
import com.example.todosample.main.MainActivity;
import com.example.todosample.model.User;

import butterknife.BindView;
import butterknife.OnClick;

public class SignupActivity extends BaseActivity<SignupConstract.View, SignupConstract.Presenter> implements SignupConstract.View {

    @BindView(R.id.et_email)
    EditText et_email;

    @BindView(R.id.et_name)
    EditText et_name;

    @BindView(R.id.et_password)
    EditText et_password;

    @BindView(R.id.et_confirmpassword)
    EditText et_confirmpassword;

    @OnClick(R.id.btn_signup)
    void signUp(){
        User user = new User();
        user.setEmail(et_email.getText().toString());
        user.setPassword(et_password.getText().toString());

        mPresenter.signUp(user);
    }

    public SignupConstract.Presenter setPresenter() {
        return new SignupPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    @Override
    public void signUpDone() {
        Intent intent = new Intent(SignupActivity.this, MainActivity.class);
        Toast.makeText(this, "회원가입을 축하합니다. 로그인 해주세요!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
