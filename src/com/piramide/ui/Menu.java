package com.piramide.ui;

import java.util.Scanner;

/**
 * Clase Menu
 */
public class Menu {

    /**
     * MenuPrincipal
     */
    public static void principal(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1) Empresas\n2) Trabajadores\nOtro) Salir\nOpción: ");
            String opcionText = scanner.nextLine();
            if (opcionText.equals("1")) {
                MenuEmpresas.principal();
            } else if (opcionText.equals("2")) {
                MenuTrabajadores.principal();
            } else {
                break;
            }
        }
    }
}
