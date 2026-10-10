/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author macproi52019
 */
public class ElokCocacola extends Minuman {
    private String kadardaunkoka;
    
    public ElokCocacola() {
        kadardaunkoka= "";
    }

    public ElokCocacola(String nama, String ukuran, String harga, String rasa, String kemasan, String kadardaunkoka) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.kadardaunkoka = kadardaunkoka;
    }
    

    public String getKadardaunkoka() {
        return kadardaunkoka;
    }

 
    public void setDaunkadarkoka(String daunkadarkoka) {
        this. kadardaunkoka= daunkadarkoka;
    }

    

    
}
