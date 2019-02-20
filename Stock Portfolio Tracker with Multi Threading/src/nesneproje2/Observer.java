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
public abstract class Observer {
    protected Observee obs;
    protected ArrayList<Integer> ilgiListesi = new ArrayList<>();
    public abstract void update();
}
