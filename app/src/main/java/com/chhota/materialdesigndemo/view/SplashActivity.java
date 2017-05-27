package com.chhota.materialdesigndemo.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.utility.PreferenceUtil;

public class SplashActivity extends AppCompatActivity {

    public static final long ONE_SECOND = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler=new Handler();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                PreferenceUtil preferenceUtil = new PreferenceUtil(SplashActivity.this);
                //Check for user is previously sign in.
                if(preferenceUtil.isUserSignIn()){
                    startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                }else{
                    startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                }
                finish();
            }
        };
        handler.postDelayed(runnable,2*ONE_SECOND);
    }
}
