package com.example.rpgdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner diceSpinner;
    private Button chooseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chooseButton = findViewById(R.id.chooseButton);
        diceSpinner = findViewById(R.id.diceAll);

        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = diceSpinner.getSelectedItemPosition();
                switch (position){
                    case 0:
                        Dice diceD4 = new Dice(4);
                        Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                        intent.putExtra("dice",diceD4);
                        startActivity(intent);
                        break;
                    case 1:
                        Dice diceD6 = new Dice(6);
                        Intent intent1 = new Intent(MainActivity.this, DiceActivity.class);
                        intent1.putExtra("dice",diceD6);
                        startActivity(intent1);
                        break;
                    case 2:
                        Dice diceD8 = new Dice(8);
                        Intent intent2 = new Intent(MainActivity.this, DiceActivity.class);
                        intent2.putExtra("dice",diceD8);
                        startActivity(intent2);
                        break;
                    case 3:
                        Dice diceD10 = new Dice(10);
                        Intent intent3 = new Intent(MainActivity.this, DiceActivity.class);
                        intent3.putExtra("dice",diceD10);
                        startActivity(intent3);
                        break;
                    case 4:
                        Dice diceD12 = new Dice(12);
                        Intent intent4 = new Intent(MainActivity.this, DiceActivity.class);
                        intent4.putExtra("dice",diceD12);
                        startActivity(intent4);
                        break;
                    case 5:
                        Dice diceD20 = new Dice(20);
                        Intent intent5 = new Intent(MainActivity.this, DiceActivity.class);
                        intent5.putExtra("dice",diceD20);
                        startActivity(intent5);
                        break;
                    case 6:
                        Dice dicePerc = new Dice(100);
                        Intent intent6 = new Intent(MainActivity.this, DiceActivity.class);
                        intent6.putExtra("dice",dicePerc);
                        startActivity(intent6);
                        break;
                }

            }
        });

    }
}