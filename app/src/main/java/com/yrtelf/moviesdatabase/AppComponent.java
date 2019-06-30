package com.yrtelf.moviesdatabase;

import com.yrtelf.moviesdatabase.modules.AndroidModule;
import com.yrtelf.moviesdatabase.modules.ApiModule;
import com.yrtelf.moviesdatabase.modules.NetModule;
import com.yrtelf.moviesdatabase.modules.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        NetModule.class,
        RetrofitModule.class,
        ApiModule.class,
        AndroidModule.class,
})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);



}