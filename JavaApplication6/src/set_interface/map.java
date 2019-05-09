/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author DUC
 */
public class map {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "world");
        System.out.println(map.get(1));
        
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> key =  keySet.iterator();
        while (key.hasNext()) {
            Integer keys = key.next();
            System.out.println(keys +"-"+ map.get(key));
            
        }
                
    }
    
}
