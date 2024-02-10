import java.util.*;
import java.io.*;
public class solve{
public static void main (String[] args) { 
	  long n=sc.nextInt();
	  List<Long> a=new ArrayList<>();
	  a.add(n);
	   while(n!=1) {
		   if(n%2!=0) {
			   n=n*3+1;
			   a.add(n);
		   }else {
			   n=n/2;
			   a.add(n);
		   }   
	   }
	   for(int i=0;i<a.size();i++) {
		   out.print(a.get(i)+" ");
	   }
	   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  	
out.flush();out.close();
}
//END OF MAIN METHOD.
static boolean isPrime(long n)
{
 
    // Check if number is less than
    // equal to 1
    if (n <= 1)
        return false;
 
    // Check if number is 2
    else if (n == 2)
        return true;
 
    // Check if n is a multiple of 2
    else if (n % 2 == 0)
        return false;
 
    // If not, then just check the odds
    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}
/* 
//IMPORTANT AND NEW METHODS.
1.Sort on basis of first key
  :Arrays.sort(a,(a,b)->a[0]-b[0]);
 
2.Sort on basis of 1st key and if equal compare and sort according to second key.
  :Arrays.sort(a,(x,y)->x[0]==y[0]?Integer.compare(x[1], y[1]):Integer.compare(x[0], y[0]));
 
3.SLIDING WINDOW APPROACH
  :Variable size - condition given  we have to maximize the size of window.
  :Fixed size -    maximize the sum with window size of k.
  
4.Calculate no of digits in N
  :No. of digits in N = Math.floor(Math.log10(N)) + 1;
  
5.Multiply any number by two or divide by two
  : n = n << 1;   // Multiply n with 2
  : n = n >> 1;   // Divide n by 2 
 
6.To check weather it divisible by two or not
  :n&1==1// divisible by two
  :n$1==0// not divisible by two  
  */
 
//Filling map with frequency of array elements
static Map<Integer, Integer> map(int[] a) {
Map<Integer,Integer> map=new HashMap<>();
for(int i:a){
    map.put(i,map.getOrDefault(i,0)+1);
}
return map;
}
//factorial of n
static double fact(double n)
{
    int i=1;
    double fact=1;
    while(i<=n)
    {
   	   fact=fact*i;
	   i++;
	    }
	    return fact;
}
//Calculate the nCr
static int nCr(int n,int r)
{
	double com=fact(n)/(fact(n-r)*fact(r));
	return (int)com;
}
//Calculate the nPr
static int nPr(int n, int r)
{
 return (int) (fact(n) / fact(n - r));
}
//checks power of two
static boolean powerTwo(long x)
{
      return x!=0 && ((x&(x-1)) == 0);    
}
//swap two numbers
static void swap(int a,int b) {
	  a ^= b;
	  b ^= a;
	  a ^= b; 
}
static final Random random = new Random();
static class FastScanner {
public long[][] readArrayL;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer("");
String next() {
while (!st.hasMoreTokens())
try {
st=new StringTokenizer(br.readLine());
} catch (IOException e) {e.printStackTrace();
}
return st.nextToken();
}
int nextInt() {
return Integer.parseInt(next());
}
long[] Arrayl(int n) {
long a[]=new long[n];
for(int i=0;i<n;i++) a[i]=nextLong();
return a;
}
int[] Array(int n) {
int[] a=new int[n];
for (int i=0; i<n; i++) a[i]=nextInt();
return a;
}
long nextLong() {
return Long.parseLong(next());
}
double nextDouble() {
return Double.parseDouble(next());
}
}
static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
static FastScanner sc = new FastScanner();
}//END OF MAIN CLASS.
