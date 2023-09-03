/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strings;
import java.util.Scanner;
/**
 *
 * @author Ghifari
 */
public class Strings {
    public static String AIsLarger(String A, String B){
        return A.compareTo(B)> 0? "Yes" : "No";
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input String 1 : ");
        String A=sc.next();
        System.out.print("Input String 2 : ");
        String B=sc.next();
        System.out.println((A.length() + B.length()));
        System.out.println(AIsLarger(A, B));
        System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+""+B.substring(0,1).toUpperCase()+B.substring(1)+"");
    }
}
