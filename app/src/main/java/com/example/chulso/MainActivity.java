package com.example.chulso;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView tvinfo;
    EditText etinput;
    Button bControl;
    int guess;
    boolean gameFinished;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvinfo = (TextView)findViewById(R.id.textView);
        etinput = (EditText)findViewById(R.id.editTextNumber);
        bControl = (Button)findViewById(R.id.button);

        guess = (int)(Math.random()*100);
        gameFinished = false;









    }

    public void onClick(View v){
        if(!gameFinished){
            int inp = Integer.parseInt(etinput.getText().toString());
            if(inp > guess)
                tvinfo.setText(getResources().getString(R.string.ahead));
            if(inp< guess)
                tvinfo.setText("недолет");



            if(inp == guess)
            {
                tvinfo.setText("в точку");
                bControl.setText(getResources().getString(R.string.play_more));
                gameFinished=true;



            }

        }


        else
        {
            guess = (int)Math.random()*100;
            bControl.setText("ввести теаст");
            tvinfo.setText(getResources().getString(R.string.try_to_guess));
            gameFinished=false;


            if(gameFinished=true){
                etinput.setText("");

                guess = (int)Math.random()*100;
                tvinfo.setText(getResources().getString(R.string.try_to_guess));
                gameFinished=false;
            }
            




        }

    }
}