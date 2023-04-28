/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;
import exception.ExceptionNama;
import exception.ExceptionNomortelepon;
import exception.ExceptionBerat;
/**
 *
 * @author VICTUS
 */
public class Paket {
    protected String namaPenerima,noTelpPenerima;
    protected double berat;

    public Paket(String namaPenerima, String noTelpPenerima, double berat) throws ExceptionNama, ExceptionNomortelepon, ExceptionBerat {
        if(namaPenerima.isBlank()){
            throw new ExceptionNama();
        }else if(noTelpPenerima.length()<11 || noTelpPenerima.length()>13){
            throw new ExceptionNomortelepon();
        }else if(berat<=0){
            throw new ExceptionBerat();
        }else{
            this.namaPenerima = namaPenerima;
            this.noTelpPenerima = noTelpPenerima;
            this.berat = berat;   
        }
    }
    
    public void showPaket(){
        System.out.println("\nNama Penerima\t\t : "+namaPenerima);
        System.out.println("No Telpon Penerima\t : "+noTelpPenerima);
        System.out.println("Berat Paket\t\t : "+berat);
    }
}
