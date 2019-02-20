/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.util.ArrayList;


/**
 *
 * @author symcc
 */
public class MerkezBankasi extends Observer {
    DosyaIslemleri dosya = new DosyaIslemleri("sonuclar.txt");
    public MerkezBankasi(Observee obs,ArrayList<Integer> ilgiListesi)
    {
        this.obs = obs;
        this.ilgiListesi.addAll(ilgiListesi);
        this.obs.attach(this);        
    }

    @Override
    public void update() {
        System.out.println("For "+obs.ilgilenen+". person  : "+(obs.guncellenenFirma+1)+". company updated : "+obs.firmaYeniDeger);
        dosya.veriEkle("For "+String.valueOf(obs.ilgilenen)+". person : "+String.valueOf((obs.guncellenenFirma)+1)+ ". company updated : "+String.valueOf(obs.firmaYeniDeger));
        dosya.yeniSatir();
    }
    
}
