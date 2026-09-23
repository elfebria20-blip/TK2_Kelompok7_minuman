/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk2_kelompok7;

/**
 *
 * @author macproi52019
 */
public class Minuman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Coca Cola
        ElokCocacola cocacola = new ElokCocacola("Cocacola", "Sedang", "14.000", "Cola", "Botol");
        
        
        System.out.println("Nama     :" + cocacola.getNama());
        System.out.println("Ukuran   :" + cocacola.getUkuran());
        System.out.println("Harga    :Rp " + cocacola.getHarga());
        System.out.println("Rasa     :" + cocacola.getRasa());
        System.out.println("Kemasan  :" + cocacola.getKemasan());
        
        System.out.println();
        
        azizSprite sprite = new azizSprite("Sprite No sugar", "390 ml", "5.000", "Lemon-Lime", "Kaleng");
        
        
        System.out.println("Nama     :" + sprite.getNama());
        System.out.println("Ukuran   :" + sprite.getUkuran());
        System.out.println("Harga    :Rp " + sprite.getHarga());
        System.out.println("Rasa     :" + sprite.getRasa());
        System.out.println("Kemasan  :" + sprite.getKemasan());
        
        System.out.println();

    }
    
}
