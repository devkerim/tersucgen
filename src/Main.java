import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	System.out.println("Satır sayısını giriniz: ");
	int n = intscanner.nextInt();



	for(int d=1;d<=n;d++){
		for(int f=0;f<=d-1;f++){System.out.print(" ");}
		for(int e=1;e<=2*n-2*(d-1)-1;e++){System.out.print("*");}
		System.out.println("");
	}


    }



    }

