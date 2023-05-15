package com.belajar.design.pattern.singleton;

public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    // synchronized agar singeltonnya berjalan denngan sempurna, agar memastikan fungsi hanya diakses 1x dalam 1 waktu
    // synchronized digunbakan untuk menghindari race condition
    public synchronized void increment() {
        value++;
    }
}
