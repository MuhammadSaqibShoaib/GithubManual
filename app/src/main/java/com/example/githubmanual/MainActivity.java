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
Button rep_btn;
TextView MainText,heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainText = findViewById(R.id.text1);
        heading = findViewById(R.id.heading);
        vcs_btn = findViewById(R.id.btn1);
        rep_btn = findViewById(R.id.btn_2);
        vcs_btn.setOnClickListener(v -> VCS_BTN(v));
        rep_btn.setOnClickListener(v -> REP_BTN(v));
    }


    public void VCS_BTN(View v){
        VisiblityRemover(v);
        // sending data to fragment
        Bundle bundle = new Bundle();
        bundle.putString("heading",getString(R.string.VCS_Frag));
        bundle.putString("def",getString(R.string.VCSDef));

        // opening a fragment
        Fragment definationFragment = new DefinationFragment();
        definationFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,definationFragment);
        transaction.commit();
    }

    public void REP_BTN(View v){
        VisiblityRemover(v);
        // sending data to fragment
        Bundle bundle = new Bundle();
        bundle.putString("heading",getString(R.string.REP_Frag));
        bundle.putString("def",getString(R.string.REP_Def));

        // opening a fragment
        Fragment definationFragment = new DefinationFragment();
        definationFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,definationFragment);
        transaction.commit();
    }
    public void VisiblityRemover(View v){
        MainText.setVisibility(v.GONE);
        heading.setVisibility(v.GONE);
        vcs_btn.setVisibility(v.GONE);
        rep_btn.setVisibility(v.GONE);
    }
}