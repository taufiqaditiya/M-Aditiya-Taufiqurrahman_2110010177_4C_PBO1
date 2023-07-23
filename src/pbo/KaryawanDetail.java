package pbo;
//inheritance
public class KaryawanDetail extends Karyawan {
//    overriding
    public KaryawanDetail(String nama, String kode) {
        super(nama, kode);
    }
    
    public int getNoKaryawan() {
        return Integer.parseInt(getKode().substring(0, 2));
    }
    
    public String getJabatan(){
        String kodeJab = getKode().substring(2,4);
        if(kodeJab.equals("01")){
            return "Operator Alat Berat";
        } else {
            return "Operator Lainnya";
        }
    }
    
    public String getAlatBerat(){
        String kodeAlatBerat = getKode().substring(4, 6);
//        seleksi switch
        switch (kodeAlatBerat){
            case "01":
                return "Exavator";
            case "02":
                return "Dozer";
            default:
                return "Unit Lainnya";
        }
    }
    
    public int getNoAlatBerat(){
        return Integer.parseInt(getKode().substring(6));
    }
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nNo Karyawan: "+getNoKaryawan()+
                "\nJabatan: "+getJabatan()+
                "\nAlat Berat: "+getAlatBerat()+
                "\nNo Alat Berat: "+getNoAlatBerat();
    }
}

