/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdal
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    public static boolean IsAlphapit(String s){
        for (int i=0; i<s.length();i++){
            if(!Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1 ="Abdullah";
        String str2="Ahmed";
        String str;
        str = Ref_Static.betterString(str1,str2, (s1,s2)->s1.length()> s2.length());
        System.out.println(str);
        System.out.println(IsAlphapit("Abdullah_2020"));
    
    }
    
}
