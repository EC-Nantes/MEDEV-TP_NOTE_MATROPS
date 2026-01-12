/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.util.LinkedList;

/**
 *
 * @author selli
 */
public class Partie {
    private int mode; // 0 pour mode 1 joueur, 1 pour mode 2 joueurs
    private int etat; // 0 pour en cours, 1 pour gagnée, 2 pour perdue
    private int nb_rounds; // Nombre de rounds maximal
    private int nb_erreurs_restantes; 
    private LinkedList<String> lettres_proposés;
    
}
