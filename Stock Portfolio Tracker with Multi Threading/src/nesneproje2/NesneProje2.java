/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author symcc
 */

public class NesneProje2 {    
    public static ArrayList<Integer> ilgi = new ArrayList<>();
    public static Observee subj = new Observee();
    public static int sayac=0,saniye=0;
    
    public static void main(String[] args) {
        DosyaIslemleri d1 = new DosyaIslemleri("sonuclar.txt");
        d1.dosyayiBosalt();
        int giris=0,klavyeGirisi;
        String gecici;
        Scanner klavye = new Scanner(System.in);
        while(true)
        {
        System.out.println("1-New Observer\n"
                + "2-Start Observation\n"
                + "3-Exit");
        klavyeGirisi=klavye.nextInt();
        if(klavyeGirisi==1)
        {
            ilgi.clear();
            while(true)
            {
                System.out.print("Please enter the companys those you wish to observe one by one (A/B/C/D/E) .(Q for exit)");
                gecici = klavye.next();
                if(gecici.equals("Q") || gecici.equals("q"))
                    break;
                if(gecici.equals("a") || gecici.equals("A"))
                    giris=0; 
                else if(gecici.equals("b") || gecici.equals("B"))
                    giris=1;
                else if(gecici.equals("c")|| gecici.equals("C"))
                    giris=2;
                else if(gecici.equals("d") || gecici.equals("D"))
                    giris=3;
                else if (gecici.equals("e") || gecici.equals("E"))
                    giris=4;
                else{
                    System.out.println("hatali giris!");
                    break;
                }                 
                ilgi.add(giris);
            }// end of while
            
            if(!ilgi.isEmpty())
                new MerkezBankasi(subj,ilgi);
            
            
        }else if(klavyeGirisi==2)
        {
           System.out.print("How many second do you want to observe ? :");
           saniye = klavye.nextInt();
           System.out.println();
           Timer gorev =new Timer();
           TimerTask tt = new TimerTask()
        {
           @Override
            public void run() {                                
                subj.Guncelle();
                sayac++;
                if(sayac==saniye)
                    gorev.cancel();
           }         
            
        };gorev.schedule(tt,1000,2000);
        
       
        
        }else if (klavyeGirisi==3)
        {       
            break;    
        }else{      
            System.err.println("Incorrect Entry!");
        }
        
        }// end of while    
       
    }
   
}