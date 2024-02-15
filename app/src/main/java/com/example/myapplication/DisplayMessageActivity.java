package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.display_message_textview) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() { }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_display_message,
                    container, false);
            return rootView;
        }
    }

}
