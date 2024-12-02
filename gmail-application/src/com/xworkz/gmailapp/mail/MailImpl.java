package com.xworkz.gmailapp.mail;

import com.xworkz.gmailapp.gmail.Gmail;

public class MailImpl implements Gmail {
    Mail inbox[] = new Mail[4];
    int index = 0;
    @Override
    public boolean saveMail(Mail mail) {
        boolean isMailSaved = false;
        if (index < inbox.length) {
            this.inbox[index++] = mail;
            isMailSaved = true;
            System.out.println("Saved Sucessfully...!");
        }
        if (index >= inbox.length) {
            System.out.println("AyyarIndexOutOfBoundsException....Inbox full..!");
        }
        return isMailSaved;
    }
    @Override
    public void getAllMails() {
        for (Mail mail : inbox) {
            if (mail != null) {
                System.out.println("Mail Info:");
                System.out.println("MailId: " + mail.getId());
                System.out.println("To: " + mail.getTo());
                System.out.println("From: " + mail.getFrom());
                System.out.println("Subject: " + mail.getSubject());
                System.out.println("Body: " + mail.getBody());
                System.out.println("Is Doc Attached: " + mail.isDocAttached());
                System.out.println("--------------------------------------------------------");


            } else {
                System.out.println("Empty inbox");
            }

        }
    }
    @Override

    public Mail getInboxById(int Id) {
        System.out.println("getInboxById started");
        Mail isIdFound = null;
        for (Mail mailRef : inbox) {
            if (mailRef != null && mailRef.getId() == Id) {
                isIdFound = mailRef;
                System.out.println("Mail Found:");
                System.out.println("MailId: " + mailRef.getId());
                System.out.println("To: " + mailRef.getTo());
                System.out.println("From: " + mailRef.getFrom());
                System.out.println("Subject: " + mailRef.getSubject());
                System.out.println("Body: " + mailRef.getBody());
                System.out.println("Is Doc Attached: " + mailRef.isDocAttached());
                System.out.println("*******************************************************");
            }
        }
        if (isIdFound == null) {
            System.out.println("Mail not found with id: " + Id);
        }
        System.out.println("getInboxById ended");
        return isIdFound;

    }
    @Override
    public Mail getMailByToaddr(String to ){
        System.out.println("getMailByToaddr Started");
        Mail isToAddrFound=null;
        for (Mail mailRef:inbox){
            if (mailRef !=null && mailRef.getTo()==to) {
                isToAddrFound = mailRef;
                System.out.println("Mail Found:");
                System.out.println("MailId: " + mailRef.getId());
                System.out.println("To: " + mailRef.getTo());
                System.out.println("From: " + mailRef.getFrom());
                System.out.println("Subject: " + mailRef.getSubject());
                System.out.println("Body: " + mailRef.getBody());
                System.out.println("Is Doc Attached: " + mailRef.isDocAttached());
                System.out.println("*******************************************************");
            }
        }
        if (isToAddrFound ==null){
            System.out.println("To address not found");
        }
        System.out.println("getMailByToaddr ended");
        return isToAddrFound;
    }
    @Override
    public Mail getMailByFromaddr(String from ){
        System.out.println("getMailByFromaddr Started");
        Mail isFromAddrFound =null;
        for (Mail mailRef:inbox){
            if (mailRef !=null && mailRef.getFrom()==from) {
                isFromAddrFound = mailRef;
                System.out.println("Mail Found:");
                System.out.println("MailId: " + mailRef.getId());
                System.out.println("To: " + mailRef.getTo());
                System.out.println("From: " + mailRef.getFrom());
                System.out.println("Subject: " + mailRef.getSubject());
                System.out.println("Body: " + mailRef.getBody());
                System.out.println("Is Doc Attached: " + mailRef.isDocAttached());
                System.out.println("*******************************************************");
            }
        }
        if (isFromAddrFound ==null){
            System.out.println("From address not found");
        }
        System.out.println("getMailByFromaddr ended");
        return isFromAddrFound;
    }
    @Override
    public Mail getMailBySubject(String subject){
        System.out.println("getMailBySubject started");
        Mail isSubjectFound=null;
        for (Mail mailRef:inbox){
            if (mailRef !=null && mailRef.getSubject()==subject){
                isSubjectFound=mailRef;
                System.out.println("Mail Found:");
                System.out.println("MailId: " + mailRef.getId());
                System.out.println("To: " + mailRef.getTo());
                System.out.println("From: " + mailRef.getFrom());
                System.out.println("Subject: " + mailRef.getSubject());
                System.out.println("Body: " + mailRef.getBody());
                System.out.println("Is Doc Attached: " + mailRef.isDocAttached());
                System.out.println("*******************************************************");
            }
        }
        if (isSubjectFound==null){
            System.out.println("Subject not found");
        }
        System.out.println("getMailBySubject ended");
        return isSubjectFound;
    }
    @Override
    public Mail getMailByBody(String body){
        System.out.println("getMailByBody started");
        Mail isMailBodyFound =null;
        for (Mail mailRef:inbox){
            if (mailRef !=null && mailRef.getBody()==body){
                isMailBodyFound =mailRef;
                System.out.println("Mail Found:");
                System.out.println("MailId: " + mailRef.getId());
                System.out.println("To: " + mailRef.getTo());
                System.out.println("From: " + mailRef.getFrom());
                System.out.println("Subject: " + mailRef.getSubject());
                System.out.println("Body: " + mailRef.getBody());
                System.out.println("Is Doc Attached: " + mailRef.isDocAttached());
                System.out.println("*******************************************************");
            }
        }
        if (isMailBodyFound ==null){
            System.out.println("Mail body not found");
        }
        System.out.println("getMailByBody ended");
        return isMailBodyFound;
    }
}
