/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ugd8_c_5;

import exception.ExceptionAlamat;
import exception.ExceptionBerat;
import exception.ExceptionId;
import exception.ExceptionNama;
import exception.ExceptionNomortelepon;
import exception.ExceptionTarif;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;
/**
  
 *
 * @author VICTUS
    Reynold Kunarto             210711015   C
    Febiola Ika Putri Wibowo    210711023   C
 */
public class UGD8_C_5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) {
        String namaPenerima, noTelpPenerima, idReguler, idExpress,idKilat = null,alamat = null;
        double berat, tarifPacking, tarifJemput,tarifAsuransi = 0;
        int i=0;
        
        try{
            //reguler
            System.out.println("Masukkan Nama Penerima : ");namaPenerima=br.readLine();
            System.out.println("Masukkan No telp Penerima : ");noTelpPenerima=br.readLine();
            System.out.println("Masukkan Berat Paket : ");berat=Double.parseDouble(br.readLine());
            System.out.println("Masuukan ID Paket Reguler : ");idReguler=br.readLine();
            System.out.println("Masukkan Tarif Packing : ");tarifPacking=Double.parseDouble(br.readLine());
            Reguler reguler = new Reguler(idReguler, tarifPacking, namaPenerima, noTelpPenerima, berat);
            reguler.showPaketReguler();
            i++;
            
            //express
            System.out.println("\n\nMasukkan Nama Penerima : ");namaPenerima=br.readLine();
            System.out.println("Masukkan No telp Penerima : ");noTelpPenerima=br.readLine();
            System.out.println("Masukkan Berat Paket : ");berat=Double.parseDouble(br.readLine());
            System.out.println("Masuukan ID Paket Express : ");idExpress=br.readLine();
            System.out.println("Masukkan Tarif Jemput : ");tarifJemput=Double.parseDouble(br.readLine());
            Express express = new Express(idExpress, tarifJemput, namaPenerima, noTelpPenerima, berat);
            express.showPaketExpress();
            
            i++;
            System.out.println("\n\nMasukkan Nama Penerima : ");namaPenerima=br.readLine();
            System.out.println("Masukkan No telp Penerima : ");noTelpPenerima=br.readLine();
            System.out.println("Masukkan Berat Paket : ");berat=Double.parseDouble(br.readLine());
            System.out.println("Masuukan ID Paket Kilat : ");idKilat=br.readLine();
            System.out.println("Masukkan Tarif Asuransi : ");tarifAsuransi=Double.parseDouble(br.readLine());
            System.out.println("Masukkan Alamat : ");alamat=br.readLine();
            Kilat kilat = new Kilat(idKilat, alamat, tarifAsuransi, namaPenerima, noTelpPenerima, berat);
            kilat.showPaketKilat();
            
        }catch(ExceptionNama e1){
            e1.showMessage();
        }catch(ExceptionNomortelepon e2){
            e2.showMessage();
        }catch(ExceptionBerat e3){
            e3.showMessage();
        }catch(ExceptionId e4){
            if(i==0){
                e4.showMessageReguler();
            }else if(i==1){
                e4.showMessageExpress();
            }else{
                e4.showMessageKilat(idKilat);
            }
            
        }catch(ExceptionTarif e5){
            if(i==0){
                e5.showMessageReguler();
            }else if(i==1){
                e5.showMessageExpress();
            }else{
                e5.showMessageKilat(tarifAsuransi);
            }
            
        }catch(ExceptionAlamat e6){
          e6.showMessage(alamat);
        }
        catch(Exception e){}
    }

}
