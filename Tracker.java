import java.util.*;
import java.io.*;
public class Tracker
{


	public static void main(String[]args)throws FileNotFoundException
	{
		char notice;
		do{
		String mina1,mina2,mina3,mina4,mina5;


		Scanner kb = new Scanner(System.in);
		System.out.println("Entre The Customer Name: ");
		mina1=kb.nextLine();
		System.out.println("Entre The Contact Number: ");
		mina2=kb.nextLine();
		System.out.println("Entre The Customer Loan Number: ");
		mina3=kb.nextLine();
		System.out.println("Entre The Customer Amount: ");
		mina4=kb.nextLine();
		System.out.println("Entre The Customer Want Rcpt: ");
		mina5=kb.nextLine();
		System.out.println("*-*-*-*Information Has Been Added successfully!*-*-*-*");
		System.out.println("do you want enter more? (y/n) ");
		notice=kb.next().charAt(0);

		while(notice !='y' && notice !='n')
		{
			System.out.println("***Invalid Entry!");
			System.out.println("please Enter y to enter the second customer Info or n to Exit");
			notice=kb.next().charAt(0);;
		}


	try
	{
	 	BufferedWriter output;
    	output = new BufferedWriter(new FileWriter("fcs.txt", true));

    	output.append(mina1);
    	output.append("\t\t");
    	output.append(mina2);
    	output.append("\t\t");
    	output.append(mina3);
    	output.append("\t\t");
    	output.append(mina4);
    	output.append("\t\t");
    	output.append(mina5);
    	output.append("\t\t");
    	output.newLine();
    	output.close();


	}
	catch(IOException ioe)
	{
	    System.err.println("IOException: " + ioe.getMessage());
	}
		}while(notice=='y');

	}
}
