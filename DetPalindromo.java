/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package detpalindromo;
import java.util.Scanner;

/**
 *
 * @author PC
 */
    


public class DetPalindromo {

    public static boolean esPalindromo(String palabra) {
        if (palabra == null)
            return false;

        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }

    private static boolean esPalindromoAux(String palabra, int inicio, int fin) {
        // 1. Primer caso base: si los indices se cruzaron o encuntraron
        if (inicio >= fin) {
            return true;
        }

        // 2. Segundo caso base: si las letras son distintas
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // 3. Paso recursivo: seguimos avanzando
        return esPalindromoAux(palabra, inicio + 1, fin - 1);
    }

    //Pide ingresar una palabra para determinar si es o no es palindromo
public static void main(String[] args){
    Scanner lector = new Scanner(System.in);
    
    System.out.print("Ingrese la Palabra: ");
    //validamos la entrada de datos no vaya vacia
    String entrada=lector.nextLine().trim();
    if(entrada.isEmpty()){
        System.out.println("No ingresaste ninguna palabra");
    }else{
    
        //Concertimos a minuscula y evaluamos
        String textovalidado=entrada.toLowerCase();
        if(esPalindromo(textovalidado)){
            System.out.println(textovalidado+": "+"Es Palindromo");
        }else{
            System.out.println(textovalidado+": "+"No es Palindromo");
        }
    }
    
        lector.close();
    } 
}