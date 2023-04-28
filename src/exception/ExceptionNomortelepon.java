/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Msi Modern 14
 */
public class ExceptionNomortelepon extends Exception{
    public void showMessage(){
        System.out.println("[!] Nomor Telepon Harus Antara 11-13 Digit [!]");
    }
}
