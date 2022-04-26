package dev.belueu.masterclass;

import java.util.Objects;

public class MobilePhone implements Telephone {

    private String phoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powering on");
    }

    @Override
    public void dial(String phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " from mobile phone");
        } else {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answer please the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (Objects.equals(this.phoneNumber, phoneNumber) && isOn) {
            isRinging = true;
            System.out.println("Mobile phone is ringing ...");
        } else {
            isRinging = false;
            System.out.println("Mobile phone off or incorrect number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
