package com.yrtelf.moviesdatabase;

import android.app.Application;

import com.yrtelf.moviesdatabase.modules.AndroidModule;
import com.yrtelf.moviesdatabase.modules.ApiModule;
import com.yrtelf.moviesdatabase.modules.NetModule;
import com.yrtelf.moviesdatabase.modules.RetrofitModule;


public class CustomApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .androidModule(new AndroidModule(this))
                .netModule(new NetModule())
                .retrofitModule(new RetrofitModule())
                .apiModule(new ApiModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
