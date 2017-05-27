package com.chhota.materialdesigndemo.view;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.utility.PreferenceUtil;

public class LoginActivity extends AppCompatActivity {

    private static final String USER_PASSWORD = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View view){
        EditText passwordEditText =  (EditText) findViewById(R.id.password);
        String password = passwordEditText.getText().toString();
        //check for password
        if(password !=null && !password.equals("")){
            if(password.equals(USER_PASSWORD)){
                EditText userName = (EditText)findViewById(R.id.userName);
                //Save the user name in to shared prefrence
                PreferenceUtil preferenceUtil=new PreferenceUtil(LoginActivity.this);
                preferenceUtil.setUserName(userName.getText().toString());
                preferenceUtil.setUserSignin(true);

                //Send user to Home screen
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));

            }else{
                //user password is not matching
                showSnackBar(R.string.password_mismatch);
            }
        }else{
            //user password is blank
            showSnackBar(R.string.password_blank);
        }
    }

    private void showSnackBar(int messageId){
        View view = findViewById(R.id.activity_login);
        Snackbar.make(view,messageId,Snackbar.LENGTH_LONG).show();
    }
}
