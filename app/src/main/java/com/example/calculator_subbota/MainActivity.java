package com.example.calculator_subbota;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculateExpenses (View view){
        EditText zarplataEditText = findViewById(R.id.zarplata);
        String zarplataString = zarplataEditText.getText().toString();
        Integer zarplata = Integer.valueOf(zarplataString);

        EditText expenseEditText = findViewById(R.id.expense);
        String expenseString = expenseEditText.getText().toString();
        Integer expense = Integer.valueOf(expenseString);

        EditText buysEditText = findViewById(R.id.buys);
        String buysString = buysEditText.getText().toString();
        Integer buys = Integer.valueOf(buysString);

        EditText storageEditText = findViewById(R.id.storage);
        String storageString = storageEditText.getText().toString();
        Integer storage = Integer.valueOf(storageString);

        Integer result1 = zarplata / (expense - buys + storage) + 1;

        Toast.makeText(this, "ваш результат (в мес.) : "+result1, Toast.LENGTH_SHORT).show();

    }
}