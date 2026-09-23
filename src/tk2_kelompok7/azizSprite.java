/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2_kelompok7;

/**
 *
 * @author MH STORE
 */
public class azizSprite {
    
    //Atribut
    private String nama;
    private String ukuran;
    private String harga;
    private String rasa;
    private String kemasan;
    
    //Constructor
    public azizSprite(String nama, String ukuran, String harga, String rasa, String kemasan) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.harga = harga;
        this.rasa = rasa;
        this.kemasan = kemasan;
    }
    
    
    //Setter
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

    //Getter
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
