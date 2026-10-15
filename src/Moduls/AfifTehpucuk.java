/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author Hype G12
 */
public class AfifTehpucuk extends Minuman {
    private String ekstraktehmelati;
    
     public AfifTehpucuk() {
        ekstraktehmelati= "";
    }

    public AfifTehpucuk(String nama, String ukuran, String harga, String rasa, String kemasan, String ekstraktehmelati) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.ekstraktehmelati = ekstraktehmelati;
    }
    

    public String getEkstraktehmelati() {
        return ekstraktehmelati;
    }

 
    public void setEkstraktehmelati(String ekstraktehmelati) {
        this. ekstraktehmelati= ekstraktehmelati;
    }
}
