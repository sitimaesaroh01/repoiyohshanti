import javax.swing.JOptionPane;
import transaksi.simpanambil;
public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan Nominal 1 : ");
        int n1=sc.nextInt();
        System.out.print("Masukkan Nominal 2 : ");
        int n2=sc.nextInt();
        System.out.print("Masukkan Nominal 3 : ");
        int n3=sc.nextInt();

        int total=n1+n2+n3;
        System.out.println("Saldo Anda = "+total);

        System.out.print("Masukkan Tarik 1   : ");
        int t1=sc.nextInt();

        int s1=total-t1;
        
            if (s1 >= 50000){
        {System.out.println("Sisa Saldo      = "+s1);}

        System.out.print("Masukkan Tarik 2   : ");
        int t2=sc.nextInt();

        int s2=s1-t2;
        if(s2>=50000){
        {System.out.println("Sisa Saldo      = "+s2);}
                
        System.out.print("Masukkan Tarik 3   : ");
        int t3=sc.nextInt();
        
        int s3=s2-t3;
        if(s3>=50000)
        {System.out.println("Sisa Saldo      = "+s3);}
        else System.out.println("Saldo Anda Tidak Cukup");}
        else System.out.println("Saldo Anda Tidak Cukup");}
        else System.out.println ("Saldo Anda Tidak Cukup");}
}