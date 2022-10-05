package org.iesch.pmdm_practica2_login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;

import org.iesch.pmdm_practica2_login.databinding.ActivityDetailBinding;
import org.iesch.pmdm_practica2_login.model.User;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("infoDetailActivity", "Inicio detailActivity");

        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle extras = getIntent().getExtras();
        User user = extras.getParcelable("User");
        binding.tvWelcome.append(user.getEmail());

        Log.i("infoDetailActivity", "Fin detailActivity");

    }

}