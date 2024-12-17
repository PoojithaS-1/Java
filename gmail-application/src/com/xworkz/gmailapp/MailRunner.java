package com.xworkz.gmailapp;

import com.xworkz.gmailapp.mail.Mail;
import com.xworkz.gmailapp.mail.MailImpl;

import java.util.Scanner;

public class MailRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of mails to be added: ");
        int size = scanner.nextInt();
        MailImpl mailImpl = new MailImpl(size);

        for (int i = 0; i < size; i++) {
            Mail mail = new Mail();
            System.out.println("Mail id: ");
            mail.setId(scanner.nextInt());
            System.out.println("Mail From: ");
            mail.setFrom(scanner.next());
            System.out.println("Mail To: ");
            mail.setTo(scanner.next());
            scanner.nextLine();
            System.out.println("Add Subject: ");
            mail.setSubject(scanner.nextLine());
            System.out.println("Mail Body: ");
            mail.setBody(scanner.nextLine());
            System.out.println("Is Doc attached: ");
            mail.setDocAttached(scanner.nextBoolean());

            mailImpl.saveMail(mail);
        }

        String input;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Display all mails");
            System.out.println("2. Fetch mail by ID");
            System.out.println("3. Find mail by 'To' address");
            System.out.println("4. Find mail by 'From' address");
            System.out.println("5. Find mail by Subject");
            System.out.println("6. Find mail by Body");
            System.out.println("7. To Upadate From By Id");
            System.out.println("8. To Upadate From & To By Id");
            System.out.println("9. To delete Mail by Id");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    mailImpl.getAllMails();
                    break;
                case 2:
                    System.out.println("Enter ID: ");
                    Mail mailById = mailImpl.getInboxById(scanner.nextInt());
                    System.out.println(mailById);
                    break;
                case 3:
                    System.out.println("Enter 'To' address: ");
                    scanner.nextLine();
                    Mail mailByTo = mailImpl.getMailByToaddr(scanner.nextLine());
                    System.out.println(mailByTo);
                    break;
                case 4:
                    System.out.println("Enter 'From' address: ");
                    scanner.nextLine();
                    Mail mailByFrom = mailImpl.getMailByFromaddr(scanner.nextLine());
                    System.out.println(mailByFrom);
                    break;
                case 5:
                    System.out.println("Enter Subject: ");
                    scanner.nextLine();
                    Mail mailBySubject = mailImpl.getMailBySubject(scanner.nextLine());
                    System.out.println(mailBySubject);
                    break;
                case 6:
                    System.out.println("Enter Mail Body: ");
                    scanner.nextLine();
                    Mail mailByBody = mailImpl.getMailByBody(scanner.nextLine());
                    System.out.println(mailByBody);
                    break;
                case 7:
                    System.out.println("Enter info of IsDocAttached: ");
                    Mail isDocAttached=mailImpl.getMailByisDocAttached(scanner.nextBoolean());
                    System.out.println(isDocAttached);
                    break;
                case 8:
                    System.out.println("Enter updated From");
                    String updatedFrom=scanner.next();
                    System.out.println("Enter existing Id");
                    int id=scanner.nextInt();
                    mailImpl.upadateFromById(updatedFrom,id);
                    mailImpl.getAllMails();
                    break;
                case 9:
                    System.out.println("Enter updated From");
                    String updatedFrom1 =scanner.next();
                    System.out.println("Enter updated To");
                    String updatedTo1 =scanner.next();
                    System.out.println("Enter existing Id");
                    int id1=scanner.nextInt();
                    mailImpl.upadateFromAndToById(updatedFrom1,updatedTo1,id1);
                    mailImpl.getAllMails();
                    break;

                case 10:
                    System.out.println("Enter id which is to be deleted");
                    mailImpl.deleteMailById(scanner.nextInt());
                    System.out.println("Deleted successfully..!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue? (Y/N)");
            input = scanner.next();
        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you for using the application!");
    }
}
