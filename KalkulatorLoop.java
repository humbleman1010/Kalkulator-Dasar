package Project1;

import java.util.*;

public class KalkulatorLoop {

    public static void main(String[] args) {
        Scanner input;
        float a, b, hasil;
        char operator,selesai;
        
        input = new Scanner(System.in);

        do {
            System.out.print("Nilai a = ");
            a = input.nextFloat();
            System.out.print("Operator = ");
            operator = input.next().charAt(0);
            System.out.print("Nilai b = ");
            b = input.nextByte();
            if (operator == '+') {
                hasil = a + b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
            
            }else if(operator == '-'){
            hasil = a - b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);

            
            }else if(operator == '*'){
            hasil = a * b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);

            
            }else if(operator == '/'){
            hasil = a / b;
            System.out.println(a + " " + operator + " " + b + " = " + hasil);

            
            }else{
                System.out.println("operator tidak ada");
            }System.out.println("apakah anda ingin menghentikan Program Y/N");
            selesai = input.next().charAt(0);
        } while (selesai == 'N');
        System.out.println("Program Selesai");
    }

}
