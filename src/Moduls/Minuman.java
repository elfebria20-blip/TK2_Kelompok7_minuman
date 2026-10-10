/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author macproi52019
 */
public class Minuman {

    public String nama;
    public String ukuran;
    public String harga;
    public String rasa;
    public String kemasan;

    public Minuman() {
        nama = "";
        ukuran = "";
        harga = "";
        rasa = "";
        kemasan = "";
    }
    //Constructor

    public Minuman(String nama, String ukuran, String harga, String rasa, String kemasan) {
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
