package com.mycompany.argumentos2;

/**
 *
 * @author josep
 */
public class Argumentos2 {

    public static void main(String[] args) {
       
        String Arg1 = args[0];
        String Arg2 = args[1];
        int arg2_numero = Integer.parseInt(Arg2);
        
        for (int i = 0;i <= arg2_numero; i++){
            System.out.println(Arg1 + ": " + i);
        }
        
        
    }
}
