package com.example;

import java.util.Comparator;

class Malade implements Comparator<Malade> {
  private String codeMalade;
  private float coutMalade;

  public float getCoutMalade() {
    return this.coutMalade;
  }

  public String getCodeMalade() {
    return this.codeMalade;
  }

  @Override
  public String toString() {
    return "Code Malade: " + this.codeMalade + "\t tCout Malade: " + this.coutMalade;
  }  
  public boolean equals(Object obj) {
    return this.codeMalade == ((Malade) obj).getCodeMalade();
  }

  @Override
  public int compare(Malade m1, Malade m2) {
    return Math.round(m1.coutMalade - m2.getCoutMalade());
  } 
}
