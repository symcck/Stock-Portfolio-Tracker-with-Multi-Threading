/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author symcc
 */
public class DosyaIslemleri {
    private String dosyaAdi;
    public DosyaIslemleri(String dosyaAdi)
    {
        this.dosyaAdi=dosyaAdi;
    }
    public void veriEkle(String veri)        // Bu methot dosyaya bir veri eklemek icindir.Guncelleme yapar dosyanin uzerine yazmaz.
   {    
       try{
             File dosya = new File(dosyaAdi);
             FileWriter yazici = new FileWriter(dosya,true);
             BufferedWriter yaz = new BufferedWriter(yazici);
             yaz.write(veri);
             yaz.close();
             
            }
         catch (Exception hata){
              hata.printStackTrace();
            }
   }
    public void dosyayiBosalt()           // Dosyayi bosaltir.
    {
        try{
             File dosya = new File(dosyaAdi);
             FileWriter yazici = new FileWriter(dosya);
             BufferedWriter yaz = new BufferedWriter(yazici);
             yaz.write("");             
             yaz.close();
            }
         catch (Exception hata){
              hata.printStackTrace();
            }
    }
    public void yeniSatir()              // Veri ekle methoduyla sinerjisi vardir.Basitce dosyada alt satira gecilir.
    {
        try{
             File dosya = new File(dosyaAdi);
             FileWriter yazici = new FileWriter(dosya,true);
             BufferedWriter yaz = new BufferedWriter(yazici);
             yaz.newLine();
             yaz.close();
             
            }
         catch (Exception hata){
              hata.printStackTrace();
            }
        
    }
   public void kapa(Scanner okuma)   // rehber.txt yi kapatir.
   {    
       okuma.close();
   }
}
