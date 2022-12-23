package com.maryor;

public class Main {
    public static void main(String[] args) {
        ITelephone maryorPhone;
        maryorPhone = new DeskPhone(12345);
        maryorPhone.powerOn();
        maryorPhone.callPhone(12345);
        maryorPhone.answer();

        maryorPhone = new MobilePhone(1234);
        maryorPhone.powerOn();
        maryorPhone.callPhone(1234);
        maryorPhone.answer();

    }
}
