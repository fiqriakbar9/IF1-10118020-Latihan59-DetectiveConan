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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KarakterUtama conan = new KarakterUtama("Conan Edogawa", "Detektif", "Menyelesaikan Kasus", "Detektif Cilik");
        conan.tampil();
        
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Karate", "Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA");
        ran.tampil();
        
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta", "Memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        Cameo heiji = new Cameo("Heiji Hattori", "Detektif SMA", "Temannya Conan");
        heiji.tampil();
        
        Cameo kazuha = new Cameo("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran");
        kazuha.tampil();
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
