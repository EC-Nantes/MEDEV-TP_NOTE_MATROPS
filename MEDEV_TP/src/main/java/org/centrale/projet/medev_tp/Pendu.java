/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.projet.medev_tp;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Pendu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de joueurs : ");
        int nb_joueur = scanner.nextInt();
        System.out.print("Entrez le nombre d'erreurs maximum (>=7) : ");
        int nb_rounds = scanner.nextInt();
        while (not ((nb_joueur==1 || nb_joueur==2) && nb_rounds>=7)){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre de joueurs compris entre 1 et 2: ");
            int nb_joueur = scanner.nextInt();
            System.out.print("Entrez le nombre d'erreurs maximum (>=7) : ");
            int nb_rounds = scanner.nextInt();
        }
        Partie partie = new Partie(nb_joueur, nb_rounds);
        Mot mot = new Mot(nb_joueur);
        while (partie.getEtat()==0) {
            partie.afficheLettresProposées();
            System.out.print("Entrez une lettre : ");
            String lettre = scanner.nextLine();
            if (inAlphabet(lettre) && lettre not in partie.getLettres_proposées()){
                partie.getLettres_proposées().add(lettre);
                if (lettre in mot.getMaListeNonAfficher()){
                    System.out.print("Le mot contient bien la lettre "+lettre);
                    mot.getMaListeNonAfficher().remove(lettre);
                    mot.getMaListeAfficher().add(lettre);
                    if (mot.getMaListeNonAfficher().size()==0){
                        partie.setEtat(1);
                    }
                    partie.afficheTours();
                } else {
                    System.out.print("Le mot ne contient pas la lettre "+lettre);
                    partie.setNb_erreurs_restantes(getNb_erreurs_restantes()-1);
                    if (getNb_erreurs_restantes()==0){
                        partie.setEtat(2);
                    }
                    partie.afficheTours();
                }
            } else {
                System.out.print("Veuillez entrer une lettre qui n'a pas déjà été proposée.");
            }
        }
    }
}
