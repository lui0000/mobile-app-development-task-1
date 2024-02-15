package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Шаг 2: Удаление строки setContentView(R.layout.activity_display_message);
        // Шаг 3: Создание переменной типа Intent и присвоение ей значения getIntent()
        Intent intent = getIntent();
        // Шаг 5: Получение дополнительных данных строкового типа из MyActivity
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Создание объекта TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        // Делаем textView корневым элементов разметки activity
        setContentView(textView);

    }
}