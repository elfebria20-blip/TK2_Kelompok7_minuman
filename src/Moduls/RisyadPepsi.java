/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author mac
 */
public class RisyadPepsi extends Minuman{
    private String buahsitrus;
    
    public RisyadPepsi() {
        buahsitrus= "";
    }

    public RisyadPepsi(String nama, String ukuran, String harga, String rasa, String kemasan, String buahsitrus) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.buahsitrus = buahsitrus;
    }
    

    public String getBuahsitrus() {
        return buahsitrus;
    }

 
    public void setBuahsitrus(String buahsitrus) {
        this. buahsitrus= buahsitrus;
    }

}
