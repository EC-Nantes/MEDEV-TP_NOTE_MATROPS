/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev_tp;

import static java.lang.Integer.parseInt;
import java.util.List;
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

    public Mot() {
    }

    public Mot(List<String> mot, List<String> maListeAfficher, List<String> maListeNonAfficher) {
        this.mot = mot;
        this.maListeAfficher = maListeAfficher;
        this.maListeNonAfficher = maListeNonAfficher;
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

        if (i == 1) {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Joueur 1 : Choisissez votre mot");
                saisie = sc.nextLine();
            } while (!isMot(saisie));
            System.out.println("Mot valide !");
        } else if (i == 2) {
            
        } else {
            System.out.println("Ce n'est pas un chiffre entre 1 et 2");
            return; 
        }

        for (char ch : saisie.toLowerCase().toCharArray()) {
            String lettre = String.valueOf(ch);
            this.mot.add(lettre);
            this.maListeAfficher.add("_");
        }
    }

    public static boolean isMot(String mot) {

        if (mot == null || mot.isEmpty()) {
            return false;
        }

        for (char c : mot.toLowerCase().toCharArray()) {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }
    
    public void afficheListeAfficher(){
        System.out.println("========MOT========");
        System.out.println(this.maListeAfficher);
    }

}
