package com.example.atmasphereapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

     /*
    NIM             : 10117124
    Nama            : Iqbal Atma Muliawan
    Kelas           : IF4
    Matakuliah      : Aplikasi Komputasi Bergerak

    3 Mei 2020  : Membuat aktivity home sebagai tampilan utama dari aplikasi
    5 Mei 2020 : Mengganti warna primer, mengganti background semua fragment
    8 Mei 2020 : Merombak ulang activity home, di refactor untuk mengubah nama agar mempermudah dan merombak struktru fragment serta buttom navigation
    9 Mei 2020 : Menyusun ulang project dan merombak ulang file didalamnya, menghapus drawable file dan layout yang tidak dibutuhkan serta merapikan codingan

     */

    private BottomNavigationView navViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navViewHome = findViewById(R.id.nav_view);
        setupBottomNavigation(savedInstanceState);
    }

    public void buka_map(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Parit+Baru,+Selakau,+Kabupaten+Sambas,+Kalimantan+Barat+79452/@1.0633209,108.9726288,19z/data=!3m1!4b1!4m5!3m4!1s0x31e37b6816391639:0x4687cc312983636f!8m2!3d1.0634925!4d108.973002"));
        startActivity(map);
    }

    public void buka_ig(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/atmaiqbal_/"));
        startActivity(instagram);
    }
    public void buka_blog(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ksatrialegidia.wordpress.com"));
        startActivity(blog);
    }
    public void buka_email(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:iqbalatma@gmail.com"));
        startActivity(blog);
    }
    public void buka_dialog(View view) {
        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }

    private void setupBottomNavigation(Bundle savedInstanceState) {
        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
                = item -> {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.account_menu:
                    fragment = new AccountFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.gallery_menu:
                    fragment = new GalleryFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.daily_menu:
                    fragment = new DailyFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.music_menu:
                    fragment = new MusicFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
            }
            return false;
        };
        navViewHome.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            navViewHome.setSelectedItemId(R.id.home_menu);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}