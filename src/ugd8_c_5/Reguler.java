/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;

/**
 *
 * @author VICTUS
 */
public class Reguler extends Paket {
    private String idReguler;
    private double tarifPacking;

    public Reguler(String idReguler, double tarifPacking, String namaPenerima, String noTelpPenerima, double berat) {
        super(namaPenerima, noTelpPenerima, berat);
        this.idReguler = idReguler;
        this.tarifPacking = tarifPacking;
    }
    
    public void showPaketReguler(){
        showPaket();
        System.out.println("ID Paket Reguler : "+idReguler);
        System.out.println("Tarif Packing\t : "+tarifPacking);
        totalBiayaReguler();
    }
    
    public void totalBiayaReguler(){
        System.out.println("Total Biaya\t : "+(berat*4000.0)+tarifPacking);
    }
}
