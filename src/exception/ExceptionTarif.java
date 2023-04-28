/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Msi Modern 14
 */
public class ExceptionTarif extends Exception{
    public void showMessageReguler(){
        System.out.println("[!] Tarif Packing Reguler harus Diantara 0 dan 20000 [!]");
    }
    
    public void showMessageExpress(){
        System.out.println("[!] Tarif Jemput Express Harus Diantara 5000 dan 22000 [!]");
    }
}
