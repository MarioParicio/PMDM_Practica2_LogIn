package org.iesch.pmdm_practica2_login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

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

            User user = new User(binding.etUserInput.getText().toString(), binding.etPasswdInput.getText().toString());
            Intent goDetail = new Intent(this, DetailActivity.class);
            goDetail.putExtra("User", user);

            Log.i("infoMain", "Cambiando a detailActivity");
            startActivity(goDetail);
        }
    }

    private boolean validarDatos() {
        Log.i("infoMain", "Entrar en funcion validarDatos");
        if (binding.etUserInput.getText().length() >= 1 && binding.etPasswdInput.getText().length() >= 1){
            Log.i("infoMain", "datos correctos");
            return true;
        }
        Log.i("infoMain", "datos incorrectos");
        //F
        return false;
    }
}