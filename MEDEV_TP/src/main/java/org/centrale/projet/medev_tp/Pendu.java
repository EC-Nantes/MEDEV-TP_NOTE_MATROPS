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
        System.out.print("Entrez le nombre de rounds maximum (>=7) : ");
        int nb_rounds = scanner.nextInt();
        if ((nb_joueur==1 || nb_joueur==2) && nb_rounds>=7){
            Partie partie = new Partie(nb_joueur, nb_rounds);
            Mot mot = new Mot(nb_joueur);
            while (partie.getEtat()==0) {
                
            }
        }
        } else {
            System.out.print("Veuillez entrer un nombre de joueurs compris entre 1 et 2, et un nombre maximum de rounds supérieur ou égal à 7.");
        }
    }
}
