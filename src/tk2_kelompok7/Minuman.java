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
        
        // sprite
        azizSprite sprite = new azizSprite("Sprite No sugar", "390 ml", "5.000", "Lemon-Lime", "Kaleng");
        
        
        System.out.println("Nama     :" + sprite.getNama());
        System.out.println("Ukuran   :" + sprite.getUkuran());
        System.out.println("Harga    :Rp " + sprite.getHarga());
        System.out.println("Rasa     :" + sprite.getRasa());
        System.out.println("Kemasan  :" + sprite.getKemasan());
        
        System.out.println();

        //fanta
        hilmaFanta Fanta = new hilmaFanta("Fanta", "1 Liter", "10.000", "Strawberry", "Botol");
        
        
        System.out.println("Nama     :" + Fanta.getNama());
        System.out.println("Ukuran   :" + Fanta.getUkuran());
        System.out.println("Harga    :Rp " + Fanta.getHarga());
        System.out.println("Rasa     :" + Fanta.getRasa());
        System.out.println("Kemasan  :" + Fanta.getKemasan());
        
        System.out.println();
        
        //TEH PUCUK
        Afiftehpucuk tehpucuk = new Afiftehpucuk("Teh Pucuk Harum", "450 mil", "5.000", "Teh Manis", "Botol");
        
        
        System.out.println("Nama     :" + tehpucuk.getNama());
        System.out.println("Ukuran   :" + tehpucuk.getUkuran());
        System.out.println("Harga    :Rp " + tehpucuk.getHarga());
        System.out.println("Rasa     :" + tehpucuk.getRasa());
        System.out.println("Kemasan  :" + tehpucuk.getKemasan());
        
        System.out.println();
        
        
        //GOLDA COFFEE
        jaanGoldaCoffee Goldacoffe = new jaanGoldaCoffee("Golda Latte", "250 ml", "5.000", "Golda", "Botol");
        
        
        System.out.println("Nama     :" + Goldacoffe.getNama());
        System.out.println("Ukuran   :" + Goldacoffe.getUkuran());
        System.out.println("Harga    :Rp " + Goldacoffe.getHarga());
        System.out.println("Rasa     :" + Goldacoffe.getRasa());
        System.out.println("Kemasan  :" + Goldacoffe.getKemasan());
       
        
        System.out.println();
        
        //PEPSIIIIIII
        
        RisyadPepsi pepsi = new RisyadPepsi("Pepsi", "100 ml", "5.500", "Pepsi", "Botol");
        
        
        System.out.println("Nama     :" + pepsi.getNama());
        System.out.println("Ukuran   :" + pepsi.getUkuran());
        System.out.println("Harga    :Rp " + pepsi.getHarga());
        System.out.println("Rasa     :" + pepsi.getRasa());
        System.out.println("Kemasan  :" + pepsi.getKemasan());
        
        System.out.println();
        
    }
    
}
