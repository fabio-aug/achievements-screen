package com.ifmg.trofeujoinha;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsViewModel extends ViewModel {
    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> surname = new MutableLiveData<>();
    public MutableLiveData<Integer> like = new MutableLiveData<>();

    public AchievementsViewModel() {
        this.name.setValue("Name");
        this.surname.setValue("Surname");
        this.like.setValue(0);
    }

    public MutableLiveData<String> getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name.setValue(name.toString());
    }

    public MutableLiveData<String> getSurname() {
        return surname;
    }

    public void setSurname(CharSequence surname) {
        this.surname.setValue(surname.toString());
    }

    public void setLike() {
        int aux = this.like.getValue();
        this.like.setValue(aux + 1);
    }
}
