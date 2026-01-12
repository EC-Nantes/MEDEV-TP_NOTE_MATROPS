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
 *
 * @author Max
 */
public class Mot {

    private List<String> mot;
    private List<String> maListeAfficher;
    private List<String> maListeNonAfficher;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String PATH = "";

    public Mot() {
        this.mot = new ArrayList<>();
        this.maListeAfficher = new ArrayList<>();
        this.maListeNonAfficher = new ArrayList<>();
    }

    public Mot(List<String> mot, List<String> maListeAfficher, List<String> maListeNonAfficher) {
        this.mot = mot;
        this.maListeAfficher = maListeAfficher;
        this.maListeNonAfficher = maListeNonAfficher;
    }
    
    public void init() {
        this.mot = new ArrayList<>();
        this.maListeAfficher = new ArrayList<>();
        this.maListeNonAfficher = new ArrayList<>();
    }

    public List<String> getMot() {
        return mot;
    }

    public void setMot(List<String> mot) {
        this.mot = mot;
    }

    public List<String> getMaListeAfficher() {
        return maListeAfficher;
    }

    public void setMaListeAfficher(List<String> maListeAfficher) {
        this.maListeAfficher = maListeAfficher;
    }

    public List<String> getMaListeNonAfficher() {
        return maListeNonAfficher;
    }

    public void setMaListeNonAfficher(List<String> maListeNonAfficher) {
        this.maListeNonAfficher = maListeNonAfficher;
    }

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

    public boolean inAlphabet(String c) {
        if (c == null) {
            return false;
        }

        if (c.length() != 1) {
            return false;
        }

        return ALPHABET.contains(c.toLowerCase());
    }

    public void afficheListeAfficher() {
        System.out.println("========MOT========");
        System.out.println(this.maListeAfficher);
        System.out.println("===================");
    }

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
    
}
