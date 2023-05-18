package javaapplication42;

import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication42 {

    public static void main(String[] args) {
        int arr[]={21,34,2,-5,-45,83,292};
        Arrays.sort(arr);
        int enYakinMin=Integer.MIN_VALUE , enYakinMax=Integer.MAX_VALUE;
    
        Scanner input=new Scanner(System.in);
        System.out.println("dizide kendine en yakin degerleri bulmak istediginiz sayi? ");
        int deger=input.nextInt();
        
        for (int i : arr) {
            if(i<deger && i>enYakinMin){
                enYakinMin=i;
            }
            if( i>deger ){
                enYakinMax=i;
                break;
            }
        }
        
        System.out.println("en yakın min sayi: "+enYakinMin+ "en yakin max sayi: "+enYakinMax);
        
        
        
        
    }
    
    
    
}
