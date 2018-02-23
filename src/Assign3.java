import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assign3 {
	
	/**
	 * Adapted from https://stackoverflow.com/a/21974043
	 * @param aString - The name of a text file.
	 * @return The file extension if it exists, blank otherwise
	 */
	public static String getFileExtension(String aString) {
	    try {
	        return aString.substring(aString.lastIndexOf("."));
	    } catch (Exception e) {
	        return "";
	    }
	}
	public static void main(String[] args) {
		File fileIn;
		Scanner scanner;
		//Command line argument verification 
		/*
		if(args.length != 3) {
			System.out.println("Incorrect number of inputs. Quitting...");
			System.exit(-1);
		}
		if(!getFileExtension(args[0]).equals(".txt") || !getFileExtension(args[1]).equals(".txt") || !getFileExtension(args[2]).equals(".txt")) {
			System.out.println("Unable to use files that are not text files. Check your file names. Quitting...");
			System.exit(-1);
		}
		*/
		fileIn = new File("a3input1.txt");//args[0]);
		BST mybst = new BST();
		Node current; 
		String temp = "";
		char opc;
		int snum;
		String lnam;
		String dep;
		String prg;
		int year;
		try {
			System.out.println("Scanning text file for words...");
			scanner = new Scanner(fileIn);
			while(scanner.hasNextLine()){ 
				temp = scanner.nextLine();
				opc = temp.charAt(0);
				snum = Integer.parseInt(temp.substring(1, 7));
				lnam = temp.substring(8, 32);
				dep = temp.substring(33, 36);
				prg = temp.substring(37, 40);
				year = Integer.parseInt(temp.substring(41));
				System.out.println(lnam.trim());
				mybst.insert(opc, snum, lnam, dep, prg, year);
			}
		}catch(Exception e){
			System.out.println("Failed to read the text file. Quitting...");
			System.exit(-1);
		}
		current = mybst.getroot();
		System.out.println("BST created successfully.");
		mybst.breadthfirst();
		System.out.println("Breadth first traversal success.");
		mybst.depthfirst(current);
		System.out.println("Depth first traversal success.");
	}

}
