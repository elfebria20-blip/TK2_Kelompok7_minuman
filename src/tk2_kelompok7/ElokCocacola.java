
package tk2_kelompok7;


public class ElokCocacola {
    
    //atribut
    private String nama;
    private String ukuran;
    private String harga;
    private String rasa;
    private String kemasan;
    
    //constructor
    public ElokCocacola(String nama, String ukuran, String harga, String rasa, String kemasan) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.harga = harga;
        this.rasa = rasa;
        this.kemasan = kemasan;
    }
    
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getHarga() {
        return harga;
    }

    public String getRasa() {
        return rasa;
    }

    public String getKemasan() {
        return kemasan;
    }
    
    
    
}
