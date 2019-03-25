package com.Prueba.Triangulo;

import java.util.ArrayList;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
        triangulos.add(new Triangulo(1, 2, 3));
        triangulos.add(new Triangulo(2, 2, 3));
        triangulos.add(new Triangulo(2, 2, 2));
        triangulos.add(new Triangulo(1, 5, 3));
        triangulos.add(new Triangulo(1, 5, 5));
        triangulos.add(new Triangulo(2, 2, 2));
        
        Gson gson = new Gson();
    	String formatoJSON = gson.toJson(triangulos);
    	System.out.println(formatoJSON);
    }
}
