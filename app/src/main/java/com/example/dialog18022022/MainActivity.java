package com.example.dialog18022022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.dialog18022022.databinding.ActivityMainBinding;
import com.example.dialog18022022.databinding.LayoutDialogColorPickerBinding;
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

        mBinding.buttonAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");
                builder.setMessage("Ứng đã có phiên bản cập nhật mới. Bạn muốn cập nhật không?");
                builder.setIcon(android.R.drawable.stat_sys_warning);
                builder.setCancelable(false);

                // Nút có
                builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Đồng ý cập nhật", Toast.LENGTH_SHORT).show();
                    }
                });

                // Nút không
                builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Hủy bỏ", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();
            }
        });

//        FastFood fastFood = new FastFood.Builder()
//                .orderChicken(Chicken.TU_XUYEN)
//                .orderWater(Water.COCA)
//                .build();
//
//        Log.d("BBB",fastFood.toString());

        mBinding.buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutDialogColorPickerBinding binding = LayoutDialogColorPickerBinding.inflate(getLayoutInflater());
                AppDialog.createColorDialog(MainActivity.this, binding);
            }
        });

    }

}