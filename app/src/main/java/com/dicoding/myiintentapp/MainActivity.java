package com.dicoding.myiintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);

        btnMoveActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_move_activity:
                //>>> CONTOH PEMBUATAN INTENT TANPA MEMBAWA DATA<<<
                //Setelah Activity tujuan sudah berhasil diciptakan, sekarang saatnya menambahkan suatu Intent pada
                // method onClick() di MainActivity.java
                //membuat object Intent
                //Kelas asal selalu menggunakan .this yang menandakan obyek kelas saat ini. Kelas tujuan selalu menggunakan .class.
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                //metode ini akan menjalankan activity baru tanpa membawa data.
                //Obyek intent yang diinputkan adalah obyek moveIntent yang akan ketika kode ini dijalankan maka akan membuka MoveActivity.
                startActivity(moveIntent);
                break;
        }
    }
}
