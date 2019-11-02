/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectiveconan;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan Deatil info 
 * tentang karakter yang ada di film Detective Conan
 * 
 */
public class Cameo extends Karakter {

    private String hubungan;
    
    public Cameo(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan=hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Hubungan dengan karakter utama : "+getHubungan());
        System.out.println("");
    }
      
    
}
