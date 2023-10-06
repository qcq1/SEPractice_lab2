package cn.wxl475.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        TextView textView = findViewById(R.id.counter_textview);
        Button add = findViewById(R.id.ADD);
        Button reduce = findViewById(R.id.REDUCE);
        Button clear = findViewById(R.id.CLEAR);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(Integer.parseInt(textView.getText().toString())+1));
            }
        });
        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(Integer.parseInt(textView.getText().toString())-1));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(String.valueOf(0));
            }
        });
    }
}