/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificar_cedula;

import java.util.Scanner;

/**
 *
 * @author Juan Neira
 */
public class Verificar_cedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cedula="";
        Scanner c = new Scanner(System. in);
        System.out.println("Ingrese su numero de cedula");
        cedula =c.nextLine();
        
        System.out.println(valida(cedula));
    }

    public static boolean valida(String cadena) {
        String s;
        int d = 1;

        if (cadena.length() <= 9) {
            return false;
        } else {
            int a[] = new int[cadena.length()];
            int c = 0;
           
            for (int i = 0; i < cadena.length(); i++) {
                a[i] = Integer.parseInt(String.valueOf(cadena.charAt(c)));
                System.out.println(a[i]);
                c = c + 1;
                if ((a[i]>=1) && a[i]<=9) {
                    d=d+1;
                }
            }
                                System.out.println(d);

        }
        if (d == 10) {
            return true;
        }else{
            return false;
        }
    }
}

