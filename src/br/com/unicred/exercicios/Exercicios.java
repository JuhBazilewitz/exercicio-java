package br.com.unicred.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicios {
    
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.println("Line entered : " + line);
            }
        }
        catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
        }
    }
    
    
}
