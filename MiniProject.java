package com.MiniProject;
import java.util.Scanner;
 public class MiniProject{
 public static void main (String[] args) {
Scanner sc=(int)new Scanner(System.in);
int mynumber = (Math.random()*100);
int userNumber=0;
do{
    System.out.println("Guess the number");
    int userNumber =sc.nextInt();
    if(userNumber==mynumber){
        system.out.println("Correct Number!!");
 }
 else if(userNumber>mynumber){
    System.out.println("TOO Large");

}
else {
    System.out.println("TOO small");

}
    
}
while(userNumber>=0);
System.out.println("My number was");
System.out.println(mynumber);

    }
    
}
