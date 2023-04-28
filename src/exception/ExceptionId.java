/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Msi Modern 14
 */
public class ExceptionId extends Exception{
    public void showMessageReguler(){
        System.out.println("[!] ID Paket Reguler Harus Ada Unsur 'REG-' [!]");
    }
    
    public void showMessageExpress(){
        System.out.println("[!] ID Paket Express Harus Ada Unsur ' EXP-' [!]");
    }
}
