package com.chhota.materialdesigndemo.utility;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by chhota89 on 6/11/16.
 */

public class PreferenceUtil {

    SharedPreferences pref;
    private static final String SHARED_PREFRENCE_NAME="SHARED_PREFRENCE_NAME";
    private static final String USER_SIGNIN="USER_SIGNIN";
    private static final String USER_NAME="USER_NAME";


    public PreferenceUtil(Context context){
        pref = context.getSharedPreferences(SHARED_PREFRENCE_NAME, context.MODE_PRIVATE);
    }

    public boolean isUserSignIn(){
        return pref.getBoolean(USER_SIGNIN,false);
    }

    public void setUserSignin(boolean flag){
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(USER_SIGNIN, flag);           // Saving boolean - true/false
        editor.commit(); // commit changes
    }


    public String getUserName(){
        return pref.getString(USER_NAME,"User");
    }

    public void setUserName(String userName){
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(USER_NAME, userName);
        editor.commit(); // commit changes
    }


}
