package com.example.rpgdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {


    private TextView numberOnSurfaceTextView;
    private TextView topic;
    private Button rollButton;
    private Dice dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        numberOnSurfaceTextView = findViewById(R.id.surfaceView);
        rollButton = findViewById(R.id.rollButton);



        final Dice dice = (Dice) getIntent().getSerializableExtra("dice");

        Toast.makeText(getApplicationContext(),"D"+dice.getSurfaces(),Toast.LENGTH_SHORT).show();

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int diceSurfaceNumber = random.nextInt((dice.getSurfaces() - 1) + 1) +1;
                if(dice.getSurfaces() == 100){
                    diceSurfaceNumber *= 10;
                }

                String numberOnSurfaceString = String.valueOf(diceSurfaceNumber);
                numberOnSurfaceTextView.setText(numberOnSurfaceString);
            }
        });


    }

}