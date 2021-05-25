package sg.edu.rp.c346.id20024466.l05demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer=findViewById(R.id.textViewAnsInt);
        Intent intentReceived=getIntent();
        int value=intentReceived.getIntExtra("Value",0);
        tvAnswer.setText("Integer value received is: "+value);
    }
}