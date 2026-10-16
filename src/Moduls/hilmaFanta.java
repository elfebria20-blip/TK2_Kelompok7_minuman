/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author HP
 */
public class hilmaFanta extends Minuman {
    private String bubukstrawberry;
    
    public hilmaFanta() {
        bubukstrawberry = "";
    }

    public hilmaFanta(String nama, String ukuran, String harga, String rasa, String kemasan, String bubukstrawberry ) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.bubukstrawberry = bubukstrawberry;
    }
    

    public String getBubukstrawberry() {
        return bubukstrawberry;
    }

 
    public void setBubukstrawberry (String bubukstrawberry) {
        this. bubukstrawberry = bubukstrawberry;
    }
}
