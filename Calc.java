import java.util.*;

public class MyCalc{

public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println("Wlecome to Calculator");
System.out.println("1. +\n2. -\nEnter the choise: ");
int ch=in.nextInt();
switch (ch){
case 1:
add();
break;
case 2:
sub();
break;
default:
System.out.println("Invalid response!"); }
  }

public ststic double add(){
Scanner in=new Scanner(System.in);
System.out.println("n1: ");
int n1=in.nextInt();
System.out.println("n2: ");
int n2=in.nextInt();
return (n1+n2);}

public static double sub(){
Scanner in=new Scanner(System.in);
System.out.println("n1: ");
int n1=in.nextInt();
System.out.println("n2: ");
int n2=in.nextInt();
return (n1-n2);
}

}
