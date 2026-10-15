/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moduls;

/**
 *
 * @author MH STORE
 */
public class AzizSprite extends Minuman{
    private String minyakjeruknipis;
    
    public AzizSprite() {
        minyakjeruknipis= "";
    }

    public AzizSprite(String nama, String ukuran, String harga, String rasa, String kemasan, String minyakjeruknipis) {
        super(nama, ukuran, harga, rasa, kemasan);
        this.minyakjeruknipis = minyakjeruknipis;
    }
    

    public String getMinyakjeruknipis() {
        return minyakjeruknipis;
    }

 
    public void setMinyakjeruknipis(String minyakjeruknipis) {
        this. minyakjeruknipis= minyakjeruknipis;
    }
    
}
