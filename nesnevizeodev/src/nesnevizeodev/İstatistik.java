/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnevizeodev;

import java.util.HashMap;

/**
 *
 * @author kocak
 */
public class İstatistik {
    static private HashMap<String,String> liste=new HashMap<>();
    public İstatistik(){
    }
    public İstatistik(HashMap<String, String> liste) {
        this.liste = liste;
    }
    public HashMap<String, String> getListe() {
        return liste;
    }

    public void setListe(String hasta_Ad,String durum) {
        //System.out.println(hasta_Ad);
        //System.out.println(durum);
        liste.put(hasta_Ad,durum);
        //this.liste = liste;
    }
}
