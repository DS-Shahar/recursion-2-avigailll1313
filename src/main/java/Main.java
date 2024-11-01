class Main {
public static int q14(int []x, int i) {
	
	if (i<0) 
		return 0;
	else {
		i-=1;
		return q14(x,  i)+x[i+1];}}

public static int q15(int []x, int i) {
	
	if (i<0) 
		return 0;
	if(x[i]>0) {
		i-=1;
		return q15(x,  i)+1;}
	 else {
		i-=1;
		return q15(x, i);}}

public static int q16(int []x,int n, int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if(x[i]==n) {
		return i;}
	 else {
		i+=1;
		return q16(x,n, i);}}

public static boolean q17(int[] n,int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if (i == n.length - 1 || i == n.length) {
		return true;}
	if(n[i]>n[i+1]) {
		return false;
	}
	else { i+=1;
		return q17(n,i);
	}}

public static boolean q18(int[] n,int i) {
	// i משתנה לספירת האינדקס, מתחיל מאפס
	if (q8(n[i])==false) {
		return false;}
	if(i==n.length)
		return true;
	
	else { i+=1;
		return q18(n,i);
	}}

  public static boolean q8(int n) {
			return help8 (n,2);
		}
public static boolean help8(int n,int m) {
	if (n==m) {
		return true;}
	if(n%m !=0) {
		return help8(n,m+1);
	}
	else {
		return false;
	}}
	
	public static void main(String[] arg) {
		 int []n= {17,2,7,13};
		 int i =0;
		 int t=8;
		 System.out.print(q18(n, i));
