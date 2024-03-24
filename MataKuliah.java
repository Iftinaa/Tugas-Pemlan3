public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int nilaiAngka;

    //Konstruktor
    public MataKuliah(String kodeMK, String namaMK, int nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    //Getter dan Setter
    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    //Method untuk mengonversi nilai angka menjadi nilai huruf
    public String konversiNilai() {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 60) {
            return "B";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}