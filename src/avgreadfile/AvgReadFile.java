/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avgreadfile;
import java.io.*;

/**
 *
 * @author glSon8840
 */
public class AvgReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
    /*Open the text file and attach a BufferedReader
     * The path g:/randnums.txt must change depending where
     * the file is located. */

    BufferedReader readFile = new BufferedReader(new FileReader("RandNums.txt"));

    int inMarks[] = new int[100];
    String myLine;

    System.out.println("Contents of the file randnums.txt:");

    //read 100 marks from the file randnums.txt
    for (int i = 0; i < 100; i++) {
      myLine = readFile.readLine();
      System.out.println(myLine);
      inMarks[i] = Integer.parseInt(myLine);
    }

    readFile.close();

    System.out.print("The average of the random numbers is: ");
    //Call findAverage method; passes values from inMark array
    System.out.println(findAverage(inMarks));
  }

  public static int findAverage(int marks[]) {
    int sum = 0;
    for (int i = 0; i < marks.length; i++) {
      //sums the values in the new array 'marks'
      sum += marks[i];	
    }
    return (sum / marks.length);	//returns average
    }
    
}
