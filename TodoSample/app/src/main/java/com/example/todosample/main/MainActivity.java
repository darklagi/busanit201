package com.example.todosample.main;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.todosample.R;
import com.example.todosample.base.BaseActivity;
import com.example.todosample.model.User;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainContract.View, MainContract.Presenter> implements MainContract.View {

    @BindView(R.id.et_email)
    EditText et_email;

    @BindView(R.id.et_password)
    EditText et_password;

    @OnClick(R.id.btn_login)
    void login(){
        User user = new User();
        user.setEmail(et_email.getText().toString());
        user.setPassword(et_password.getText().toString());

        mPresenter.login(user);
    }

    @OnClick(R.id.tv_signup)
    void signUp(){
        /*
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
         */
    }

    public MainContract.Presenter setPresenter() {
        return new MainPresenter();
    }

    @Override
    public void loginDone(User user) {
        if(user.isLogin()){
            /*
            Intent intent = new Intent(DetailActivity.this, MainActivity.class);
            startActivity(intent);
            */
        }
        else{
            Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
