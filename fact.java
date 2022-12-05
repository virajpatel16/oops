//2. Find factorial of given number using Class & Object.

import java.util.Scanner;

public class fact{

    public static void main(String[] args) {
        
    

    int fact;

 Scanner Sc=new Scanner(System.in);
    fact=Sc.nextInt();

    for(int i=fact; i<=1;i++){
        fact=fact*i;
    }


    System.out.println("the factorial number is "+fact);



    
}
}

