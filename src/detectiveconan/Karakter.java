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
public class Karakter {
    
    private String nama;
    private String peran;
    
    public Karakter(String nama, String peran){
        this.nama=nama;
        this.peran=peran;
                
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }
    
    
}
