package com.sourcehot.dubbo.spi.impl;

import com.sourcehot.dubbo.spi.SpiInterface;

public class SecSpiInterfaceImpl implements SpiInterface {
  @Override
  public void sayHello() {
    System.out.println("sec say hello");
  }
}
