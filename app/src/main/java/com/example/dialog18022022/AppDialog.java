package com.example.dialog18022022;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.dialog18022022.databinding.LayoutDialogColorPickerBinding;

import java.util.Locale;

public class AppDialog {

    public static void createColorDialog(Context context, LayoutDialogColorPickerBinding binding) {
        String[] arrHex = {"","","",""};
        int[] arrColor = {0,0,0,0};
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(binding.getRoot());
        dialog.setCancelable(false);

        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }

        //set vi tri hien thi dialog
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.gravity = Gravity.BOTTOM;

        //set height va width
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        //set màu nền của dialog
//        window.setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));

        //set max seekbar tai vi màu tới 255
        binding.seekBarA.setMax(255);
        binding.seekBarR.setMax(255);
        binding.seekBarG.setMax(255);
        binding.seekBarB.setMax(255);

        binding.seekBarA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean value) {
                arrColor[0] = i;
                arrHex[0] = Integer.toHexString(i).toUpperCase(Locale.ROOT);
                binding.textViewHex.setText(String.format("HEX # %s %s%s%s",arrHex[0] ,arrHex[1] ,arrHex[2] ,arrHex[3]));
                binding.textViewRGB.setText(String.format("RGB %d %d %d %d",arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
                binding.imageView.setBackgroundColor(Color.argb(arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.seekBarR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                arrColor[1] = i;
                arrHex[1] = Integer.toHexString(i).toUpperCase(Locale.ROOT);
                binding.textViewHex.setText(String.format("HEX # %s %s%s%s",arrHex[0] ,arrHex[1] ,arrHex[2] ,arrHex[3]));
                binding.textViewRGB.setText(String.format("RGB %d %d %d %d",arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
                binding.imageView.setBackgroundColor(Color.argb(arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.seekBarG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                arrColor[2] = i;
                arrHex[2] = Integer.toHexString(i).toUpperCase(Locale.ROOT);
                binding.textViewHex.setText(String.format("HEX # %s %s%s%s",arrHex[0] ,arrHex[1] ,arrHex[2] ,arrHex[3]));
                binding.textViewRGB.setText(String.format("RGB %d %d %d %d",arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
                binding.imageView.setBackgroundColor(Color.argb(arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.seekBarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                arrColor[3] = i;
                arrHex[3] = Integer.toHexString(i).toUpperCase(Locale.ROOT);
                binding.textViewHex.setText(String.format("HEX # %s %s%s%s",arrHex[0] ,arrHex[1] ,arrHex[2] ,arrHex[3]));
                binding.textViewRGB.setText(String.format("RGB %d %d %d %d",arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
                binding.imageView.setBackgroundColor(Color.argb(arrColor[0] ,arrColor[1] ,arrColor[2] ,arrColor[3]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.textViewCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        binding.textViewOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, String.format("#%s%s%s%s",arrHex[0] ,arrHex[1] ,arrHex[2] ,arrHex[3]), Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();

    }

}
