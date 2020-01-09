/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author LCPC01
 */
public class Encriptacion {

    public static String SHA256 = "SHA-256";

    public static String getStringMessageDigest(String cadena, String algoritm) {
        byte[] digest = null;
        byte[] buffer = cadena.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algoritm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error creando digest");
        }
        return toHexadecimal(digest);
    }

    private static String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux: digest ) {
            int b=aux & 0xff;
            if(Integer.toHexString(b).length()==1) hash +="0";
            hash += Integer.toHexString(b);
        }
        return hash;
    }
}
