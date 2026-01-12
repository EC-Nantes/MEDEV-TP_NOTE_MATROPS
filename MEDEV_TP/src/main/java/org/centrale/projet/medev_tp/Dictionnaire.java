/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *  Un dictionnaire de mots
 * @author Max
 */
public class Dictionnaire {

    private List<String> maListeMot;

    /**
     *
     */
    public Dictionnaire() {
        maListeMot = new ArrayList<>();
    }

    /**
     *
     * @param maListeMot
     */
    public Dictionnaire(List<String> maListeMot) {
        this.maListeMot = maListeMot;
    }

    /**
     *  On considère que dans le fichier texte, les mots sont séparé par un ; 
     * @param path
     */
    public void lireFichier(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {

                StringBuilder mot = new StringBuilder();

                for (char c : line.toLowerCase().toCharArray()) {
                    if (c == ';') {
                        ajouterSiValide(mot.toString());
                        mot.setLength(0);
                    } else {
                        mot.append(c);
                    }
                }

                ajouterSiValide(mot.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ajouterSiValide(String mot) {
        mot = mot.trim();
        Mot tool = new Mot();
        if (!mot.isEmpty() && tool.isMot(mot)) {
            this.maListeMot.add(mot);
        }
    }

    /**
     *
     * @return
     */
    public List<String> getMaListeMot() {
        return maListeMot;
    }

    /**
     *
     * @param maListeMot
     */
    public void setMaListeMot(List<String> maListeMot) {
        this.maListeMot = maListeMot;
    }

}
