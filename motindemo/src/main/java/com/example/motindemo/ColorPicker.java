package com.example.motindemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ColorPicker extends View {

    public ColorPicker(Context context){

        super(context);//Получение activity

    }
    public ColorPicker(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);//Получение activity и атрибута

    }


}