package com.example.lab4_tabs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class mtkFragment extends Fragment {


    public mtkFragment() {
        // Required empty public constructor

    }
    EditText fInput = (EditText) findViewById(R.id.fInput);
    int fNumber = Integer.parseInt(fInput.getText().toString());
    int cNumber = (((fNumber - 32)*5)/9);

    public void convertBClick(View v) {
        TextView t = (TextView) findViewById(R.id.celcius);
        t.setText(cNumber);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mtk, container, false);
    }

}
