/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;

/**
 *
 * @author VICTUS
 */
public class Paket {
    protected String namaPenerima,noTelpPenerima;
    protected double berat;

    public Paket(String namaPenerima, String noTelpPenerima, double berat) {
        this.namaPenerima = namaPenerima;
        this.noTelpPenerima = noTelpPenerima;
        this.berat = berat;
    }
    
    public void showPaket(){
        System.out.println("Nama Penerima\t : "+namaPenerima);
        System.out.println("No Telpon Penerima : "+noTelpPenerima);
        System.out.println("Berat Paket\t : "+berat);
    }
}
