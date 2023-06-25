package com.ifmg.trofeujoinha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import com.ifmg.trofeujoinha.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        AchievementsViewModel viewModel = new ViewModelProvider(this).get(AchievementsViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
    }
}