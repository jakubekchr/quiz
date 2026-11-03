package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class PodpowiedzActivity extends AppCompatActivity {
    ImageView zdj;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_podpowiedz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt= findViewById(R.id.txt);
        zdj = findViewById(R.id.zdj);
        ArrayList<Pytanie> pytanieArrayList = MainActivity.dodajPytania();
        Intent intent = getIntent();
        int ktore = intent.getIntExtra("NR",0);
        Toast.makeText(this,pytanieArrayList.get(ktore).getPodpowiedz(),
                Toast.LENGTH_SHORT).show();
        txt.setText(pytanieArrayList.get(ktore).getPodpowiedz());
        zdj.setImageResource((int) pytanieArrayList.get(ktore).getIdZdjecia());
    }
}