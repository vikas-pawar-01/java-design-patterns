package com.designpattern;

import com.designpattern.solid.dip.DependencyInversionDemo;
import com.designpattern.solid.isp.InterfaceSegregationDemo;
import com.designpattern.solid.lsp.LiskovSubstitutionDemo;
import com.designpattern.solid.ocp.OpenClosedDemo;
import com.designpattern.solid.srp.SingleResponsibilityDemo;
import com.designpattern.patterns.builder.BuilderPatternDemo;
import com.designpattern.patterns.factory.FactoryPatternDemo;
import com.designpattern.patterns.prototype.PrototypePatternDemo;
import com.designpattern.patterns.singleton.SingletonPatternDemo;

public class App {
  public static void main(String[] args) {
    SingleResponsibilityDemo.run();
    OpenClosedDemo.run();
    LiskovSubstitutionDemo.run();
    InterfaceSegregationDemo.run();
    DependencyInversionDemo.run();

    // Design Patterns
    SingletonPatternDemo.run();
    FactoryPatternDemo.run();
    PrototypePatternDemo.run();
    BuilderPatternDemo.run();
  }
}