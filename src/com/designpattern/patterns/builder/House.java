package com.designpattern.patterns.builder;

public class House {
  private String foundation;
  private String structure;
  private String roof;
  private boolean hasGarage;
  private boolean hasSwimmingPool;

  // Getters and setters
  public String getFoundation() {
    return foundation;
  }

  public void setFoundation(String foundation) {
    this.foundation = foundation;
  }

  public String getStructure() {
    return structure;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public String getRoof() {
    return roof;
  }

  public void setRoof(String roof) {
    this.roof = roof;
  }

  public boolean isHasGarage() {
    return hasGarage;
  }

  public void setHasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
  }

  public boolean isHasSwimmingPool() {
    return hasSwimmingPool;
  }

  public void setHasSwimmingPool(boolean hasSwimmingPool) {
    this.hasSwimmingPool = hasSwimmingPool;
  }

  @Override
  public String toString() {
    return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof +
        ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool + "]";
  }
}