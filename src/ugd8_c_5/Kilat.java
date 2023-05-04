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
import exception.ExceptionAlamat;

/**
 *
 * @author VICTUS
 */
public class Kilat extends Paket {
    private String idKilat,alamatPenerima;
    private double tarifAsuransi;

    public Kilat(String idKilat, String alamatPenerima, double tarifAsuransi, String namaPenerima, String noTelpPenerima, double berat) throws ExceptionNama, ExceptionNomortelepon, ExceptionBerat,ExceptionId,ExceptionTarif , ExceptionAlamat {
        super(namaPenerima, noTelpPenerima, berat);
        if(!idKilat.startsWith("KIL-")){
            throw new ExceptionId();
        }else if(!alamatPenerima.startsWith("jln.")){
            throw new ExceptionAlamat();
        }else if(tarifAsuransi>25000 || tarifAsuransi<7000){
            throw new ExceptionTarif();
        }else{
            this.idKilat = idKilat;
            this.alamatPenerima = alamatPenerima;
            this.tarifAsuransi = tarifAsuransi;
        }
        
    }

    
    public void totalBiayaKilat(){
        System.out.println("Total Biaya\t\t : "+((berat*5000)+tarifAsuransi));
    }
    
    public void showPaketKilat(){
        showPaket();
        System.out.println("ID Paket Kilat\t\t : "+idKilat);
        System.out.println("Tarif Asuransi\t\t : "+tarifAsuransi);
        System.out.println("Alamat Penerima\t\t : "+alamatPenerima);
        totalBiayaKilat();
    }
}
