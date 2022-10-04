package org.iesch.pmdm_practica2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.pmdm_practica2_login.databinding.ActivityMainBinding;
import org.iesch.pmdm_practica2_login.model.Usuario;

public class MainActivity extends AppCompatActivity {

    static ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRestar.setOnClickListener(view -> changeView());

    }

    private void changeView(){

        if (validarDatos())
    }

    private boolean validarDatos() {


    }
}