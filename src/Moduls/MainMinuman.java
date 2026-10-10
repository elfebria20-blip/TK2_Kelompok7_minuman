/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Moduls;

/**
 *
 * @author macproi52019
 */
public class MainMinuman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Coca Cola
        ElokCocacola cocacola = new ElokCocacola("Cocacola", "Sedang", "14.000", "Cola", "Botol", "10%");
        
        
        System.out.println("Nama     :" + cocacola.getNama());
        System.out.println("Ukuran   :" + cocacola.getUkuran());
        System.out.println("Harga    :Rp " + cocacola.getHarga());
        System.out.println("Rasa     :" + cocacola.getRasa());
        System.out.println("Kemasan  :" + cocacola.getKemasan());
        System.out.println("Kadar daun koka  :" + cocacola.getKadardaunkoka());
        
        System.out.println();
        
       
    }
    
}
