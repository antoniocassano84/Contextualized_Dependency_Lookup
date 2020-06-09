package com.apress.prospring5.ch3;

public class DefaultContainer implements MyContainer {

  @Override
  public Object getDependency(String key) {
    if(key.equals("myDependency")) {
      return new Dependency();
    }
    throw new RuntimeException("Unknown dependency: " + key);
  }
}
