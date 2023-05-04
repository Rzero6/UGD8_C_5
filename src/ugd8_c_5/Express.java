/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;

import exception.ExceptionBerat;
import exception.ExceptionId;
import exception.ExceptionNama;
import exception.ExceptionNomortelepon;
import exception.ExceptionTarif;

/**
 *
 * @author VICTUS
 */
public class Express extends Paket {
    private String idExpress;
    private double tarifJemput;

    public Express(String idExpress, double tarifJemput, String namaPenerima, String noTelpPenerima, double berat) throws ExceptionNama, ExceptionNomortelepon, ExceptionBerat,ExceptionId,ExceptionTarif {
        super(namaPenerima, noTelpPenerima, berat);
        if(!idExpress.contains("EXP-")){
            throw new ExceptionId();
        }else if(tarifJemput>22000.0 || tarifJemput<5000.0){
            throw new ExceptionTarif();
        }else{
            this.idExpress = idExpress;
            this.tarifJemput = tarifJemput;
        }
    }
    public void showPaketExpress(){
        showPaket();
        System.out.println("ID Paket Express\t : "+idExpress);
        System.out.println("Tarif Jemput\t\t : "+tarifJemput);
        totalBiayaExpress();
    }
    public void totalBiayaExpress(){
        System.out.println("Total Biaya\t\t : "+((berat*2000.0)+tarifJemput));
    }
}
