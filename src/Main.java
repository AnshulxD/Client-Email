import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
     public static void main(String args[]) throws IOException {
         InputStreamReader I = new InputStreamReader(System.in);
         BufferedReader B = new BufferedReader(I);
         System.out.println("Welcome To MIT Email Services ");
         System.out.print("Enter function ( signup, login, compose):");
         String ch = B.readLine();



} else if (ch.equals("login")) {
             InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader input = new BufferedReader(reader);
             System.out.print("Username: ");
             java.lang.String User = input.readLine();
             System.out.print("Password: ");
             java.lang.String Pass = input.readLine();

             FileReader fout = new FileReader(User + "@gmail.com");
             BufferedReader bout = new BufferedReader(fout);

             java.lang.String data = bout.readLine();
             if (Pass.equals(data)) {
                 System.out.println("Logged On!");
                 System.out.print("Do you want to go to the inbox: (yes/no)");
                 java.lang.String Ask = input.readLine();
                 if (Ask.equals("yes")) {
                     FileReader f = new FileReader(User);
                     BufferedReader b = new BufferedReader(f);
                     System.out.println("");
                     java.lang.String composed;
                     int i = 0;
                     while ((composed = b.readLine()) != null) {
                         i++;
                         System.out.println(composed);
                     }
                     System.out.println("");
                     b.close();
                     bout.close();
                 }
             }
