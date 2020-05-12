package com.example.atmasphereapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter2 extends RecyclerView.Adapter {
    /*
    NIM             : 10117124
    Nama            : Iqbal Atma Muliawan
    Kelas           : IF4
    Matakuliah      : Aplikasi Komputasi Bergerak

    10 Mei 2020 : Membuat adapter untuk digunakan pada fragment
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;
        public ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.hari);
            mItemImage = (ImageView) itemView.findViewById(R.id.item_daily_image);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(OurData.title2[position]);
            mItemImage.setImageResource(OurData.picturePath2[position]);


        }



        @Override
        public void onClick(View v) {

        }
    }

}
