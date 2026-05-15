package application;


import entities.*;

import java.text.ParseException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        List<Notificable> list = new ArrayList<>();

        EmailNotification email = new EmailNotification();
        SmsNotification sms = new SmsNotification();

        email.send("Ola, estou enviando uma email");
        sms.send("Estou enviando um sms");

        list.add(email);
        list.add(sms);

        sc.close();
    }
}