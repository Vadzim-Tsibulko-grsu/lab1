package firstprogram;
import java.io.*;
import java.util.ArrayList;

public class firstprogram
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader (arg[0]));
		ArrayList<String> fileContent = new ArrayList<String>();
		String getString;
		int start,end,k=0;
		start=Integer.parseInt(arg[1]);
		end=Integer.parseInt(arg[2]);
			while((getString = reader.readLine())!=null)
			{
				k++;				
				if(k>=start && k<=start+end)
					fileContent.add(getString);
			}
			reader.close();
			
			for(int i=0;i<end;i++)
				System.out.println(fileContent.get(i));	
	}

}
