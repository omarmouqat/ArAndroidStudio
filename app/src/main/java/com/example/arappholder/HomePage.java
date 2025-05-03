package com.example.arappholder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //You Can replace this model with what ever models of your choose
        Button facemodel = findViewById(R.id.facebtn);
        facemodel.setOnClickListener(view -> sendmessage("file:///android_asset/facemodel.glb"));

        Button horsemodel = findViewById(R.id.horsebtn);
        horsemodel.setOnClickListener(view -> sendmessage("file:///android_asset/horsemodel.glb"));

        Button vasemodel = findViewById(R.id.vasebtn);
        vasemodel.setOnClickListener(view -> sendmessage("file:///android_asset/vasemodel.glb"));

        Button chestmodel = findViewById(R.id.chestbtn);
        chestmodel.setOnClickListener(view -> sendmessage("file:///android_asset/chestmodel.glb"));

        Button canonmodel = findViewById(R.id.canonbtn);
        canonmodel.setOnClickListener(view -> sendmessage("file:///android_asset/canonmodel.glb"));

        Button goldenvasemodel = findViewById(R.id.goldenvasebtn);
        goldenvasemodel.setOnClickListener(view -> sendmessage("file:///android_asset/um5model.glb"));



    }
    public void sendmessage(String message){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("path",message);
        startActivity(intent);
    }
}