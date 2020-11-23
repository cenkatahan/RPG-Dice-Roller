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
                int surfaces[] = {4, 6, 8, 10, 12, 20, 100};
                int surface = surfaces[position];

                Dice dice = new Dice(surface);

                Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                intent.putExtra("dice", dice);
                startActivity(intent);

            }
        });

    }
}