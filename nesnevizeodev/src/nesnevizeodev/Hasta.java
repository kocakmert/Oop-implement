/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnevizeodev;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
/**
 *
 * @author kocak
 */
public class Hasta extends İnsan implements Maliyet{
    private String hasta_id="";
    private Dis_Hekimi dis_Hekimi;
    private String randevu_Tarih;
    private Boolean randevu_Durum;
    private int randevu_Kacırma;
    private int maliyet;
    static public int aktifhasta_Sayi;
    private List<String> hastaList=new ArrayList<>();
    private final int PARA_CEZASI=1500;
    private İstatistik istatistik;

    public Hasta(Dis_Hekimi dis_Hekimi, String randevu_Tarih, Boolean randevu_Durum, int randevu_Kacırma,String ad, String adres, int cepNo, String cinsiyet) {
        super(ad, adres, cepNo, cinsiyet);
        this.hasta_id = setHasta_id();
        this.dis_Hekimi = dis_Hekimi;
        this.randevu_Tarih = randevu_Tarih;
        this.randevu_Durum = randevu_Durum;
        this.randevu_Kacırma = randevu_Kacırma;
        
        this.randevu_Kacırma = randevu_Kacırma;
        aktifhasta_Sayi++;
    }
    
    public String getHasta_id() {
        return hasta_id;
    }
    public String setHasta_id() { //Hastaya id ataması gerçekleştiriliyor...
        Random rand = new Random(); 
        int i=0;
        while(i<7){
            int value = rand.nextInt(9);
            this.hasta_id +=String.valueOf(value);
            i++;
        }
        if(hastaList.equals(this.hasta_id)){ //aynı sayıda hasta_id olmaması için 
            setHasta_id();
        }
        hastaList.add(this.hasta_id); //liste içine eklendi...
        return this.hasta_id;
    }

    public static int getAktifhasta_Sayi() {
        return aktifhasta_Sayi;
    }

    public static void setAktifhasta_Sayi(int aktifhasta_Sayi) {
        Hasta.aktifhasta_Sayi = aktifhasta_Sayi;
    }

    public Dis_Hekimi getDis_Hekimi() { //Doktor Bilgileri için...
        return dis_Hekimi;
    }
    public Boolean getRandevu_Durum() {
        return randevu_Durum;
    }
    public void setRandevu_Durum(Boolean randevu_Durum) { //Randevu Durumu Güncellendiğinde İstatistik Sınıfındaki Listeye aktarılır.
        this.randevu_Durum = randevu_Durum;
        istatistik = new İstatistik();
        
        if(this.randevu_Durum == false){
            this.randevu_Kacırma++;   //Randevu Kaçırma sayacı bir a...
            istatistik.setListe(getAd(),"Kaçırdı..");  //Randevu Kaçırıldıysa  listeye yazılıyor..
        }
        else{
            //System.out.println(getAd());
            istatistik.setListe(getAd(),"Randevuya Geldi");  //  listeye yazılıyor..
        }
    }
    public int getRandevu_Kacırma() {
        return randevu_Kacırma;
    }

    public int getMaliyet() {
        return maliyet;
    }

    public void setMaliyet(int maliyet) {
        this.maliyet = maliyet;
    }
    
    public void hatirlatma_Mesaj() throws ParseException{
        Date now = new Date();
        //System.out.println(now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = simpleDateFormat.parse(this.randevu_Tarih);
        if(date.compareTo(now)<3){
            System.out.println(getAd()+"İsimli Hastanın Randevusune 2 Gün Kaldı");
        }
        else{
            System.out.println("Randevuya Daha Zaman Var...");
        }
    }
    public void para_Cezasi(){
        if(getRandevu_Kacırma()>3){
            System.out.println("Dikkat...Cezai İşlem Uygulanmıştır...");
            maliyet+=PARA_CEZASI;
        }
    }
    @Override
    public void tedavi_Maliyet(int maliyet) {  //Hastanın Maliyeti Setlenir...
        setMaliyet(maliyet);
    }
}
