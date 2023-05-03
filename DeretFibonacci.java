/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deret.fibonacci;
import java.util.*;
/**
 *
 * @author jirya
 */
public class DeretFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int f_n,f_n_1,f_n_2,n;
    Scanner inputUser= new Scanner(System.in);
    System.out.print("mengambil nilai fibonacci ke- : ");
    n= inputUser.nextInt();
    
    f_n_2 = 0;
    f_n_1 =1;
    f_n = 1;
    int i = 1;
    do {
        System.out.println("nilai ke - " + i+ " adalah " + f_n);
        
        f_n = f_n_1 + f_n_2;
        f_n_2 = f_n_1;
        f_n_1 = f_n;
        i++;
        }while(i<=n);
    }
  }
    
    

