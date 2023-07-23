package pbo;

//Class
public class Karyawan {
//    atribut dan enkapsulasi
    private String nama;
    private String kode;
    
//    construktor
    public Karyawan(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }
    
//    mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

//    accesor (getter)
    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo(){
       return "Nama: "+getNama()+
              "\nKode: "+getKode(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String jabatan){
        return displayInfo() + "\nJabatan: "+jabatan;
    }
}
