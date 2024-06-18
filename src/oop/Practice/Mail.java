package oop.Practice;

public class Mail {
    User sender;
    User recipient;
    Server server;
    String date;

    public Mail(User sender, User recipient, Server server, String date) {
        this.sender = sender;
        this.recipient = recipient;
        this.server = server;
        this.date = date;
    }

    void sendMail(String text){
        System.out.println("Odesilatel: " + sender.name);
        System.out.println("Prijemce: " + recipient.name);
        System.out.println(text);
        System.out.println("Dated: " + date);
    }

    void printServerInfo(){
        System.out.println("Posilani zajistuje " + server.name + " na adrese " + server.ip);
    }

    public static void main(String[] args) {
        User u1 = new User("Karel", "karel@mail.com");
        User u2 = new User("Pepa", "pepa@mail.com");
        Server s = new Server("10.1.14.18", "MAIL_1");
        Mail m = new Mail(u1, u2, s, "14.6.2024");
        m.printServerInfo();
        m.sendMail("Hello world via email");
    }
}
