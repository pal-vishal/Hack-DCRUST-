package com.example.hackdcrust.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import com.example.hackdcrust.login.model.PostResponse;
import com.example.hackdcrust.service.Repository;

import java.util.List;

public class ViewCategoryViewModel extends ViewModel {
    private Repository repository;
    private LiveData<List<PostResponse>> employees;

    public ViewCategoryViewModel() {
        repository = new Repository();
    }

    public LiveData<List<PostResponse>> getEmployees(int pinCode, String category) {
        if (employees == null)
            employees = repository.searchEmployees(pinCode, category);
        return employees;
    }
}
