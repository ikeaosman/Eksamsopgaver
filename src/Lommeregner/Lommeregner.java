package Lommeregner;

import java.util.Scanner;

public class Lommeregner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Velkommen til lommeregneren");
        System.out.println("Indtast dit først tal");
        int førsteTal = in.nextInt();
        System.out.println("Indtast dit andet tal");
        int andetTal = in.nextInt();
        System.out.println("Indtast regneoperator");
        String regneoperator = in.next();
        

        if(regneoperator.equals("*")){
            System.out.println(førsteTal * andetTal);
        }


        else if (regneoperator.equals("- ")){
            System.out.println(førsteTal * andetTal);
        }

       else if(regneoperator.equals("/")){

        }
        System.out.println(førsteTal * andetTal);
        if(regneoperator == "+"){

        }
        System.out.println(førsteTal * andetTal);
       // System.out.println(førsteTal + regneoperator + andetTal  );


    }

/*
  if(regneoperator == "*"){
        }
        System.out.println(førsteTal * andetTal);

        if (regneoperator == "-"){

        }
        System.out.println(førsteTal * andetTal);

        if(regneoperator == "/"){

        }
        System.out.println(førsteTal * andetTal);
        if(regneoperator == "+"){

        }
        System.out.println(førsteTal * andetTal);
 */

}
