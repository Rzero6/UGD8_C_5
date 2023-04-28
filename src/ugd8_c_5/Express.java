/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_c_5;

/**
 *
 * @author VICTUS
 */
public class Express extends Paket {
    private String idExpress;
    private double tarifJemput;

    public Express(String idExpress, double tarifJemput, String namaPenerima, String noTelpPenerima, double berat) {
        super(namaPenerima, noTelpPenerima, berat);
        this.idExpress = idExpress;
        this.tarifJemput = tarifJemput;
    }
    public void showPaketExpress(){
        showPaket();
        System.out.println("ID Paket Express : "+idExpress);
        System.out.println("Tarif Jemput\t : "+tarifJemput);
        totalBiayaExpress();
    }
    public void totalBiayaExpress(){
        System.out.println("Total Biaya\t : "+((berat*2000.0)+tarifJemput));
    }
}
