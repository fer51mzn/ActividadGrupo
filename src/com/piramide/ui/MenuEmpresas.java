package com.piramide.ui;

import com.piramide.dao.DAOFactory;
import com.piramide.entidades.Empresa;
import com.piramide.entidades.Trabajador;

import java.util.List;
import java.util.Scanner;

public class MenuEmpresas {
    public static void principal(){
        System.out.print("1) Añadir\n2) Muestra\n3) Guarda\n4) Lee\nOpción: ");
        Scanner scanner = new Scanner(System.in);
        String eleccion = scanner.nextLine();
        if (eleccion.equals("1")) {
            añadir();
        }
        else if(eleccion.equals("2")){
            muestra();
        }
        else if(eleccion.equals("3")){
            DAOFactory.getInstance().getDaoEmpresas().save();
        }
        else if(eleccion.equals("4")){
            DAOFactory.getInstance().getDaoEmpresas().read();
        }
    }



    private static void añadir() {
        System.out.println("Introduce cif para la nueva empresa:");
        Scanner scanner = new Scanner(System.in);
        String cif = scanner.nextLine();
        Empresa empresaNuevo = new Empresa(cif);
        DAOFactory.getInstance().getDaoEmpresas().add(empresaNuevo);
    }

    public static void muestra(){
        List<Trabajador> trabajadores = DAOFactory.getInstance().getDaoTrabajadores().get();
        for (int i = 0; i < trabajadores.size(); i++) {
            Trabajador trabajador = trabajadores.get(i);
            System.out.println(" -"+i+" "+trabajador.getDni());
        }
    }
}
