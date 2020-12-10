/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnevizeodev;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author kocak
 */
public class Personel extends İnsan{
    private String calisan_No="";
    private String yakın_Akraba;
    private Boolean kalifiye_Durum;
    private List<String> calisan_List=new ArrayList<>();

    public Personel(String yakın_Akraba, Boolean kalifiye_Durum, String ad, String adres, int cepNo, String cinsiyet) {
        super(ad, adres, cepNo, cinsiyet);
        this.yakın_Akraba = yakın_Akraba;
        this.kalifiye_Durum = kalifiye_Durum;
        this.calisan_No=setCalisan_No();
    }
   
    public String getCalisan_No() {
        return calisan_No;
    }

    public String setCalisan_No() {
        Random rand = new Random(); 
        int i=0;
        while(i<4){
            int value = rand.nextInt(9);
            this.calisan_No +=String.valueOf(value);
            i++;
        }
        if(calisan_List.equals(this.calisan_No)){ //aynı sayıda calisan_no olmaması için liste içinden sorgulanıyor.
            setCalisan_No();
        }
        calisan_List.add(this.calisan_No); //calisan_no listenin içine eklendi...
        return this.calisan_No;
    }
    public List<String> getCalisan_List() {
        return calisan_List;
    }
    public String getYakın_Akraba() {
        return yakın_Akraba;
    }

    public void setYakın_Akraba(String yakın_Akraba) {
        this.yakın_Akraba = yakın_Akraba;
    }

    public Boolean getKalifiye_Durum() {
        return kalifiye_Durum;
    }

    public void setKalifiye_Durum(Boolean kalifiye_Durum) {
        this.kalifiye_Durum = kalifiye_Durum;
    }
    
    
}
