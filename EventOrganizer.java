package Model;
import java.util.ArrayList;

public class EventOrganizer {
    private int custid;
    private String custname;
    private String custaddr;
    private String custemail;
    private String custphone;

    public EventOrganizer(){}

    public EventOrganizer(int id, String nama, String alamat, String email, String nomor_hp){
        this.custid = id;
        this.custname = nama;
        this.custaddr = alamat;
        this.custemail = email;
        this.custphone = nomor_hp;
    }

    public void setID(int id) {
        this.custid = id;
    }

    public void setNAMA(String nama) {
        this.custname = nama;
    }

    public void setALAMAT(String alamat) {
        this.custaddr = alamat;
    }

    public void setEMAIL(String email) {
        this.custemail = email;
    }

    public void setNO_HP(String no_HP){
        this.custphone = no_HP;
    }

    //untuk mengambil nilai properti objek
    public int getID() {
        return this.custid;
    }

    public String getNAMA(){
        return this.custname;
    }

    public String getALAMAT(){
        return this.custaddr;
    }

    public String getEMAIL(){
        return this.custemail;
    }

    public String getNO_HP(){
        return this.custphone;
    }

    //untuk mencetak semua data tamu undangan
    public static void PrintGuests(ArrayList<EventOrganizer> daftar_menu) {
        System.out.println("\n===================Data Guest===================");
        for (EventOrganizer menu : daftar_menu) {
            System.out.println("ID\t: " + menu.getID());
            System.out.println("Nama\t: " + menu.getNAMA());
            System.out.println("Alamat\t: " + menu.getALAMAT());
            System.out.println("Email\t: " + menu.getEMAIL());
            System.out.println("No HP\t: " + menu.getNO_HP() + "\n");
        }
    }
}