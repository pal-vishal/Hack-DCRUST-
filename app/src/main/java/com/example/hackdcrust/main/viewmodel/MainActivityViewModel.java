package com.example.hackdcrust.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.hackdcrust.login.model.PostResponse;
import com.example.hackdcrust.service.Repository;


public class MainActivityViewModel extends ViewModel {
    private Repository repository;
    private LiveData<PostResponse> user;

    public MainActivityViewModel() {
        repository = new Repository();
    }

    public LiveData<PostResponse> getUser(String uid) {
        if (user == null) {
            user = repository.getUser(uid);
        }
        return user;
    }
}
