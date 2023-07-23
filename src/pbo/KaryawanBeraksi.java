package pbo;

import java.util.Scanner;

public class KaryawanBeraksi {
    public static void main(String[] args) {
//        objek
//Karyawan kyw = new Karyawan ("M. Aditiya Taufiqurrahman","2110010499");

//System.out.println(kyw.displayInfo());
//System.out.println(kyw.displayInfo("Manager"));

//Error handling
try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        KaryawanDetail[] kyw = new KaryawanDetail[2];
        for(int i=0; i<kyw.length; i++) {
                System.out.print("Masukkan Nama Karyawan "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Kode Karyawan "+(i+1)+" : ");
                String kode = scanner.nextLine();

        //        objek
                kyw[i] = new KaryawanDetail (nama, kode);
    }

        for(KaryawanDetail data: kyw) {
            System.out.println("==================");
            System.out.println("Data Karyawan: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format Kode: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}

