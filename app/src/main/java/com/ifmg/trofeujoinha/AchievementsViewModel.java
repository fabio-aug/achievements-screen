package com.ifmg.trofeujoinha;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsViewModel extends ViewModel {
    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> surname = new MutableLiveData<>();
    public MutableLiveData<Integer> like = new MutableLiveData<>();
    public MutableLiveData<Integer> image = new MutableLiveData<>();

    public AchievementsViewModel() {
        this.name.setValue("Name");
        this.surname.setValue("Surname");
        this.like.setValue(0);
        this.image.setValue(R.drawable.trophy);
    }

    public void setImage() {
        int aux = this.like.getValue();
        if (aux <= 10) {
            image.setValue(R.drawable.trophy);
        } else if (aux <= 20) {
            image.setValue(R.drawable.trophy2);
        } else {
            image.setValue(R.drawable.trophy3);
        }
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
        setImage();
    }

    public LiveData<Integer> getImage() {
        return image;
    }
}
