/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;
import exception.ExceptionNama;
import exception.ExceptionNomortelepon;
import exception.ExceptionBerat;
import exception.ExceptionTarif;
import exception.ExceptionId;
/**
 *
 * @author VICTUS
 */
public class Reguler extends Paket {
    private String idReguler;
    private double tarifPacking;

    public Reguler(String idReguler, double tarifPacking, String namaPenerima, String noTelpPenerima, double berat)throws ExceptionNama, ExceptionNomortelepon, ExceptionBerat,ExceptionId,ExceptionTarif {
        super(namaPenerima, noTelpPenerima, berat);
        if(!idReguler.contains("REG-")){
            throw new ExceptionId();
        }else if(tarifPacking>20000 && tarifPacking<0){
            throw new ExceptionTarif();
        }else{
            this.idReguler = idReguler;
            this.tarifPacking = tarifPacking; 
        }
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
