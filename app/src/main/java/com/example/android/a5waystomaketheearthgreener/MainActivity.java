package com.example.android.a5waystomaketheearthgreener;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_1_data = getString(R.string.point_1_descrption);
        intent.putExtra("KEY_BUTTON_1",button_1_data);
        startActivity(intent);

    }

    public void onButton2Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_2_data = getString(R.string.point_2_description);
        intent.putExtra("KEY_BUTTON_2",button_2_data);
        startActivity(intent);

    }


    public void onButton3Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_3_data = getString(R.string.point_3_description);
        intent.putExtra("KEY_BUTTON_3",button_3_data);
        startActivity(intent);

    }

    public void onButton4Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_4_data = getString(R.string.point_4_description);
        intent.putExtra("KEY_BUTTON_4",button_4_data);
        startActivity(intent);

    }

    public void onButton5Click(View view){
        Intent intent = new Intent(this, DisplayDescription.class);
        String button_5_data = getString(R.string.point_5_description);
        intent.putExtra("KEY_BUTTON_5",button_5_data);
        startActivity(intent);

    }

}
