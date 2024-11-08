class Percentage_grades
   {
public static void main(String[]args) {
    int marks =92,n=marks/10;
	System.out.println(marks);
	if(marks>10)
        switch(n) {
case 10: System.out.println("excellent");
         break;
case 9: System.out.println("A+");
         break;
case 8: System.out.println("A");
         break;
case 7: System.out.println("B+");
         break;
case 6: System.out.println("B");
         break;
case 5: System.out.println("C+");
         break;
case 4: System.out.println("C");
         break;
case 3: System.out.println("D");
         break;
case 2: System.out.println("E");
         break;
case 1: System.out.println("FAIL");
         break;
	default:
	System.out.println("invalid");

    }
  }
 }

	
