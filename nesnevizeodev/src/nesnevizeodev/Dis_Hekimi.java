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
public class Dis_Hekimi extends Personel{
    private final int DISHEKIMLIGIBIRLIK_NO;
    private final String DHBNO_VERILISTARIH;
    
    public Dis_Hekimi(final int DISHEKIMLIGIBIRLIK_NO,final String DHBNO_VERILISTARIH, String yakın_Akraba, Boolean kalifiye_Durum, String ad, String adres, int cepNo, String cinsiyet) {
        super(yakın_Akraba, kalifiye_Durum, ad, adres, cepNo, cinsiyet);
        this.DISHEKIMLIGIBIRLIK_NO = DISHEKIMLIGIBIRLIK_NO;
        this.DHBNO_VERILISTARIH = DHBNO_VERILISTARIH;
    }
    public void maliyet_Girdi(Hasta hasta,int maliyet){ //Dis_Hekimi Maliyet Güncellemesi veya Girdisi yapmak istediğinde yapabilir...
        hasta.tedavi_Maliyet(maliyet);
    }
    public int maliyet_Gör(Hasta hasta){
        return hasta.getMaliyet();
    }
      
}
