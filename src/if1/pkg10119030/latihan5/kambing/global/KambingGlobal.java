package if1.pkg10119030.latihan5.kambing.global;
/**
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program : Program ini dibuat untuk Memasukkan 
 * Kambing kedalam Program secara GlobaL
 */
public class KambingGlobal {
// Variable jumlahKambing menjadi variable instance
    int jumlahKambing = 88;

        //Method untuk menampilkan jumlah Kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah Kambing : " + jumlahKambing);
        }
        public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah : "
                                + jumlahKambing);
        }
        
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal ();
        
        //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu Kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang sudah ada
        kambingSusu.getJumlahKambing(); 
    }  
}
