package com.example;

import java.util.Iterator;
import java.util.TreeSet;

class hopital {
  private String nom;
  private TreeSet<Malade> desMalades = new TreeSet<Malade>();

  public hopital(String nom) {
    this.nom = nom;
  }

  public void ajouterMalade(Malade m) {
    desMalades.add(m);
  }

  public float chercherCoutMalade(String codeMalade) {
    Iterator<Malade> it = desMalades.iterator();
    float result = -1;

    while (it.hasNext()) {
      Malade maladeI = it.next();
      if (maladeI.getCodeMalade() == codeMalade) {
        result = maladeI.getCoutMalade();
        break;
      }
    }
    return result;
  }

  public void afficherHopital() {
    System.out.println("Le nom du hopital est : " + nom);
    Iterator<Malade> it = desMalades.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
