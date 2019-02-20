/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author symcc
 */
public class Observee {
    
    private List<Observer> observers = new ArrayList<Observer>();

    public int guncellenenFirma,firmaYeniDeger,ilgilenen;   
    public int[] firmalar = new int[]{0,0,0,0,0};
    private int sayac ;
   
    public void Guncelle()
    {
        guncellenenFirma = ((int) (Math.random()*5));
        int base =0;
        threadd treat = new threadd(base);
        Thread t = new Thread(treat);
        
        t.start();
        try {
            t.join();
            }catch (InterruptedException ex) {
            Logger.getLogger(NesneProje2.class.getName()).log(Level.SEVERE, null, ex);
        }
           firmaYeniDeger=treat.baseDeger;
           firmalar[guncellenenFirma]+=firmaYeniDeger;
           firmaYeniDeger=firmalar[guncellenenFirma];
           System.out.println((guncellenenFirma+1)+" . company updated : "+firmalar[guncellenenFirma]);
           notifyObservers();
    
    }
 
    public void attach(Observer observer)
    {
        observers.add(observer);

    }
    public void notifyObservers()
    {  
        ilgilenen=1;
        for(Observer a : observers)
        {
            for(int i=0; i<a.ilgiListesi.size() ; i++)
            {
                if(guncellenenFirma==a.ilgiListesi.get(i))
                {
                    a.update();
                }
            }
            ilgilenen++;
        }
    }
}