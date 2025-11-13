import java.util.Scanner;
public class Tugas116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvey = new int[10][6];
        
        System.out.println("=== INPUT HASIL SURVEI ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        hasilSurvey[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai harus antara 1 sampai 5. Coba lagi.");
                    }
                }
            }
        }
        
        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
            double rata = (double) total / 6;
            System.out.printf("Responden %d: %.2f\n", i + 1, rata);
        }
        
        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvey[i][j];
            }
            double rata = (double) total / 10;
            System.out.printf("Pertanyaan %d: %.2f\n", j + 1, rata);
        }
        
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        
        double rataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.printf("\n=== RATA-RATA KESELURUHAN ===\n%.2f\n", rataKeseluruhan);
        sc.close();
    }

}
