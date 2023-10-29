package pkgLatihan29;
import java.util.Scanner;
/**
* author
* Nama             : A`isatul Iza
* Nim              : 22166008
* Deskripsi        : Program ini adalah program yang menampilkan kepribadian seseorang dari warna favorit
*/
public class SIReppagi22266008Latihan29 {

  public static void main(String[] args) {
   String penutup = "\u001b[0m";
   String foregroundMerah = "\u001b[31m";
   String foregroundHijau = "\u001b[32m";
   String foregroundKuning = "\u001b[33m";
   String foregroundBiru = "\u001b[34m";
   String foregroundUngu = "\u001b[35m";
   String foregroundCyan = "\u001b[36m";
   //Menambahkan Background warna pada huruf menggunakan ANSI color 
   String backgroundMerah = "\u001b[41m";
   String backgroundHijau = "\u001b[42m";
   String backgroundKuning = "\u001b[43m";
   String backgroundBiru = "\u001b[44m";
   String backgroundUngu = "\u001b[45m";
   Scanner scanner = new Scanner(System.in);
   System.out.print(foregroundMerah+"YUK "+penutup);
   System.out.print(foregroundHijau+"CEK "+penutup);
   System.out.print(foregroundKuning +"KEPRIBADIANMU "+penutup);
   System.out.print(foregroundCyan+"DARI "+penutup);
   System.out.print(foregroundUngu+"WARNA "+penutup);
   System.out.print(foregroundBiru+"FAVORITMU \n"+penutup);
   System.out.println(backgroundMerah+"        MERAH     "+penutup);
   System.out.println(backgroundHijau+"        HIJAU     "+penutup);
   System.out.println(backgroundKuning+"        KUNING    "+penutup);
   System.out.println(backgroundBiru+"        BIRU      "+penutup);
   System.out.println(backgroundUngu+"        UNGU      "+penutup+"\n");
   //input warna favorit
   System.out.print("PILIH WARNA FAVORITMU : ");
   String warna = scanner.next();
   //input nama 
   System.out.print("NAMA KAMU : ");
   String nama = scanner.next();
   //output hasil tes
   System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama +"====");
   System.out.print("Warna favoritmu adalah ");
   //pernyataan switch case 
   switch (warna) {
       case "merah":
           System.out.println(foregroundMerah +"merah"+penutup);
           System.out.println("1. Periang,");
           System.out.println("2. Pemberani,");
           System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
           System.out.println("4. Menyukai tantangan,");
           System.out.println("5. Kurang sabar,");
           System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
           System.out.println("7. Memiliki energi kehangatan dan cinta.");
           break;
        case "hijau":
            System.out.println(foregroundHijau +"hijau"+penutup);
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah merasa iri,");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
            break;
        case "kuning":
            System.out.println(foregroundKuning +"kuning"+penutup);
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong, ");
            System.out.println("5. Lincah dan aktif, ");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
            System.out.println("7. Loyal, ");
            System.out.println("8. Hangat, ");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut.");
            break;
        case "biru":
            System.out.println(foregroundBiru +"biru"+penutup);
            System.out.println("1. Menyenangkan, ");
            System.out.println("2. Bijaksana, ");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senqng berbagi, ");
            System.out.println("6. Bersahabat, ");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang, ");
             System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
             break;
        case "ungu":
            System.out.println(foregroundUngu +"ungu"+penutup);
            System.out.println("1. Optimis,");
            System.out.println("2. Tidak pernah ragu,");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
            System.out.println("4. Memiliki ambisi yang besar,");
            System.out.println("5. Memiliki empati yang besar,");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
            break;
        default:
            System.out.println("Warna yang Anda masukkan tidak valid.");
            break;
    } 
  }
}
