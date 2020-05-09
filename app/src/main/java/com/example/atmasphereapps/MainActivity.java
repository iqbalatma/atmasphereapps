package com.example.atmasphereapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
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
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navViewHome = findViewById(R.id.nav_view);

        setupBottomNavigation(savedInstanceState);
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