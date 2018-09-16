/**************************************************

                Kiran Gunasekaran
                GradeAnalyzer.java

**************************************************/

import java.util.ArrayList;

public class GradeAnalyzer {
  
  // Constuctor
  public GradeAnalyzer(){}
  
  // Method to get the Average of the grades stored in a Array
  public int getAverage(ArrayList<Integer> grades){
    
    // Check to see if Array is not 0
    if(grades.size() < 1) {
      System.out.println("ERROR: List is empty!");
      return 0;
    } 
    // Find Average of all grades
    else {
      // Adds up all the grades stored in the array
      int sum = 0;
      for(Integer grade : grades){
        sum += grade;
      }
      // Finding the average
      int average = sum / grades.size();
      System.out.println(average);
      return average;
    }
  }
  
  // Main Methord
  public static void main(String[] args) {
    // Array to store classroom grades
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    
    // Populating the array
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    // New GradeAnayzer object to access the getAverage method
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    
    // accessing the getAverage method with the values stored
    // in the myClassroom Array
    myAnalyzer.getAverage(myClassroom);
  }
}