package me.darwinlouistoledo.petsaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.util.Date;
import java.util.Locale;
import me.darwinlouistoledo.petsa.Petsa;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("PETSA",
        Petsa.with(new Date())
            .toFormat("MM/dd/yyyy").format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("dd/MM/yyyy HH:mm")
            .format());

    Log.d("PETSA",
        Petsa.with("03/09/2018")
            .fromFormat("MM/dd/yyyy")
            .toFormat("MMMM dd, yyyy")
            .format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("hh:mm aa")
            .format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("MMMM dd, yyyy hh:mm aa")
            .locale(Locale.JAPAN)
            .format());

  }
}
