/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redondearpalabra;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ebers
 */
public class RedondearPalabra {

    public static void main(String[] args) {
        
      
        String[] palabras = {"muy3", "esto1", "bien4", "esta2"};

        
        String resultado = reordenarPalabras(palabras);
        
    
        System.out.println(resultado);
    }

    public static String reordenarPalabras(String[] palabras) {
       
        Map<Integer, String> mapa = new HashMap<>();
        
        // Procesar cada palabra en el arreglo
        for (String palabra : palabras) {
            
            int pos = Integer.parseInt(palabra.replaceAll("\\D", ""));
            // Extraer la palabra sin el número al final
            String palabraSinNumero = palabra.replaceAll("\\d", "");
            // Guardar la palabra en el mapa con la posición como clave
            mapa.put(pos, palabraSinNumero);
        }
        
        // Crear un StringBuilder para construir la oración final
        StringBuilder resultado = new StringBuilder();
        
        // Iterar sobre las posiciones en orden para construir la oración final
        for (int i = 1; i <= mapa.size(); i++) {
            if (i > 1) {
                resultado.append(" "); // Añadir un espacio entre palabras
            }
            resultado.append(mapa.get(i));
        }
        
       
        return resultado.toString();
    
    }
}
