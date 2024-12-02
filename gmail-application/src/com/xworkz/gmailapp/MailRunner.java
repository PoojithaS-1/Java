package com.xworkz.gmailapp;

import com.xworkz.gmailapp.gmail.Gmail;
import com.xworkz.gmailapp.mail.Mail;
import com.xworkz.gmailapp.mail.MailImpl;

public class MailRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Mail mail1 = new Mail();
        mail1.setId(1);
        mail1.setFrom("varsha@gmail.com");
        mail1.setTo("poojitha@gmail.com");
        mail1.setSubject("Meeting Invitation: Team Discussion on Friday");
        mail1.setBody("I would like to invite you to a team discussion meeting on Friday at 2 PM." +
                " We will be discussing the upcoming project deadlines. ");
        mail1.setDocAttached(true);

        MailImpl gMail =  new MailImpl();
        gMail.saveMail(mail1);

        Mail mail2 = new Mail();
        mail2.setId(2);
        mail2.setFrom("kavya@gmail.com");
        mail2.setTo("pavitra@gmail.com");
        mail2.setSubject("Order Confirmation: Order #1234");
        mail2.setBody("Dear Customer," +
                "Thank you for your order. " +
                "Your order details are as follows: Order #1234, Total: $100. " +
                "We will ship your order within 24 hours." );
        mail2.setDocAttached(true);

        gMail.saveMail(mail2);

        Mail mail3 = new Mail();
        mail3.setId(3);
        mail3.setFrom("keerthi@gmail.com");
        mail3.setTo("bhoomika@gmail.com");
        mail3.setSubject("Job Application: Software Engineer Position");
        mail3.setBody("Dear Hiring Manager, " +
                "I am writing to apply for the Software Engineer position at your company. " +
                "I have attached my resume for your review. " +
                "Thank you for considering my application. ");
        mail3.setDocAttached(true);
        gMail.saveMail(mail3);

        Mail mail4 = new Mail();
        mail4.setId(4);
        mail4.setFrom("kishan@gmail.com");
        mail4.setTo("bhavya@gmail.com");
        mail4.setSubject("Job Application: Software Engineer Position");
        mail4.setBody("Dear Hiring Manager, " +
                "I am writing to apply for the Software Engineer position at your company. " +
                "I have attached my resume for your review. " +
                "Thank you for considering my application. ");
        mail4.setDocAttached(false);
        gMail.saveMail(mail4);

        Mail mail5 = new Mail();
        mail5.setId(5);
        mail5.setFrom("kiran@gmail.com");
        mail5.setTo("divya@gmail.com");
        mail5.setSubject("Job Application: Software Engineer Position");
        mail5.setBody("Dear Hiring Manager, " +
                "I am writing to apply for the Software Engineer position at your company. " +
                "I have attached my resume for your review. " +
                "Thank you for considering my application. ");
        mail5.setDocAttached(true);

        gMail.getAllMails();

        gMail.getInboxById(4);

        gMail.getMailByToaddr("pavitra@gmail.com");

        gMail.getMailByFromaddr("varsha@gmail.com");

        gMail.getMailBySubject("Order Confirmation: Order #1234");

        gMail.getMailByBody("I would like to invite you to a team discussion meeting on Friday at 2 PM. We will be discussing the upcoming project deadlines. ");

        System.out.println("Main Ended");
    }
}
