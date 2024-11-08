class Fibnocci_series {
    public static void main(String[]args) {
 	int a=0,b=1,c=0;
	int start=1;
	
	while(start<=10){
	System.out.print( a+" ");
	c=a+b;
	a=b;
	b=c;
        
	start++;
	}
    }
}