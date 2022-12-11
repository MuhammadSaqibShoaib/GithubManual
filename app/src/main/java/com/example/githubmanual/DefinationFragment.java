package com.example.githubmanual;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class DefinationFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // getting data from activity
        String def = getArguments().getString("def");
        String head = getArguments().getString("heading");

        View view = inflater.inflate(R.layout.fragment_defination, container, false);
        // setting heading
        TextView heading = view.findViewById(R.id.frag_heading);
        heading.setText(head);

        // setting internal text
        TextView content = view.findViewById(R.id.frag_def);
        content.setText(def);



        Button btnBack = view.findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),MainActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}