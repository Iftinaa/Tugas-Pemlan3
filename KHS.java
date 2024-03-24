import java.util.ArrayList;
import java.util.List;

public class KHS {
    private Mahasiswa mahasiswa;
    private List<MataKuliah> daftarMataKuliah;

    //Konstruktor
    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarMataKuliah = new ArrayList<>();
    }

    //Method untuk menambahkan mata kuliah ke dalam KHS
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    //Method untuk mencetak isi  KHS
    public void cetakKHS() {
        System.out.println("Kartu Hasil Studi (KHS)");
        System.out.println("Mahasiswa : ");
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("-----------------------");
        System.out.println("Mata Kuliah :");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("Kode MK : " + mk.getKodeMK() + ", Nama MK : " + mk.getNamaMK() + ", Nilai : " + mk.konversiNilai());
        }
    }
}

