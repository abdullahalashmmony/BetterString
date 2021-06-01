/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdal
 */

interface Comp_String{
    boolean Compare(String s1, String s2);
}
public class Ref_Static {
    
   public static String betterString(String s1 , String s2, Comp_String comp){
        if (comp.Compare(s1, s2)){
            return s1;
        }
        else{
            return s2;
        }
    }
}
