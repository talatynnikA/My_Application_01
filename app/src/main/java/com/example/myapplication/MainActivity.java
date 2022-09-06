package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.text1.text_renamed;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        extracted();//вызываем метод
        for (int i = 0; i < 50; i++) {
            Log.d("MainActivity"," counter =" + i);
        }

    }
    //Сделайте рефакторинг: выделите написанный фрагмент в метод
    public void extracted() {
        text_renamed tf = new text_renamed();
        TextView nt = findViewById(R.id.textview_first);
        nt.setText(tf.getValue());
    }

}