package com.example.atmasphereapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmasphereapps.entity.LocalImages;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {
    /*
    NIM             : 10117124
    Nama            : Iqbal Atma Muliawan
    Kelas           : IF4
    Matakuliah      : Aplikasi Komputasi Bergerak

    4 Mei 2020  : Membuat fragment gallery_fragment untuk logic ketika bottomviewer diklik. juga membuat layout home untuk tampilan fragment
    8 Mei 2020  : Membuat fragment gallery serta logic untuk menampilkan gambarnya.
     */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        setupRecyclerView(view);
        return view;
    }

    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

        data.add(new LocalImages(R.drawable.gallery_1));
        data.add(new LocalImages(R.drawable.gallery_2));
        data.add(new LocalImages(R.drawable.gallery_3));
        data.add(new LocalImages(R.drawable.gallery_4));
        data.add(new LocalImages(R.drawable.gallery_5));
        data.add(new LocalImages(R.drawable.gallery_6));
        data.add(new LocalImages(R.drawable.gallery_7));
        data.add(new LocalImages(R.drawable.gallery_8));
//            data.add(new LocalImages(R.drawable.jawabanone));


        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        LocalImageAdapter adapter = new LocalImageAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}