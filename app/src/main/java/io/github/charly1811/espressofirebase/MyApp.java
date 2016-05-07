package io.github.charly1811.espressofirebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Charles-Eugene Loubao on 5/6/16.
 */
public class MyApp extends Application {

    private static MyApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        Firebase.setAndroidContext(this);
    }
}