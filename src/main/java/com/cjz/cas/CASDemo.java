package com.cjz.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo {
    //CAS compareAndSet : 比较并交换
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2020);

        //期望、更新
        //public final boolean compareAndSet(int expect, int update){}
        //如果我期望的值达到了，那么就更新，否则，就不更新，CAS是CPU的并发原语！
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());

        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());

    }
}
