package com.example.dialog18022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.dialog18022022.databinding.ActivityMainBinding;
import com.example.dialog18022022.demo_builder_design_pattern.Chicken;
import com.example.dialog18022022.demo_builder_design_pattern.FastFood;
import com.example.dialog18022022.demo_builder_design_pattern.Water;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //create binding;
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

//        mBinding.buttonAlertDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        FastFood fastFood = new FastFood.Builder()
                .orderChicken(Chicken.TU_XUYEN)
                .orderWater(Water.COCA)
                .build();

        Log.d("BBB",fastFood.toString());
    }

}