public class Main {
    public static void main(String[] args) {
        //Membuat objek mahasiswa dan memasukkan data mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("29384569", "Abraham Wennas");

        //Membuat objek KHS untuk mahasiswa
        KHS khs = new KHS(mahasiswa);

        //Menambahkan beberapa mata kuliah beserta nilai angka milik mahasiswa
        khs.tambahMataKuliah(new MataKuliah("MK0023", "Pemrograman Lanjut", 95));
        khs.tambahMataKuliah(new MataKuliah("MK0056", "Bahasa Indonesia", 52));
        khs.tambahMataKuliah(new MataKuliah("MK0009", "Pancasila", 77));
        khs.tambahMataKuliah(new MataKuliah("MK0123", "Desain Aplikasi" , 33));
        khs.tambahMataKuliah(new MataKuliah("MK0097", "Sistem Basis Data", 49));

        //Mencetak KHS
        khs.cetakKHS();
    }
}