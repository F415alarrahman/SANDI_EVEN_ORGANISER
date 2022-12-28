package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import Model.EventOrganizer;

public class guestRecord {

    static Scanner input_pilihan = new Scanner(System.in);
    static BufferedReader input_data_menu = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //variabel untuk menyimpan data inputan sememtara
        boolean ulang = true;
        char input_pilihan_menu;

        EventOrganizer[] daftar_menu= new EventOrganizer[2];

        while (ulang) {
            System.out.println("\n================================================");
            System.out.println("=================Program Undang=================");
            System.out.println("================================================");
            System.out.println("Pilih menu");
            System.out.println("a.input data");
            System.out.println("b.cetak data");
            System.out.println("c.exit");
            System.out.print("pilih : ");
            input_pilihan_menu = input_pilihan.next().charAt(0);

            switch (input_pilihan_menu) {
                case 'a':
                    InputTamuUndangan(daftar_menu);
                    break;

                case 'b':
                    ArrayList<EventOrganizer> para_menu = new ArrayList<EventOrganizer>(Arrays.asList(daftar_menu));
                    EventOrganizer.PrintGuests(para_menu);
                    break;

                case 'c':
                    ulang = false;
                    break;
            
                default:
                    System.out.println("\nmohon pilih huruf yang ada di menu\n");
                    break;
            }
        }
    }

    private static void InputTamuUndangan(EventOrganizer[] daftar_menu) {
        System.out.println("\n===================Input Data===================");

        for (int i = 0; i < daftar_menu.length; i++) {
            try {
                EventOrganizer menu = new EventOrganizer();

                System.out.print("ID\t: ");
                menu.setID(Integer.parseInt(input_data_menu.readLine()));

                System.out.print("Nama\t: ");
                menu.setNAMA(input_data_menu.readLine());

                System.out.print("Alamat\t: ");
                menu.setALAMAT(input_data_menu.readLine());

                System.out.print("Email\t: ");
                menu.setEMAIL(input_data_menu.readLine());

                System.out.print("No HP\t: ");
                menu.setNO_HP(input_data_menu.readLine());

                daftar_menu[i] = menu;
                if (i != daftar_menu.length) {
                    System.out.println("================================================");
                }
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            }
        }
    }
}