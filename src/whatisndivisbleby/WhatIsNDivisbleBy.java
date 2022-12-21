/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatisndivisbleby;

import java.util.Arrays;

/**
 *
 * @author Aidan
 */
public class WhatIsNDivisbleBy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        int array[]= new int[n];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                array[j]=i;
                j++;
            }
        }
        System.out.print(Arrays.toString(array));
        System.out.print("\n"+j+" divisible numbers\n");
        if(j%2==0){
            System.out.print("Locker "+n+" will be closed");
        }
        else{
            System.out.print("Locker "+n+" will be open.\n");
        }
    }
    
}
