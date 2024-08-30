package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// manipulandoPastasComFile - Dev Superior - Java
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// Listando as pastas
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// Listando os arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		// Criar uma sub pasta a partir da pasta Temp
		boolean success = new File(strPath + "\\subdir").mkdir(); // vai criar uma sub-pasta chamada subdir
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
