/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author selli
 */
public final class Partie {
    private int mode; // 0 pour mode 1 joueur, 1 pour mode 2 joueurs
    private int etat; // 0 pour en cours, 1 pour gagnée, 2 pour perdue
    private int nb_rounds; // Nombre de rounds maximal
    private int nb_erreurs_restantes; 
    private ArrayList<String> lettres_proposées;
    
    public Partie(int nb_joueur, int nb_rounds){
        setMode(nb_joueur-1);
        setEtat(0);
        setNb_rounds(nb_rounds);
        setNb_erreurs_restantes(nb_rounds);
    }
    
    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getNb_rounds() {
        return nb_rounds;
    }

    public void setNb_rounds(int nb_rounds) {
        this.nb_rounds = nb_rounds;
    }

    public int getNb_erreurs_restantes() {
        return nb_erreurs_restantes;
    }

    public void setNb_erreurs_restantes(int nb_erreurs_restantes) {
        this.nb_erreurs_restantes = nb_erreurs_restantes;
    }

    public ArrayList<String> getLettres_proposées() {
        return lettres_proposées;
    }

    public void setLettres_proposées(ArrayList<String> lettres_proposés) {
        this.lettres_proposées = lettres_proposés;
    }
    
    
    public void afficheLettresProposées() {
        int n=getLettres_proposées().size();
        for (int i=0; i<n;i++){
            System.out.println(getLettres_proposées().get(i)+", ");
        }
    }
    
    public void afficheTours(){
        if (etat==0){
            System.out.println("Nombre d'erreurs restantes : "+getNb_erreurs_restantes());
        } else {
            if (etat==1){
                System.out.println("Partie gagnée.");
            } else {
                 if (etat==1){
                System.out.println("Partie perdue.");
            }
            }
        }
        
    }
    
}
