package searchEmail;

import java.util.ArrayList;
import java.util.Scanner;

public class searchEmail {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("aparna.kota@gmail.com");
        emailID.add("amulya.kandukuri@outlook.com");
        emailID.add("shreya.kashetti@yahoo.com");
        emailID.add("soniya.kodam@gmail.com");
        emailID.add("abhinav.rampeesa@outlook.com");
        emailID.add("pavan.bubby@yahoo.com");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter email");
        String searchEmail = input.nextLine();
        
        if(emailID.contains(searchEmail)){
        	System.out.println("Email ID " + searchEmail + " is Valid");
        }
        else{
        	System.out.println("Email ID " + searchEmail + " is not Valid");
        }
    }
}
