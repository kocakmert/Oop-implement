/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnevizeodev;

/**
 *
 * @author kocak
 */
public class Koltuk_B extends Koltuk implements Kanal_Tedavisi{

    public Koltuk_B(String URETİCİ, int URETİM_NO, String URETİM_TARİHİ) {
        super(URETİCİ, URETİM_NO, URETİM_TARİHİ);
    }
    @Override
    public void Genel_Muayene() {
         System.out.println("Koltuk B Genel Muayane Yapılabilir durumda...");
    }
    @Override
    public void kanal_Tedavisi() {
         System.out.println("Koltuk B Kanal Tedavisi iŞLEMİ yapabilir durumda..");
    }
    @Override
    public void muzikBaslat() {
        System.out.println("Koltuk B ,Slow Muzik Çalıyor.");
    }   
}
