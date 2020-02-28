package org.sourcehot.dubbo.spi.impl;

import org.sourcehot.dubbo.spi.SpiInterface;

public class SecSpiInterfaceImpl implements SpiInterface {
  @Override
  public void sayHello() {
    System.out.println("sec say hello");
  }
}
