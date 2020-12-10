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
public abstract class Koltuk {
    private final String URETİCİ;
    private final int URETİM_NO;
    private final String URETİM_TARİHİ;

    public Koltuk(final String URETİCİ,final int URETİM_NO,final String URETİM_TARİHİ) {
        this.URETİCİ = URETİCİ;
        this.URETİM_NO = URETİM_NO;
        this.URETİM_TARİHİ = URETİM_TARİHİ;
    }

    public String getURETİCİ() {
        return URETİCİ;
    }

    public int getURETİM_NO() {
        return URETİM_NO;
    }

    public String getURETİM_TARİHİ() {
        return URETİM_TARİHİ;
    }
    
    public abstract void Genel_Muayene();
    
}
