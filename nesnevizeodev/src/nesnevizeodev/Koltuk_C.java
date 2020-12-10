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
public class Koltuk_C extends Koltuk{

    public Koltuk_C(String URETİCİ, int URETİM_NO, String URETİM_TARİHİ) {
        super(URETİCİ, URETİM_NO, URETİM_TARİHİ);
    }
    public void dis_Tasi() {
        System.out.println("Koltuk C Diş Taşı Temizliği...");
    }
    public void dis_Cekim() {
        System.out.println("Koltuk C Diş Çekimi....");
    }
    public void dolgu() {
        System.out.println("Koltuk C dolgu için hazır...");
    }
    @Override
    public void Genel_Muayene() {
        System.out.println("Koltuk C Hazır...");
    }
    
}
