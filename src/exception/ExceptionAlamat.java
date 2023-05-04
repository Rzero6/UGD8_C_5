/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author VICTUS
 */
public class ExceptionAlamat extends Exception{
    public void showMessage(String data){
        System.out.println("[!] "+data+" tidak diawali dengan huruf 'jln.' [!]");
    }
}
