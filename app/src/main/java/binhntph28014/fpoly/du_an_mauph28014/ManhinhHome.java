package binhntph28014.fpoly.du_an_mauph28014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import binhntph28014.fpoly.du_an_mauph28014.Login.Login;

public class ManhinhHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh_home);
    }
    public void loo(View view) {
        Intent intent = new Intent(ManhinhHome.this, Login.class);
        startActivity(intent);
    }
}