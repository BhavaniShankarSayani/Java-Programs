class Nfactoreal {
public static void main(String[]args) {
int n=5,r=3,nr=n-r;
int nfact=1,rfact=1,nrfact=1;
int nstart=n,rstart=r,nrstart=nr;
while(nstart>=1){
nfact=nfact*nstart;
nstart--;
}
while(rstart>=1)
{
rfact=rfact*rstart;
rstart--; 
}
while(nrstart>=1)
{
nrfact=nrfact*nrstart;
nrstart--; 
}
System.out.println("n fact is"+nfact);
System.out.println("r fact is"+rfact);
System.out.println("nr fact is"+nrfact);
}
}


