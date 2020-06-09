package com.apress.prospring5.ch3;

public class ContextualizedDependencyLookup implements ManagedComponent {

  private Dependency dependency;

  @Override
  public void performLookup(MyContainer container) {
    this.dependency = (Dependency) container.getDependency("myDependency");
  }

  @Override
  public String toString() {
    return this.dependency.toString();
  }
}
