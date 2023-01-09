//Recursion

//sum of n natural numbers threw recurion

class Ankit1{
   static int fun(int n){
      if(n==0){
         return 0;
      }
      else if(n==1){
         return 1;
      }
      else{
         return n+fun(n-1);
      }
   }
   public static void main(String[] args){
      int n=5;
      System.out.println("sum of " +n+ " natural number will be: ");
      System.out.println(fun(n));
   }
}

//factorial of number n by using recursion

class Ankit1{
   static int fun(int n){
      if(n==0 || n==1){
         return 1;
      }
      else{
         return n*fun(n-1);
      }
   }
   public static void main(String[] args){
      int n=5;
      System.out.println("factorial of " +n+" will be: " );
      System.out.println(fun(n));
   }
}

//print 1 to n without using for loop 

class Ankit1 {
   static void fun(int n) {
      if (n == 0) {
         return;
      } else {
         fun(n - 1);
         System.out.print(n + " ");

      }

   }

   public static void main(String[] args) {
      int n = 5;
      fun(n);
   }
}

//check wheather given element is present in array or not using recursion

class Ankit1{
   public static boolean fun(int arr[],int l,int u,int x){
      if(u<l){
         return false;
      }
      if(arr[l]==x || arr[u]==x){
         return true;
      }
      return fun(arr,l+1,u-1,x);

   }
   public static void main(String[] args){
      int arr[]={1,2,3,4,5,6};
      int x=0;
      int u=arr.length-1;
      int l=0;
      System.out.println(fun(arr, l, u, x));
   }

}

//tower of HANOI problem using recursion

class Recursion{
   static void Toh(int n,char A,char B,char C){
      if(n==1){
         System.out.println("disk "+n+" move from "+A+" to "+C);
         return;
      }
      Toh(n-1, A, C, B);
      System.out.println("disk "+n+" move from "+A+" to "+C);
      Toh(n-1, B, A, C);

   }
   public static void main(String[] args){
      int n=3;
      Toh(n,'A','B','C');
   }
   
   }

   //subset generation problem 

   class Recursion{
      static void Fun(String str,int index,String current){
         if(index==str.length()){
            System.out.println(current);
            return;
         }
         Fun(str, index+1, current);
         Fun(str, index+1, current+str.charAt(index));
      }
      public static void main(String[] args){
         String str="ABC";
         String current=" ";
         int index=0;
         Fun(str, index, current);
      }
   }

