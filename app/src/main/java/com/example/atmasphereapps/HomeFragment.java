package com.example.atmasphereapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    /*
    NIM             : 10117124
    Nama            : Iqbal Atma Muliawan
    Kelas           : IF4
    Matakuliah      : Aplikasi Komputasi Bergerak

    4 Mei 2020  : Membuat aktivity home_fragment untuk logic ketika bottomviewer diklik. juga membuat layout home untuk tampilan fragment
    5 Mei 2020 : Mengerjakan layout home fragment berisi profil dan hobi, mengisi konten fragment home berupa deskripsi diri, profile, dan interest
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        return view;
    }
}