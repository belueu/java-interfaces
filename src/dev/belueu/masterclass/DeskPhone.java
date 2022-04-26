package dev.belueu.masterclass;

import java.util.Objects;

public class DeskPhone implements Telephone{

    private String phoneNumber;
    private boolean isRinging;

    public DeskPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone no power button found!");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " form desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer please the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (Objects.equals(this.phoneNumber, phoneNumber)) {
            isRinging = true;
            System.out.println("Desk phone ringing ...");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
