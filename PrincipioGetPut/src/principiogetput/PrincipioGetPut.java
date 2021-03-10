/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiogetput;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.copy;
import java.util.List;

/**
 *
 * @author Lucas Murilo
 */
public class PrincipioGetPut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(6.23, 2.25);
        List<Object> myObjects = new ArrayList<>();
        
        
        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);
      
    }
    
    public static void copy(List<? extends Number> copy, List<? super Number> destiny){
        
        for(Number number: copy ){
            destiny.add(number);
        }
        
        
    }
    
    public static void printList(List<?> list){
        for(Object pr : list){
            System.out.print(pr + " ");
        }
        System.out.println();
    }
    
}
