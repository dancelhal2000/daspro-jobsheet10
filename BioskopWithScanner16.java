import java.util.Scanner;

public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        int menuChoice;

        while (true) {
            System.out.println("\nMenu Bioskop:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            menuChoice = sc.nextInt();
            sc.nextLine(); 

            switch (menuChoice) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine(); 

                            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                                if (penonton[baris - 1][kolom - 1] == null) {
                                    penonton[baris - 1][kolom - 1] = nama;
                                    System.out.println("Data penonton " + nama + " telah dimasukkan.");
                                    break; 
                                } else {
                                    System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                                }
                            } else {
                                System.out.println("Nomor baris/kolom tidak tersedia. Harap masukkan baris 1-4 dan kolom 1-2.");
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break; 
                        }
                    }
                    break; 

                case 2:
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        String nama1 = (penonton[i][0] == null) ? "***" : penonton[i][0];
                        String nama2 = (penonton[i][1] == null) ? "***" : penonton[i][1];
                        
                        System.out.println("Baris " + (i + 1) + ": " + nama1 + ", " + nama2);
                    }
                    break; 

                case 3:
                    sc.close(); 
                    System.out.println("Terima kasih, program telah selesai.");
                    return; 

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}