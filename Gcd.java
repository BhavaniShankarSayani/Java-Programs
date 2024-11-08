class Gcd {
    public static void main(String[]args) {
 	int n1=6,n2=12,gcd=0,f=1;
  while(f<=n2) {
      if(n1%f==0 && n2%f==0){ 
        gcd=f;
}
f++;
       }
        
      System.out.println(gcd);
     }
}