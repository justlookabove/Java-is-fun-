/* **************************************************************************
*                                                                           *
*                       Java Programming Scratch Work                       *
*                                                                           *
****************************************************************************/

/*

		// Write stuff
        System.out.println();

        // Enter code here...

        // Enter print statements here...
        
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

*/

// package thisoneguy;


public class Review
{
    public static void main(String[] args)
    {
        // Hello, World program
        System.out.println("----------------------------------" +
                "---------------------------------------");
        System.out.println();
        System.out.println("Hello, World!");
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Trees example
        //
        // Write a program the subtracts the number trees cut down from
        // a forest and displays the new subtracted number of trees in
        // the forest.
        int trees, forest, new_Forest;

        trees = 10;
        forest = 100;
        new_Forest = forest - trees;

        System.out.println();
        System.out.println("After cutting down " + trees + " trees, " +
                "a forest of " + forest + " trees will be down to "
                + new_Forest + ".");
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Conditional Assignment
        int c1, c2, cMAX;

        c1 = 7;
        c2 = 10;
        cMAX = c1 < c2 ? c1 : c2;

        System.out.println();
        System.out.println("If " + c1 + " is greater than " + c2 + " ,then" +
        	" return " + cMAX + ".");
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Calculate how many college students Blummenthal can queeze 
        // into UCSC dorms.
        int collegeStudents, dorms, studentsInAgony;

        collegeStudents = 100;
        dorms = 25;
        studentsInAgony = collegeStudents / dorms;

        if(collegeStudents > 0 && collegeStudents < 101)
        {
        	if(dorms > 0 && dorms < 101)
        	{
        		System.out.println();
        		System.out.println("There's gonna be " + studentsInAgony + 
        		" per dorms if Blummenthal has his way.");
        	}
        	else
        		System.out.println("Inadequate space for students!");
        }
        else
        		System.out.println("Not enough students! Do your thing" + 
        			" Bluemantal!");
      
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Construct an if-else statement
        int v1, v2, v3;

        v1 = 7;
        v2 = 10;
        v3 = 15;
        if(v1 < v2)
        {
        	System.out.println();
        	System.out.println(v1 + " is less than " + v2 + ".");
        }
        else if(v3 > v2)
        {
        	System.out.println();
        	System.out.println(v3 + " is greater than " + v2 + ".");
        }
        else
        	System.out.println(v3);

		System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Logical Operators example
        int students = 150;
        int rooms = 2;

        if(rooms > 0 && students/rooms > 30)
        {
            System.out.println();
            System.out.println("Its Crowded AF Joe!");
            System.out.println();
            System.out.println("----------------------------------" +
                    "--------------------------------------");
        }
        else
        {
            System.out.println();
            System.out.println("Done");
            System.out.println();
            System.out.println("----------------------------------" +
                    "--------------------------------------");
        }

        // Write a Java program to print the area and perimeter of a circle. 
        System.out.println();

        double radius, perimeter, area;
        radius = 7.5;
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Write a Java program that takes three numbers as input to 
        // calculate and print the average of the numbers
        System.out.println();

        int one, two, three;
        double avg;
        one = 24;
        two = 34;
        three = 72;
        avg = (one + two + three) / 3;

		System.out.println("First number: " + one + ".");
		System.out.println("Second number: " + two + ".");
		System.out.println("Third number: " + three + ".");
        System.out.println();
        System.out.println("The average is " + avg + ".");
        
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");


        // Loops : While loops
        int kVal, factorial;

        kVal = 5;
        factorial = 1;

        System.out.println();
        while(kVal > 1)
        {
            factorial *= kVal--;
            System.out.println(factorial);
            /*
            factorial = factorial * kVal;
            kVal--;
            System.out.println(factorial);
            */
        }

        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");
 
        // Loops : Do-While loops
        int iVal = 10;
        int totalVal = iVal * 2;

        System.out.println();
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            System.out.println(totalVal);
            iVal--;

        } while(iVal != 0);

        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Loops : For loop
        System.out.println();
        for(int iCal = 2; iCal < 100; iCal *= 2)
        {
            System.out.print(iCal);
        }

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Arrays
        double[] myVals = {10, 20, 30};
        double sum = 0;

        for(int i = 0; i < myVals.length; i++)
        {
            sum += myVals[i];
        }
        System.out.println();
        System.out.println(sum);
        System.out.println();

        // For-Each Loop
        double[] theVals = {10, 20, 30};
        double add = 0;

        for(double current : theVals)
            add += current;

        System.out.println(add);
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        // Switch Statements
        int iXal = 25;

        System.out.println();

        switch(iXal % 2)
        {
            case 0 : 
                System.out.print(iXal);
                System.out.println(" is even.");
                break;

            case 1 : 
                System.out.print(iXal);
                System.out.println(" is off.");
                break;

            default :
                System.out.println("oops it broke");
                break;
        }
        System.out.println();
        System.out.println("----------------------------------" +
                "---------------------------------------");

        //End Program
        System.out.println();
        System.out.println("** end program **");
    } 
   
}