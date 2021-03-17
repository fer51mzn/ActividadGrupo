package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entidades.Trabajador;

import java.util.List;
import java.util.Scanner;

/**
 * Clase Menu Trabajadores
 */
public class MenuTrabajadores {
    /**
     * Menu Principal
     */
    public static void principal(){
        System.out.print("1) Añadir\n2) Muestra\nOpción: ");
        Scanner scanner = new Scanner(System.in);
        String eleccion = scanner.nextLine();
        if (eleccion.equals("1")) {
            añadir();
        }
        else if(eleccion.equals("2")){
            muestra();
        }
    }

    /**
     * Con este metodo añadimos el Trabajador
     */



    private static void añadir() {
        System.out.println("Introduce dni para el nuevo trabajador:");
        Scanner scanner = new Scanner(System.in);
        String dni = scanner.nextLine();
        Trabajador trabajadorNuevo = new Trabajador(dni);
        DAOFactory.getInstance().getDaoTrabajadores().add(trabajadorNuevo);
    }

    /**
     * Con este metodo añadimos la lista de Trabajadores
     */
    public static void muestra(){
        List<Trabajador> trabajadores = DAOFactory.getInstance().getDaoTrabajadores().getAll();
        for (int i = 0; i < trabajadores.size(); i++) {
            Trabajador trabajador = trabajadores.get(i);
            System.out.println(" -"+i+" "+trabajador.getDni());
        }
    }
}
