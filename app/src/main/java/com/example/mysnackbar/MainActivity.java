package com.example.mysnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.aceptar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Snackbar snackbar = Snackbar.make(findViewById(R.id.linear),"aviso",Snackbar.LENGTH_INDEFINITE);

                snackbar.setAction("Aceptar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                snackbar.setActionTextColor(getResources().getColor(R.color.colorAccent));
                snackbar.show();
            }
        });









    }
}
