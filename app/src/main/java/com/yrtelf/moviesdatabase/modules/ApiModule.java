package com.yrtelf.moviesdatabase.modules;

import com.yrtelf.moviesdatabase.model.MovieApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public MovieApi providesNewsApi(Retrofit retrofit) {
        return retrofit.create(MovieApi.class);
    }

}