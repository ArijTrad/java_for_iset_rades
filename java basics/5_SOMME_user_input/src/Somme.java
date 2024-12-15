import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        int sum=0, i;
        Scanner s= new Scanner(System.in);

        System.out.print("donner un nombre positif: ");
        int n=s.nextInt();
        s.nextLine();

        for( i=1;i<=n;i++){sum=sum+i;}

        System.out.println("what String text message you want to see");
        String ch=s.nextLine();

        System.out.println(ch+n+sum);
        System.out.println("la somme des "+ n+ " premiers nombres = "+ sum+ch);




    }
}