import java.util.*;

public class MyCalc{

public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.println("Wlecome to Calculator");
System.out.println("1. +\n2. -\3. *\n4. /\n5. factorial\nEnter the choise: ");
int ch=in.nextInt();
switch (ch){
case 1:
add();
break;
case 2:
sub();
break;
case 3:
mul();
break;
case 4:
div();
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
System.out.prinln(n1+n2);}

public static double sub(){
Scanner in=new Scanner(System.in);
System.out.println("n1: ");
int n1=in.nextInt();
System.out.println("n2: ");
int n2=in.nextInt();
System.out.prinln(n1-n2);}
  
public static double mul(){
Scanner in=new Scanner(System.in);
System.out.println("n1: ");
int n1=in.nextInt();
System.out.println("n2: ");
int n2=in.nextInt();
System.out.prinln(n1*n2);}
  
public static double div(){
Scanner in=new Scanner(System.in);
System.out.println("n1: ");
int n1=in.nextInt();
System.out.println("n2: ");
int n2=in.nextInt();
System.out.prinln(n1/(double)n2);}
  
public static int facto(){
Scanner in=new Scanner(System.in);
System.out.println("n: ");
int n=in.nextInt();
int fact=1, i;
for(i=1;i<=n;i++){
fact=fact*i;}
System.out.prinln(n+"!: "+fact);}
}
