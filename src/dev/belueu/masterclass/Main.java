package dev.belueu.masterclass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Telephone publicPhone = new DeskPhone("1234567");
        publicPhone.powerOn();
        publicPhone.callPhone("1234567");
        publicPhone.answer();
        publicPhone.dial("1233431231");
        publicPhone.callPhone("1233431231");

        Telephone mobilePhone = new MobilePhone("23456");
        mobilePhone.powerOn();
        mobilePhone.callPhone("23456");
        mobilePhone.answer();

    }
}
