package com.xworkz.gmailapp.mail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Mail {
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;
    private int id;

}








