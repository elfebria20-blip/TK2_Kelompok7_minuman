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
        
        
        // Golda coffe
        JaanGoldacoffe goldacoffe = new JaanGoldacoffe("goldacoffe", "kecil", "4.500", "golda", "Botol", "65%");
        
        
        System.out.println("Nama     :" + goldacoffe.getNama());
        System.out.println("Ukuran   :" + goldacoffe.getUkuran());
        System.out.println("Harga    :Rp " + goldacoffe.getHarga());
        System.out.println("Rasa     :" + goldacoffe.getRasa());
        System.out.println("Kemasan  :" + goldacoffe.getKemasan());
        System.out.println("Kadar kopi  :" + goldacoffe.getKadarkopi());
        
        System.out.println();
        
        // Sprite
        AzizSprite sprite = new AzizSprite("sprite", "Sedang", "5.000", "Lemon", "Botol", "0.001%");
        
        
        System.out.println("Nama     :" + sprite.getNama());
        System.out.println("Ukuran   :" + sprite.getUkuran());
        System.out.println("Harga    :Rp " + sprite.getHarga());
        System.out.println("Rasa     :" + sprite.getRasa());
        System.out.println("Kemasan  :" + sprite.getKemasan());
        System.out.println("Minyak Jeruk Nipis  :" + sprite.getMinyakjeruknipis());
        
        System.out.println();
        
        // teh pucuk
        AfifTehpucuk tehpucuk = new AfifTehpucuk("Teh Pucuk", "Sedang", "3.000", "Jasmine", "Botol", "0.5%");
        
        
        System.out.println("Nama     :" + tehpucuk.getNama());
        System.out.println("Ukuran   :" + tehpucuk.getUkuran());
        System.out.println("Harga    :Rp " + tehpucuk.getHarga());
        System.out.println("Rasa     :" + tehpucuk.getRasa());
        System.out.println("Kemasan  :" + tehpucuk.getKemasan());
        System.out.println("Ekstrak Teh  :" + tehpucuk.getEkstraktehmelati());
        
        System.out.println();
        
        // Pepsi
        RisyadPepsi pepsi = new RisyadPepsi("Pepsi", "Sedang", "10.000", "Pepsi", "Kaleng", "0.1%");
        
        
        System.out.println("Nama     :" + pepsi.getNama());
        System.out.println("Ukuran   :" + pepsi.getUkuran());
        System.out.println("Harga    :Rp " + pepsi.getHarga());
        System.out.println("Rasa     :" + pepsi.getRasa());
        System.out.println("Kemasan  :" + pepsi.getKemasan());
        System.out.println("Buah Sitrus  :" + pepsi.getBuahsitrus());
        
        System.out.println();
       
    }
    
}
