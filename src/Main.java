import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String a1 =JOptionPane.showInputDialog("Gidilen Mesafeyi giriniz: ");
        int toplamyol = Integer.parseInt(a1);
        double acılısucret=10;
        double kmtutar=2.20;
        double toplamtutar =toplamyol * kmtutar;
        if (toplamyol * kmtutar < 20) {
            toplamtutar = 20;
        }
       else{
        toplamtutar = (toplamyol * kmtutar) + acılısucret;
        }

        System.out.println("Açılış ücretimiz 10 tldir. Hayırlı Yolculuklar Dileriz");
        System.out.println("Ödemeniz gereken ücret: "+ toplamtutar);
        }
    }
