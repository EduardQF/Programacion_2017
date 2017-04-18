/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video11;

import java.util.Comparator;

/**
 *
 * @author Eduard QF
 */
public class NewCompareitor implements Comparator<Mascota> {

    @Override
    public int compare(Mascota o1, Mascota o2) {
         return o1.getNombre().compareTo(o2.getNombre());
    }

}
