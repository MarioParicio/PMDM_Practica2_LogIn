package org.iesch.pmdm_practica2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import org.iesch.pmdm_practica2_login.databinding.ActivityMainBinding;
import org.iesch.pmdm_practica2_login.model.User;

public class MainActivity extends AppCompatActivity {

    static ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("infoMain", "Inicio de aplicación");

        binding.btnRestar.setOnClickListener(view ->{
            Log.i("infoMain", "boton log in pulsado");
            changeView();
        });

    }

    private void changeView(){

        if (validarDatos()){

            User user = new User(binding.etUserInput.toString(), binding.etPasswdInput.toString());
            Intent goDetail = new Intent(this, DetailActivity.class);
            goDetail.putExtra("User", user);

            Log.i("infoMain", "Cambiando a detailActivity");
            startActivity(goDetail);
        }
    }

    private boolean validarDatos() {
        Log.i("infoMain", "Entrar en funcion validarDatos");


        Log.i("infoMain", "datos correctos");
        return true;
    }
}