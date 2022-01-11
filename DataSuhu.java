/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konversi.suhu.example.Konversi.suhu;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DataSuhu {
    void kelvinkecelcius(float K, float C) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void kelvinkefahrenheit(float K, float F) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void kelvinkereaumur(float K, float R) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void celciuskekelvin(float C, float K) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void celciuskefahrenheit(float C, float F) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void celciuskereaumur(float C, float R) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void fahrenheitkekelvin(float F, float K) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void fahrenheitkecelcius(float F, float C) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void fahrenheitkereaumur(float F, float R) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void reaumurkekelvin(float R, float K) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void reamurkecelcius(float R, float C) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void reamurkefarenheit(float R, float F) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public class DataSuhutes{


        Scanner scan = new Scanner(System.in);
        public void kelvinkecelcius(float K, float C){
            System.out.print("masukan derajat kelvin : " );
            K = scan.nextFloat();
            C = (float) (K - 273.15);
            System.out.println("hasil : " + C);
        }  
        public void kelvinkefahrenheit (float K, float F){
            System.out.print("masukan derajat kelvin : " );
            K = scan.nextFloat();
            F = (float) (K * 1.8 - 459.67);
            System.out.println("hasil : " + F);
        }
        public void kelvinkereaumur (float K, float R){
            System.out.print("masukan derajat kelvin : " );
            K = scan.nextFloat();
            R = (float) ((K - 273.15) * 0.8);
            System.out.println("hasil : " + R);
        }

       public void celciuskekelvin (float C, float K){
           System.out.print("masukan derajat celcius : " );
           C = scan.nextFloat();
           K = (float) (C + 273.15);
           System.out.println("hasil : " + K);
       } 
       public void celciuskefahrenheit (float C, float F){
           System.out.print("masukan nilai celcius : " );
           C = scan.nextFloat();
           F = (float) (C * 1.8 + 32);
           System.out.println("hasil : " + F);
       }
       public void celciuskereaumur (float C, float R){
           System.out.print("masukan nilai celcius : ");
           C = scan.nextFloat();
           R = (float) (C * 0.8);
           System.out.println("hasil : " + R);
       }
       public void fahrenheitkekelvin (float F, float K){
           System.out.print("masukan nilai fahrenheit : " );
           F = scan.nextFloat();
           K = (float) ((F + 459.67) / 1.8);
           System.out.println("hasil : " + K);
       }
       public void fahrenheitkecelcius (float F, float C){
           System.out.print("masukan derajat fahrenheit : " );
           F = scan.nextFloat();
           C = (float) ((F - 32) / 1.8);
           System.out.println("hasil : " + C);
       }
       public void fahrenheitkereaumur (float F, float R){
           System.out.print("masukan derajat fahrenheit : " );
           F = scan.nextFloat();
           R = (float) ((F - 32) / 0.44);
           System.out.println("hasil : " + R);
       }

       public void reaumurkekelvin (float R, float K){
           System.out.print("masukan derajat reamur : " );
           R = scan.nextFloat();
           K = (float) (R / 0.8 + 273.15);
           System.out.println("hasil : " + K);
       }
       public void reamurkecelcius (float R, float C){
           System.out.print("masukan derajat reaumur : " );
           R = scan.nextFloat();
           C = (float) (R / 0.8);
           System.out.println("hasil : " +C);
       }
       public void reamurkefarenheit (float R,float F){
           System.out.print("masukan derajat reamur : ");
           R = scan.nextFloat();
           F = (float) (R * 2.25 + 32);
           System.out.println("hasil : " + F);
       }

        void kelvinkecelcius() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}