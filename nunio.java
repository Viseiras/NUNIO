import java.io.*;
import java.util.*;

public class nunio
{
	public static void main(String[] args) 
	{
		System.out.println("Cuidado cada fallo podría hacer algo...\n \n Introduce la contraseña , si no la has encontrado deberás mirar mejor");	
		File troleo = new File("/home/ciclosm/Desktop/JIJIJA");

		String password= "Yolocasicrack";
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<1000;)
		{
			password= sc.nextLine();

			if(password.equals("NunioLoves72Drugs"))
			{
				System.out.println("Bien hecho, la contraseña de la carpeta es 1972Bolivia");
				System.exit(0);
			}
			else
			{
				try{
				String path = "/home/ciclosm/Desktop/JIJIJA" + File.separator + "JIJIJIJIJI" + File.separator + "Fallo.txt";
				// Use relative path for Unix systems
				File f = new File(path);

				f.getParentFile().mkdirs(); 
				f.createNewFile();}

				catch (IOException e)
				{
					System.out.println("Error");
				}
 			}
		}			
	}
}
