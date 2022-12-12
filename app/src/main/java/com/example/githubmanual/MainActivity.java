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
Button com_btn;
Button brn_btn;
Button syc_btn;
TextView MainText,heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting refernces of views
        MainText = findViewById(R.id.text1);
        heading = findViewById(R.id.heading);
        vcs_btn = findViewById(R.id.btn1);
        rep_btn = findViewById(R.id.btn_2);
        com_btn = findViewById(R.id.btn_3);
        brn_btn = findViewById(R.id.btn_4);
        syc_btn = findViewById(R.id.btn_5);
        // setting on click listener on buttons
        vcs_btn.setOnClickListener(v -> VCS_BTN(v));
        rep_btn.setOnClickListener(v -> REP_BTN(v));
        com_btn.setOnClickListener(v -> COM_BTN(v));
        brn_btn.setOnClickListener(v -> BRN_BTN(v));
        syc_btn.setOnClickListener(v -> SYC_BTN(v));
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

    public void COM_BTN(View v){
        VisiblityRemover(v);
        // sending data to fragment
        Bundle bundle = new Bundle();
        bundle.putString("heading",getString(R.string.COM_Frag));
        bundle.putString("def",getString(R.string.COM_Def));

        // opening a fragment
        Fragment definationFragment = new DefinationFragment();
        definationFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,definationFragment);
        transaction.commit();
    }

    public  void BRN_BTN(View v){
        VisiblityRemover(v);
        // sending data to fragment
        Bundle bundle = new Bundle();
        bundle.putString("heading",getString(R.string.BRN_Frag));
        bundle.putString("def",getString(R.string.BRN_Def));

        // opening a fragment
        Fragment definationFragment = new DefinationFragment();
        definationFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,definationFragment);
        transaction.commit();
    }

    public  void SYC_BTN(View v){
        VisiblityRemover(v);
        // sending data to fragment
        Bundle bundle = new Bundle();
        bundle.putString("heading",getString(R.string.SYC_Frag));
        bundle.putString("def",getString(R.string.SYC_Def));

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
        com_btn.setVisibility(v.GONE);
        brn_btn.setVisibility(v.GONE);
        syc_btn.setVisibility(v.GONE);
    }
}