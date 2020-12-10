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
public class Nesnevizeodev {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dis_Hekimi dd= new Dis_Hekimi(30, "17/12/2005","Mehmet", true, "Ahmet","Ankara" , 05345532432, "Erkek");
        //System.out.println(dd.getCalisan_No());
        Hasta hasta= new Hasta(dd, "2020-11-22", false, 0, "Mustafa", "Ankara", 03124553122, "Erkek");
         Hasta hasta2= new Hasta(dd, "2020-11-24", false, 0, "Alper", "Ankara", 03124553122, "Erkek");
        System.out.println(hasta.getHasta_id());
        dd.maliyet_Girdi(hasta,2000);
        System.out.println(hasta.getMaliyet()); //Hasta Kendi Maliyetini Görebilir...
        
        System.out.println(dd.maliyet_Gör(hasta)); //Hasta Kendi Maliyetini Görebilir...
        
        
        hasta.setRandevu_Durum(true);  //Randevuya geldiğini ifade ediyor...
        hasta2.setRandevu_Durum(false);
        
        //
        İstatistik is= new İstatistik();
        System.out.println(is.getListe()); //Hasta Kendi Maliyetini Görebilir...
    }
    
}
