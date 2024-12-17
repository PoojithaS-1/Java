package com.xworkz.gmailapp.mail;

import com.xworkz.gmailapp.gmail.Gmail;

import java.util.Arrays;

public class MailImpl implements Gmail {
     Mail[] inbox;
    int index = 0;

    public MailImpl(int size) {
        inbox = new Mail[size];
    }

    @Override
    public boolean saveMail(Mail mail) {
        if (index < inbox.length) {
            inbox[index++] = mail;
            System.out.println("Saved Successfully...!");
            return true;
        } else {
            System.out.println("Inbox is full. Cannot save the mail.");
            return false;
        }
    }

    @Override
    public void getAllMails() {
        boolean isEmpty = true;
        for (Mail mail : inbox) {
            if (mail != null) {
                System.out.println(mail);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Inbox is empty.");
        }
    }

    @Override
    public Mail getInboxById(int id) {
        for (Mail mail : inbox) {
            if (mail != null && mail.getId() == id) {
                return mail;
            }
        }
        System.out.println("Mail not found with id: " + id);
        return null;
    }

    @Override
    public Mail getMailByToaddr(String to) {
        for (Mail mail : inbox) {
            if (mail != null && mail.getTo().equals(to)) {
                return mail;
            }
        }
        System.out.println("Mail not found with 'To' address: " + to);
        return null;
    }

    @Override
    public Mail getMailByFromaddr(String from) {
        for (Mail mail : inbox) {
            if (mail != null && mail.getFrom().equals(from)) {
                return mail;
            }
        }
        System.out.println("Mail not found with 'From' address: " + from);
        return null;
    }

    @Override
    public Mail getMailBySubject(String subject) {
        for (Mail mail : inbox) {
            if (mail != null && mail.getSubject().equals(subject)) {
                return mail;
            }
        }
        System.out.println("Mail not found with subject: " + subject);
        return null;
    }

    @Override
    public Mail getMailByBody(String body) {
        for (Mail mail : inbox) {
            if (mail != null && mail.getBody().equals(body)) {
                return mail;
            }
        }
        System.out.println("Mail not found with body: " + body);
        return null;
    }

    @Override
    public Mail getMailByisDocAttached(boolean isDocAttached) {
        for (Mail mail : inbox) {
            if (mail != null && mail.isDocAttached()==isDocAttached) {
                return mail;
            }
        }
        System.out.println("Mail not found with isDocAttached: " + isDocAttached);
        return null;
    }


    @Override
    public boolean upadateFromById(String updatedFrom, int id) {
        boolean isFromUpdated = false;
        for (Mail mail : inbox) {
            if (mail != null && mail.getFrom() != null && mail.getId() == id) {
                mail.setFrom(updatedFrom);
                isFromUpdated = true;
            }
        }
        if (isFromUpdated == false)
            System.out.println(id + " Not found");
            return isFromUpdated;
    }

    @Override
    public boolean upadateFromAndToById(String updatedFrom, String updatedTo, int id) {
        boolean isFromAndToUpdated = false;
        for (Mail mail : inbox) {
            if (mail != null && mail.getFrom() != null && mail.getId() == id) {
                mail.setFrom(updatedFrom);
                mail.setTo(updatedTo);
                isFromAndToUpdated = true;
            }
        }
        if (isFromAndToUpdated == false)
            System.out.println(id + " Not found");
        return isFromAndToUpdated;
    }

    @Override
    public boolean deleteMailById(int id){
        boolean isMailDeleted=false;
        int i=0;
        for (int start=0;start<inbox.length;start++){
            Mail mail1=inbox[start];
            if (mail1.getId() != id){
                inbox[i++]=inbox[start];
            }else {
                isMailDeleted=true;
            }
        }
        int size=i;
        inbox= Arrays.copyOf(inbox,i);
        return isMailDeleted;

    }

}
