package com.example.myapplication;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE =
            "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Данный метод вызывается при нажатии на кнопку */
    public void sendMessage(View view) {
        // создание намерения, которое перекидывает нас к другому явлению
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        //Полученный текст добавляется в объект Intent в
        // качестве дополнительной информации с ключом EXTRA_MESSAGE
        intent.putExtra(EXTRA_MESSAGE, message);
        // метод запускающий другую активность
        startActivity(intent);
    }


}