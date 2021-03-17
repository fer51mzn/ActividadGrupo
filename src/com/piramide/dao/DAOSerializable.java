package com.piramide.dao;

import java.io.*;

/**
 * Clase Serializable
 */
public abstract class DAOSerializable {
    /**
     * Fichero
     */
    protected final String file;

    /**
     * Serializable
     * @param file
     */
    public DAOSerializable(String file){
        this.file = file;
    }

    /**
     * Con este metodo Guardamos
     * @param obj
     */
    protected void save(Object obj){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Con este metodo leemos
     * @return
     */
    protected Object read(){
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Todavía no existe el fichero que intentas leer");
        }
        return obj;
    }

}
