package com.example.todosample.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

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
        /*
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
         */
    }

    @OnClick(R.id.tv_signup)
    void signup(){
        /*
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
         */
    }

    public MainContract.Presenter setPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
