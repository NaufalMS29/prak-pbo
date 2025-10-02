class Mahasiswa {
    private String NPM;
    private String namaDepan;
    private String namaBelakang;

    Mahasiswa(String NPM, String namaDepan, String namaBelakang){
        this.NPM = NPM;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    void belajar(){
        System.out.println(this.NPM + " " + this.namaDepan + " " + this.namaBelakang + " " + " Sedang Belajar");
    }
    void Ujian(){
        System.out.println(this.NPM + " " + this.namaDepan + " " + this.namaBelakang + " " + " Sedang Belajar");
    }
}
