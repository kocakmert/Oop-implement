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
public class Hemsire extends Personel{
    private String ilkyardım_KatılımTarih;
    private String kurs_Ad;

    public Hemsire(String ilkyardım_KatılımTarih, String kurs_Ad, String yakın_Akraba, Boolean kalifiye_Durum, String ad, String adres, int cepNo, String cinsiyet) {
        super(yakın_Akraba, kalifiye_Durum, ad, adres, cepNo, cinsiyet);
        this.ilkyardım_KatılımTarih = ilkyardım_KatılımTarih;
        this.kurs_Ad = kurs_Ad;
    }
    

    public String getIlkyardım_KatılımTarih() {
        return ilkyardım_KatılımTarih;
    }

    public void setIlkyardım_KatılımTarih(String ilkyardım_KatılımTarih) {
        this.ilkyardım_KatılımTarih = ilkyardım_KatılımTarih;
    }

    public String getKurs_Ad() {
        return kurs_Ad;
    }

    public void setKurs_Ad(String kurs_Ad) {
        this.kurs_Ad = kurs_Ad;
    }
    
}
