package org.sourcehot.dubbo.spi.impl;


import org.sourcehot.dubbo.spi.SpiInterface;

public class FirstSpiInterfaceImpl implements SpiInterface {
    @Override
    public void sayHello() {
        System.out.println("first say hello");
    }
}
