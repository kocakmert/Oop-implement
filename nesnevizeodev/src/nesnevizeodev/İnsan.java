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
public class İnsan {
    private String ad;
    private String adres;
    private int cepNo;
    private String cinsiyet;

    public İnsan(String ad, String adres, int cepNo, String cinsiyet) {
        this.ad = ad;
        this.adres = adres;
        this.cepNo = cepNo;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getCepNo() {
        return cepNo;
    }

    public void setCepNo(int cepNo) {
        this.cepNo = cepNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    } 
}
