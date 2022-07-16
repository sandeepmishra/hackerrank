package com.practice;

import java.util.Optional;

public class NestedNullPointerChecks {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SoundCard soundCard = new SoundCard();
        USB usb = new USB();

        String value = Optional.of(computer).map(Computer::getSoundCard)
                .map(SoundCard::getUsb)
                .map(USB::getVersion).orElse("EMPTY");
        System.out.println(value);
        computer.setSoundCard(soundCard);

        value = Optional.of(computer).map(Computer::getSoundCard)
                .map(SoundCard::getUsb)
                .map(USB::getVersion).orElse("EMPTY");
        System.out.println(value);

        soundCard.setUsb(usb);
        value = Optional.of(computer).map(Computer::getSoundCard)
                .map(SoundCard::getUsb)
                .map(USB::getVersion).orElse("EMPTY");
        System.out.println(value);

        value = Optional.of(computer).map(Computer::getSoundCard)
                .map(SoundCard::getUsb)
                .map(usb1-> usb1.getVersion()).orElse("EMPTY");
        System.out.println(value);

        usb.setVersion("1.0");
        value = Optional.of(computer).map(Computer::getSoundCard)
                .map(SoundCard::getUsb)
                .map(USB::getVersion).get();
        System.out.println(value);
    }
}

class Computer{
    private SoundCard soundCard;

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}

class SoundCard{
    private USB usb;

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}
class USB{
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}