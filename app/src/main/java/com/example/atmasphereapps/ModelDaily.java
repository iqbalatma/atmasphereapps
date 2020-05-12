package com.example.atmasphereapps;

public class ModelDaily {
/*
    NIM             : 10117124
    Nama            : Iqbal Atma Muliawan
    Kelas           : IF4
    Matakuliah      : Aplikasi Komputasi Bergerak

    10 Mei 2020 : Membuat model daily untuk digunakan pada fragment daily
     */

        private String hari;
        private String kegiatan;
        private String pelajaran;
        private String game;
        private String note;

        public ModelDaily(String hari, String kegiatan, String pelajaran, String game, String note) {
            this.hari = hari;
            this.kegiatan = kegiatan;
            this.pelajaran = pelajaran;
            this.game = game;
            this.note = note;
        }

        public String getHari() {
            return hari;
        }

        public void setHari(String hari) {
            this.hari = hari;
        }

        public String getKegiatan() {
            return kegiatan;
        }

        public void setKegiatan(String kegiatan) {
            this.kegiatan = kegiatan;
        }

        public String getPelajaran() {
            return pelajaran;
        }

        public void setPelajaran(String pelajaran) {
            this.pelajaran = pelajaran;
        }

        public String getGame() {
            return game;
        }

        public void setGame(String game) {
            this.game = game;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }
}
