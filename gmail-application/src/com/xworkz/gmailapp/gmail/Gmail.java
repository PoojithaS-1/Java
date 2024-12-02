package com.xworkz.gmailapp.gmail;

import com.xworkz.gmailapp.mail.Mail;

public interface Gmail {
    public boolean saveMail(Mail mail) ;

    public void getAllMails() ;


    public Mail getInboxById(int Id);

    public Mail getMailByToaddr(String to );

    public Mail getMailByFromaddr(String from );

    public Mail getMailBySubject(String subject);

    public Mail getMailByBody(String body);

}


