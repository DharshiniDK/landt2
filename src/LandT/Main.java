package LandT;
//import java.sql.SQLOutput;
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int s= sc.nextInt();
//    int e=sc.nextInt();
////    if(n<0){
////        System.out.println("Freezing weather");
////    }
////    else if(n>=0 && n<=9){
////        System.out.println("Very cold weather");
////    }
////    else if(n>=10 && n<=19){
////        System.out.println("Cold Weather");
////    }
////    else if(n>=20 && n<=29){
////        System.out.println("Normal Temperature");
////    }
////    else if(n>=30 && n<=39){
////        System.out.println("its hot");
////    }
////    else if(n>=40){
////        System.out.println("its very hot");
////    }
////        int j=4;
////        for(int i=1;i<=7;i++) {
////            System.out.print(j + " ");
////            j++;
//
//        while(s<=e){
//            System.out.println(s);
//            s++;
//        }
//  }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//                int size = sc.nextInt();
//        int arr[]=new int[size];
//        for(int i=0;i<size;i++){
//          arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a =sc.nextInt();
//        System.out.println("Number of events hosted in codissia is " +a);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        if(ch=='E' || ch=='e'){
//            System.out.println("Early Bird Ticket");
//        }
//        else if(ch=='D' ||ch=='d'){
//            System.out.println("Discount Ticket");
//        }
//        else if(ch=='V' ||ch=='v'){
//            System.out.println("VIP Ticket");
//        }
//        else if(ch=='S' ||ch== 's'){
//            System.out.println("Standard Ticket");
//        }
//        else if(ch=='C' ||ch=='c'){
//            System.out.println("Children Ticket");
//        }
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int t=(n/10)%10;
//        if(t%3==0){
//            System.out.println(n+ " is a trendy number");
//        }
//        else{
//            System.out.println(n+" is not a trendy number");
//        }
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=i+1;j<=i;j++) {
//                System.out.println(i);
//                if (j < i) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//
//import java.util.*;
//class Hotel{
//    int year;
//    String name;
//    Hotel(int year,String name){
//        this.year=year;
//        this.name=name;
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int year=sc.nextInt();
//        sc.nextLine();
//        String name=sc.nextLine();
//        ArrayList<Hotel> list=new ArrayList();
//        list.add(new Hotel(year,name));
//        System.out.println("Hotel Information :");
//        for(Hotel hotel:list){
//            System.out.println("Name : "+hotel.name);
//            System.out.println("Year: "+hotel.year);
//        }
//    }
//}
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int nums[][]=new int[3][4];
//        nums[i][j]=(int)(Math.random()*10);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

