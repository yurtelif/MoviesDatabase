package com.yrtelf.moviesdatabase.base;

import javax.inject.Inject;

public class BasePresenter<V extends IView, I extends BaseInteractor> {

    protected V view;

    @Inject
    protected I interactor;

    public void attachView(V view){
        this.view = view;
    }

    public void detachView(){
        this.view = null;
    }

}
