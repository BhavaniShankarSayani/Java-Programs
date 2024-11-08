class Year_month 
    {
	public static void main(String[] args) 
         {
             int year=2000,month=8;
             switch(month)
		{
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
 System.out.println("year is"+year+"month no is"+month+"31 days");
              break
		   case 4:
		   case 6:
                   case 9:
		   case 11:	
 System.out.println("year is"+year+"month no is"+month+"30 days");
                   case 2:
 if((year%4==0 && year%100!=0) || year%400==0)

System.out.println("year is"+year+"month no is"+month+"29 days");
else
    System.out.println("year is"+year+"month no is"+month+"28 days");
default:
System.out.println("year is"+year+"month no is"+month+"invalid");
		}
	}




              