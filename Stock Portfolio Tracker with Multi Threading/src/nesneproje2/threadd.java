/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.util.Random;

/**
 *
 * @author symcc
 */
public class threadd implements Runnable {
    
    public int baseDeger;
    public threadd(int baseDeger)
    {
        this.baseDeger=baseDeger;
    }
    @Override
    public void run() {
        Random rand = new Random();
        int change = (rand.nextInt(100))+1 ;
        synchronized (this) {
            baseDeger += change;
        }
    }    
}
