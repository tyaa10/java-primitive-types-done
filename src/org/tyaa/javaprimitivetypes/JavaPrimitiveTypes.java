/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaprimitivetypes;

/**
 *
 * @author student
 */
public class JavaPrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte b1 = -128;
        byte b2 = 127;
        
        short sh1 = 12435;
        int i1 = 123456789;
        long l1 = 12345678912345L;
        long l2;
        //l2 = 12345678912345;
        l1 += l1;
        
        float f1 = 19.12f;
        double d1 = 345365.576897d;
        
        char ch1 = 'a';
        /*for (int i = 0; i < 26; i++) {
            System.out.println(ch1++);
        }*/
        
        boolean boo1 = true;
        
        final int con1 = 911;
        //con1 = 2;
        System.out.println(con1);
        
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        //https://cs.fit.edu/~ryan/java/language/java-data.html
    }
    
}
