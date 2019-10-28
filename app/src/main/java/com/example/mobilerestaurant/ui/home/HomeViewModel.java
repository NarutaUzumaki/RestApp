package com.example.mobilerestaurant.ui.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    //    private void initRecyclerView(){
//        newsRecyclerView = findViewById(R.id.recycler_news_home);
//
//        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }
}