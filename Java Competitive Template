import java.util.*;
import java.io.*;
//Atcoder cpntest use public class Main
//Cf Use public and codechef dont use public 
public class solve{
public static void main (String[] args) { 	
	int t =sc.nextInt();
    while(t--!=0) {  
           
    	
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  	
out.flush();
out.close();
}
private static int k(int i){
// TODO Auto-generated method stub
	return 0;
}
//END OF MAIN METHOD.
static int lowerbound(List<Integer> nums, int target) {
    int left = 0, right = nums.size();
    
    // Traverse list
    while (left < right) {
        int middle = left + (right - left) / 2;
        
        // For finding the element in the left subarray
        if (target <= nums.get(middle)) {
            right = middle;
        } else {
            // For finding the element in the right subarray
            left = middle + 1;
        }
    }
    
    // When the target element is greater than the last element of the list, return -1
    if (left == nums.size()) {
        return -1;
    }
    // Otherwise, return the element at the left index
    return nums.get(left);
}


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
 
 // for (Map.Entry<Integer,Integer> entry : map.entrySet()){  
                 entry.getKey(); 
                 entry.getValue(); 
            }
  * 
  * 
2.Sort on basis of 1st key and if equal compare and sort according to second key.
  Arrays.sort(a,(x,y)->x[0]==y[0]?Integer.compare(x[1], y[1]):Integer.compare(x[0], y[0]));
  
   // sort on basi of first key and if equal sort it in decreasing oder based on 2nd key
 --  Arrays.sort(a, Comparator.comparingInt((int[] x) -> x[0])
                                  .thenComparing(Comparator.comparingInt((int[] y) -> y[1]).reversed()));
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
public static long hcf(long n1,long n2)
{
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}
//sort a HashMap on the basis of Key
private static LinkedHashMap<Integer, Integer> sortmap(Map<Integer, Integer> map1) {
    List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map1.entrySet());
    entryList.sort(Map.Entry.comparingByKey());

    LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
    entryList.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

    return sortedMap;
}
//call any nth entry in HashMap
private static <K, V> Map.Entry<K, V> nentry(Map<K, V> map, int n) {
    if (n < 0 || n >= map.size()) {
        throw new IllegalArgumentException("Invalid index");
    }
    Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
    for (int i = 0; i < n; i++) {
        iterator.next();
    }

    return iterator.next();
    	
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
