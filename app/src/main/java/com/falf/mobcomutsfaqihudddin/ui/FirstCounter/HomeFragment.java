package com.falf.mobcomutsfaqihudddin.ui.FirstCounter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.falf.mobcomutsfaqihudddin.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;

    private Button btnPlus, btnMin;
    private TextView tampil;
    private int satu = 1;
    private int hasil = 0;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        btnPlus = root.findViewById(R.id.plus);
        btnMin = root.findViewById(R.id.min);

        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);

        tampil = root.findViewById(R.id.counter);
        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.plus){
            hasil = hasil + satu;
            String angkanya = String.valueOf(hasil);
            tampil.setText(angkanya);
        }

        if (v.getId() == R.id.min){
            hasil = hasil - satu;
            String angkanya = String.valueOf(hasil);
            tampil.setText(angkanya);
        }

        if (v.getId() == R.id.reset){
            hasil = 0;
            String angkanya = String.valueOf(hasil);
            tampil.setText(angkanya);
        }
    }
}