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
public class KarakterUtama extends Karakter {

    private String team;
    private String tujuan;
    
   public KarakterUtama(String nama, String peran,String tujuan, String team ) {
        super(nama, peran);
        this.tujuan=tujuan;
        this.team=team;
    }
   
    public String getTujuan() {
        return tujuan;
    }
    
    public String getTeam() {
        return team;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Team : "+getTeam());
        System.out.println("Tujuan : "+getTujuan());
        System.out.println("");
    }
    
}
