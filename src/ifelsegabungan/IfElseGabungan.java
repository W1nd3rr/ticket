
package ifelsegabungan;

import java.util.Scanner;

public class IfElseGabungan {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        String pesawat,tujuan;
        System.out.println("BANDARA ASYIAPPP");
        System.out.println("-------------------");
        System.out.println("Silahkan Masukkan Jenis Maskapai");
        pesawat = input.next();
        System.out.println("Kemana tujuan Anda : Jakarta , Surabaya , Bali");
        tujuan = input.next();
        if ("garuda".equalsIgnoreCase(pesawat))
        {
            if ("jakarta".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.1.200 ");
            }
            else if ("surabaya".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.600.000 ");
            }
            else if ("bali".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.800.000 ");
            } else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else if ("lion".equalsIgnoreCase(pesawat))
        {
            if("jakarta".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.800.000 ");
            }
            else if ("surabaya".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.400.000 ");
            }
            else if ("bali".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.600.000 ");
            }
            else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else if ("sriwijaya".equalsIgnoreCase(tujuan))
        {
            if ("jakarta".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.700.000 ");
            }
            else if ("surabaya".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.420.000 ");
            }
            else if ("bali".equalsIgnoreCase(tujuan))
            {
                System.out.println(pesawat + ", Dengan Tujuan ke " + tujuan + " Dengan Harga Rp.550.000 ");
            }
            else
            {
                System.out.println("Maaaf Inputan Anda Salah");
            }
        }
        else 
        {
            System.out.println("Maaf Inputan Anda Salah");
        }
    }
    
}
