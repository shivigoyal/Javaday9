import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		String srcpath=args[0];
		String srcname=args[1];
		String destpath=args[2];
		String destname=args[3];
		
		String str="";
		
		File f1=new File(srcpath,srcname);
		if(!f1.exists())
		{
			System.out.println("file does not exists");
		}
		else
		{
			FileReader fi=new FileReader(f1);
			BufferedReader br=new BufferedReader(fi);
			str=br.readLine();
			System.out.println(str);
			br.close();
		}
		
		File f2=new File(destpath,destname);
		if(!f2.exists())
		{
			f2.createNewFile();
			FileWriter fw=new FileWriter(f2);
			BufferedWriter br=new BufferedWriter(fw);
			br.write(str);
			System.out.println("file copied!!");
			br.close();
		}
		else 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("do you want to overwrite?");
			String ans=sc.next();
			if(ans.equals("Y") || ans.equals("y")){
			FileWriter f=new FileWriter(f2);
			BufferedWriter bw=new BufferedWriter(f);
			bw.write(str);
			System.out.println("file copied!!");
			bw.close();
			sc.close();
		}
			
	}
}
		
		

	}


