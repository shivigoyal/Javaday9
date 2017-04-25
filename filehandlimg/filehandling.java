package day;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
	public static void main(String args[])throws InsufficientArgException{
		File f1=null;
		File f2=null;
		FileWriter fw=null;
		FileReader fr=null;
		int data;
		try
		{
			if (args.length==0)
			{
				throw new InsufficientArgException("enterargs");
			}
		f1=new File(args[0]);
		f2=new File(args[1]);
		fr=new FileReader(f1);
		fw=new FileWriter(f2);
		data=fr.read();
		while(data!=-1)
		{
			char c=(char)data;
			char v=Character.toUpperCase(c);
			fw.write(v);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
