package tut02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvarageGrade {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("src/tut02/testdata.txt");
		if (f.exists()) {
			Scanner sc = new Scanner(f);
			int lineCounter = 1;
			int totalGrade = 0;
			while (sc.hasNextLine()) {
				if (lineCounter == 1) {
					System.out.println("Student name: " + sc.nextLine());
				} else {
					totalGrade += sc.nextInt();
				}
				lineCounter++;
			}
			System.out.println("The avarage grade: " + ((double) totalGrade / (lineCounter - 2)));
		} else {
			throw new FileNotFoundException("File not found: " + f.getAbsolutePath());
		}

	}

}
