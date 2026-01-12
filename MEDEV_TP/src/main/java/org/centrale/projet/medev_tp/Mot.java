/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Un mot
 * @author Max
 */
public class Mot {

    private List<String> mot;
    private List<String> maListeAfficher;
    private List<String> maListeNonAfficher;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String PATH = "dic.txt";
    private int nbLettres;

    /**
     *
     */
    public Mot() {
        this.mot = new ArrayList<>();
        this.maListeAfficher = new ArrayList<>();
        this.maListeNonAfficher = new ArrayList<>();
        nbLettres = 0;
    }

    /**
     *
     * @param mot
     * @param maListeAfficher
     * @param maListeNonAfficher
     * @param nbLettres
     */
    public Mot(List<String> mot, List<String> maListeAfficher, List<String> maListeNonAfficher, int nbLettres) {
        this.mot = mot;
        this.maListeAfficher = maListeAfficher;
        this.maListeNonAfficher = maListeNonAfficher;
        this.nbLettres = nbLettres;
    }
    
    /**
     *
     */
    public void init() {
        this.mot = new ArrayList<>();
        this.maListeAfficher = new ArrayList<>();
        this.maListeNonAfficher = new ArrayList<>();
        nbLettres = 0;
    }

    /**
     *
     * @return
     */
    public List<String> getMot() {
        return mot;
    }

    /**
     *
     * @param mot
     */
    public void setMot(List<String> mot) {
        this.mot = mot;
    }

    /**
     *
     * @return
     */
    public List<String> getMaListeAfficher() {
        return maListeAfficher;
    }

    /**
     *
     * @param maListeAfficher
     */
    public void setMaListeAfficher(List<String> maListeAfficher) {
        this.maListeAfficher = maListeAfficher;
    }

    /**
     *
     * @return
     */
    public List<String> getMaListeNonAfficher() {
        return maListeNonAfficher;
    }

    /**
     *
     * @param maListeNonAfficher
     */
    public void setMaListeNonAfficher(List<String> maListeNonAfficher) {
        this.maListeNonAfficher = maListeNonAfficher;
    }

    /**
     *
     * @param i
     */
    public Mot(int i) {
        String saisie = "";
        this.init();

        if (i == 2) {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Joueur 1 : Choisissez votre mot");
                saisie = sc.nextLine();
            } while (!isMot(saisie));
            System.out.println("Mot valide !");
        } else if (i == 1) {
                saisie = this.motInDictionnaire();
        } else {
            System.out.println("Ce n'est pas un chiffre entre 1 et 2");
            return;
        }
        //Je rajoute 1 à 1 les lettres dans mot, et je met des _ _ _ _ _ _ _ pour les lettres à affichées
        for (char ch : saisie.toLowerCase().toCharArray()) {
            String lettre = String.valueOf(ch);
            this.mot.add(lettre);
            this.maListeAfficher.add("_");
        }
        
        
    }

    /**
     *
     * @return
     */
    public int getNbLettres() {
        return nbLettres;
    }

    /**
     *
     * @param nbLettres
     */
    public void setNbLettres(int nbLettres) {
        this.nbLettres = nbLettres;
    }

    /**
     *
     * @param mot
     * @return
     */
    public boolean isMot(String mot) {
        if (mot == null || mot.isEmpty()) {
            return false;
        }

        for (char ch : mot.toLowerCase().toCharArray()) {
            if (!inAlphabet(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param c
     * @return
     */
    public boolean inAlphabet(String c) {
        if (c == null) {
            return false;
        }

        if (c.length() != 1) {
            return false;
        }

        return ALPHABET.contains(c.toLowerCase());
    }

    /**
     *
     */
    public void afficheListeAfficher() {
        System.out.println("========MOT========");
        System.out.println(this.maListeAfficher);
        System.out.println("===================");
    }

    /**
     *
     * @return
     */
    public String motInDictionnaire(){
        String mot="";
        Dictionnaire dic = new Dictionnaire();
        dic.lireFichier(PATH);
        Random nextIntAlea = new Random();
        List<String> maListeMot = dic.getMaListeMot();
        int indice = nextIntAlea.nextInt(maListeMot.size());
        mot = maListeMot.get(indice);
        return mot;
    }
    
    /**
     *
     * @param c
     */
    public void ajouter(String c) {
    if (c == null || c.length() != 1) {
        return;
    }
    List<Integer> positions = new ArrayList<Integer>();
    
    positions = this.occurrence(this.mot, c);
    System.out.println("Position : " + positions);
    System.out.println("mot" + this.mot.toString());

    for (int index : positions) {
        System.out.println("index : " + index);
        this.maListeAfficher.set(index, c.toLowerCase());
        
    }
    this.nbLettres += positions.size();
    }
    
    /**
     *
     * @param mot
     * @param c
     * @return
     */
    public List<Integer> occurrence(List<String> mot, String c) {
    List<Integer> oc = new ArrayList<>();

    if (mot != null && c != null && c.length() == 1) {
        String lettre = c.toLowerCase();

        for (int i = 0; i < mot.size(); i++) {
            if (lettre.equals(mot.get(i).toLowerCase())) {
                oc.add(i);
            }
        }
    }
    return oc;
}


}
