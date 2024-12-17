package com.xworkz.gmailapp.gmail;

import com.xworkz.gmailapp.mail.Mail;

public interface Gmail {
    boolean saveMail(Mail mail);

    void getAllMails();

    Mail getInboxById(int id);

    Mail getMailByToaddr(String to);

    Mail getMailByFromaddr(String from);

    Mail getMailBySubject(String subject);

    Mail getMailByBody(String body);

    Mail getMailByisDocAttached(boolean isDocAttached);

    boolean upadateFromById(String updatedFrom, int id);

    boolean upadateFromAndToById(String updatedFrom, String updatedTo, int id);

    boolean deleteMailById(int id);
}