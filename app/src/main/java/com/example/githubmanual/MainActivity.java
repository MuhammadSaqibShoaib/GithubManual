package com.example.githubmanual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button vcs_btn;
TextView MainText,heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainText = findViewById(R.id.text1);
        heading = findViewById(R.id.heading);
        vcs_btn = findViewById(R.id.btn1);

        vcs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VisiblityRemover(v);
                Fragment definationFragment = new DefinationFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,definationFragment);
                transaction.commit();
            }
        });
    }

    public void VisiblityRemover(View v){
        MainText.setVisibility(v.GONE);
        heading.setVisibility(v.GONE);
        vcs_btn.setVisibility(v.GONE);
    }
}