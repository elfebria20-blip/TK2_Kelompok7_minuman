/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author rizal
 */
public class JaanGoldacoffe extends Minuman  {
    private String Kadarkopi;
    
    public JaanGoldacoffe() {
        Kadarkopi= "";
    }

    public JaanGoldacoffe(String nama, String ukuran, String harga, String rasa, String kemasan, String Kadarkopi) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.Kadarkopi = Kadarkopi;
    }
    

    public String getKadarkopi() {
        return Kadarkopi;
    }

 
    public void setKadarkopi(String Kadarkopi) {
        this. Kadarkopi= Kadarkopi;
    }
}
