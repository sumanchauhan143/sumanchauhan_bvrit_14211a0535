import java.util.*;
import java.io.*;
public class Main{

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		int ar[]=new int[10];
		Scanner sc=new Scanner(System.in); 
		for(int i=0;i<10;i++)
			ar[i]=sc.nextInt();
		Main s=new Main();
		s.bubblesort(ar);
		System.out.println(ar);
	}

}
