import java.io.*;
import java.lang.*;
import java.util.*;


 class Main {
     public static void main(String args[]) throws IOException {
         InputStreamReader I = new InputStreamReader(System.in);
         BufferedReader B = new BufferedReader(I);
         System.out.println("Welcome To MIT Email Services ");
         System.out.print("Enter function ( singup, login, compose):");
         String ch = B.readLine();

         if (ch.equals("singup")) {
             InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader input = new BufferedReader(reader);
             System.out.print("Username@gmail.com:");
             java.lang.String User = input.readLine();
             System.out.print("Password: ");
             java.lang.String Pass = input.readLine();

             System.out.println("New ID Created Successfully!");

             FileWriter fout = new FileWriter(User + "@gmail.com");
             BufferedWriter bout = new BufferedWriter(fout);
             PrintWriter pout = new PrintWriter(bout);
             pout.println(Pass);

             FileWriter fot = new FileWriter(User);
             BufferedWriter bot = new BufferedWriter(fot);
             PrintWriter pot = new PrintWriter(bot);

             pout.close();
             bout.close();
             pout.close();
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
             else
             {
                 System.out.println("Wrong password!");
             }
         }

         else
         if(ch.equals("compose"))
         {

             InputStreamReader reader=new InputStreamReader(System.in);
             BufferedReader input=new BufferedReader(reader);
             Calendar c=Calendar.getInstance();

             System.out.print("Username: ");
             java.lang.String User1=input.readLine();
             System.out.print("Password: ");
             java.lang.String Pass=input.readLine();

             FileReader fout=new FileReader(User1+"@gmail.com");
             BufferedReader bout=new BufferedReader(fout);

             java.lang.String data=bout.readLine();
             if(Pass.equals(data))
             {
                 System.out.println("Logged On!");

                 System.out.print("To:   ");
                 java.lang.String User=input.readLine();

                 System.out.print("From:   ");
                 java.lang.String From=input.readLine();
                 System.out.println("");
                 System.out.println("Letter Content:");
                 java.lang.String Body=input.readLine();

                 FileWriter fin=new FileWriter(User);
                 BufferedWriter bin=new BufferedWriter(fin);
                 PrintWriter pin=new PrintWriter(bin);
                 System.out.println("");
                 pin.println("Time:"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" PM");
                 pin.println("From "+From+",");
                 pin.println(Body);
                 System.out.println("");
                 System.out.println("Mail sent!");
                 bout.close();
                 pin.close();
                 bin.close();
                 pin.close();
             }
             else
             {
                 System.out.println("Wrong password!");
             }


         }
         else
             System.out.println("Wrong choice!");
     }
 }


