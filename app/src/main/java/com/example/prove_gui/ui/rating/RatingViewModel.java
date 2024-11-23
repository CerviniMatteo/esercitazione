package com.example.prove_gui.ui.rating;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RatingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RatingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rating fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}