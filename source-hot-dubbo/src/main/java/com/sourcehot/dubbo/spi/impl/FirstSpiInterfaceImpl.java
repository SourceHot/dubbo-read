package com.sourcehot.dubbo.spi.impl;


import com.sourcehot.dubbo.spi.SpiInterface;

public class FirstSpiInterfaceImpl implements SpiInterface {
    @Override
    public void sayHello() {
        System.out.println("first say hello");
    }
}
