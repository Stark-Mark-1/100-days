
import java.util.*;
public class codeChef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            // To Do List Code Chef
            // int n=sc.nextInt();
            // int arr[] = new int [n];
            // int c=0;
            // for(int i=0;i<n;i++){
            //     arr[i]=sc.nextInt();S
            //     if(arr[i]>999){
            //         c++;
            //     }
            // }
            // System.out.println(c);
            // Small Factorials Code Chef
            // int n=sc.nextInt();
            // int val =1;
            // for(int i =1;i<=n;i++){
            //     val *=i;
            // }
            // System.out.println(val);
            //lucky four
            // int n=sc.nextInt();
            // int b=0;
            // String a = Integer.toString(n);
            // for(int i=0; i<a.length();i++){
            //     if(a.charAt(i)=='4'){
            //         b++;
            //     }
            // }System.out.println(b);
            //Kitchen Timetable
            // int n=sc.nextInt(), c=0; //number of students and const
            // int t1[]=new int[n];
            // int t2[]=new int[n];
            // for(int i=0;i<n;i++){
            //     t1[i]=sc.nextInt();
            // }
            // for(int i=0;i<n;i++){
            //     t2[i]=sc.nextInt();
            // }
            // for(int i=0;i<n;i++){
            //     if(i==0 ){
            //         if((t2[i]) <= (t1[i]))
            //         c++;
            //     }else if(t2[i]<=(t1[i]-t1[i-1])){
            //         c++;
            //     }
            // }System.out.println(c);
            //ATM Machine
            //         int cust=sc.nextInt(), money=sc.nextInt();
            //         int arr[]=new int[cust];
            //         for (int i=0;i<cust ;i++ ){
            //        arr[i]=sc.nextInt();
            //         }
            //         for(int i=0;i<cust ;i++){
            //         if(arr[i]<=money){
            //            System.out.println("1");
            //            money-=arr[i];
            //        }else{
            //            System.out.println("0");
            //        }
            //    }
            //TCS Examination 12/08/2023
            // int dragon[]=new int[3];
            // int sloth[]=new int[3];
            // int sum1=0 , sum2=0;
            // for(int i=0;i<3;i++){
            //     dragon[i]=sc.nextInt();
            // }
            // for(int i=0;i<3;i++){
            //     sloth[i]=sc.nextInt();
            // }
            // for(int i=0;i<3;i++){
            //     sum1+=dragon[i];
            //     sum2+=sloth[i];
            // }
            // if(sum1>sum2){
            //     System.out.println("DRAGON");
            // }else if(sum1<sum2){
            //     System.out.println("SLOTH");
            // }else if(sum1==sum2 && dragon[0]>sloth[0]){
            //     System.out.println("DRAGON");
            // }else if(sum1==sum2 && dragon[0]<sloth[0]){
            //     System.out.println("SLOTH");
            // }else if(sum1==sum2 && dragon[0]==sloth[0] && dragon[1]>sloth[1]){
            //     System.out.println("DRAGON");
            // }else if(sum1==sum2 && dragon[0]==sloth[0] && dragon[1]<sloth[1]){
            //     System.out.println("SLOTH");
            // }else if(sum1==sum2 && dragon[0]==sloth[0] && dragon[1]==sloth[1]){
            //     System.out.println("TIE");
            // }
            //Code Chef Streak 12/08/2023
            
            // int days=sc.nextInt();
            // int om[]=new int[days];
            // int Addy[]=new int[days];
            // for(int i=0;i<days;i++){
            //     om[i]=sc.nextInt();
            // }
            // for(int i=0;i<days;i++){
            //     Addy[i]=sc.nextInt();
            // }
            // int t1=0,a1=0,a2=0,t2=0;
            // for(int i=0;i<days;i++){
            //     if(om[i]>0){
            //         ++t1;
            //     }else{
            //         a1=Math.max(a1, t1);
            //         t1=0;
            //     }
            // }
            // a1=Math.max(a1, t1);
            // for(int i=0;i<days;i++){
            //     Addy[i]=sc.nextInt();
            // }
            // for(int i=0;i<days;i++){
            //     if(Addy[i]>0){
            //         ++t2;
            //     }else{
            //         a2=Math.max(a1, t1);
            //         t2=0;
            //     }
            // }
            // a2=Math.max(a2, t2);
            // if(a1>a2){
            //     System.out.println("Om");
            // }else if(a2>a1){
            //     System.out.println("Addy");
            // }else{
            //     System.out.println("Draw");
            // }
            //Popcorn
            // int a1=sc.nextInt(),a2=sc.nextInt(),b1=sc.nextInt(),b2=sc.nextInt(),c1=sc.nextInt(),c2=sc.nextInt();
            // int max=Math.max((a1+a2), (b1+b2));
            // max=Math.max(max, (c1+c2));
            // System.out.println(max);
            // Coding Ninjas: Data Types:
            // String str=sc.nextLine();
            // switch(str) {
            //     case "Integer":
            //     System.out.println("4");
            //     break;
            //     case "Long":
            //     System.out.println("8");
            //     break;
            //     case "Float":
            //     System.out.println("4");
            //     break;
            //     case "Double":
            //     System.out.println("8");
            //     break;
            //     case "Character":
            //     System.out.println("1");
            //     break;
            //     default: 
            //     System.out.println("no match");
            // }
            //Coding Ninja 21 day challenge
            // int a=sc.nextInt(), b=sc.nextInt();
            // String s="";
            // if(a<b){
            // s="smaller";
            //   }else if(a>b){
            // s="greater";
            // }else if(a==b){
            // s="equal";
            // }
            // System.out.println(s);
            //code Chef Play Piano
            // String s=  sc.nextLine();
		    // int a=0,b=0;
		    // char arr[]=s.toCharArray();
		    // for(int i =0;i<arr.length; i++){
		    //     if(arr[i]=='A'){
		    //         a++;
		    //     }else if(arr[i]=='B'){
		    //         b++;
		    //     }
		    // }
		    // if(a%2==0 && b%2==0){
		    //     System.out.println("Yes");
		    // }else{
		    //     System.out.println("No");
		    // }
            //chef and lock out draws
            // int a=sc.nextInt() , b=sc.nextInt(), c=sc.nextInt();
            // int sum=a+b+c;
            // if(sum%2==0){
            //     System.out.println("YES");
            // }else{
            //     System.out.println("NO");
            // }
            // Code Ninjas
            // int n=sc.nextInt();
            // String s=Integer.toString(n);
            // int esum=0, osum=0;
            // for(int i=0;i<s.length();i++){
            //     if(s.charAt(i)%2==0){
            //         osum+=s.charAt(i);
            //     }else{
            //         esum=s.charAt(i);
            //     }
            // }
            // System.out.println(osum + " " + esum);
            // int n=sc.nextInt();
            // int evenSum=0, oddSum=0;
            // while (n > 0) {
            //     int digit = n % 10;
    
            //     if (digit % 2 == 0) {
            //         evenSum += digit;
            //     } else {
            //         oddSum += digit;
            //     }
    
            //     n /= 10;
            // }
            // System.out.println(evenSum + " " + oddSum);
            // int n= sc.nextInt(), s= sc.nextInt();
            // int r=sc.nextInt();
            // if(s>n){
            //     n=+r;
            // }else{
            //     s=+r;
            // }
            // int sat=sc.nextInt();
            // if(s>n){
            //     n=+sat;
            // }else{
            //     s=+sat;
            // }
            // if(s>n){
            //     System.out.println("S");
            // }else{
            //     System.out.println("N");
            // }
            //FRGAME CODECHEF:
            // int arr[]=new int[4];
            // for(int i=0; i<4;i++){
            //     arr[i]=sc.nextInt();
            // }
            // if(arr[1]>arr[0]){
            //     arr[0]+=arr[2];
            // }else{
            //     arr[1]+=arr[2];
            // }
            // if(arr[1]>arr[0]){
            //     arr[0]+=arr[3];
            // }else{
            //     arr[1]+=arr[3];
            // }
            // if(arr[1]>arr[0]){
            //     System.out.println("S");
            // }else{
            //     System.out.println("N");
            // }
            t--;
        }
    }
    //code ninja
    // public static int[] printNos(int x) {
    //     int arr[]=new int[x];
    //     generateArray(arr, x, 0);
    //     return arr;
    // }

    // private static void generateArray(int[] arr, int x, int index) {
    //     if (index >= x) {
    //         return;
    //     }
        
    //     arr[index] = index + 1;
    //     generateArray(arr, x, index + 1);
    // }
}