/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KhadDev
 */
public class Participant {

    private String nom;
//    private int nbParts;
    private List<Depense> mesDepenses;

    public Participant() {
        this.nom = "Participant ";
        this.mesDepenses = new ArrayList<>();
    }

    //<editor-fold defaultstate="collapsed" desc="Accesseurs">
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

//    /**
//     * @return the nbParts
//     */
//    public int getNbParts() {
//        return nbParts;
//    }
//
//    /**
//     * @param nbParts the nbParts to set
//     */
//    public void setNbParts(int nbParts) {
//        this.nbParts = nbParts;
//    }

    /**
     * @return the mesDepenses
     */
    public List<Depense> getMesDepenses() {
        return mesDepenses;
    }

    /**
     * @param mesDepenses the mesDepenses to set
     */
    public void setMesDepenses(List<Depense> mesDepenses) {
        this.mesDepenses = mesDepenses;
    }
//</editor-fold>
    
    public void creerDepense()
    {
        
        
    }
    
    public double getTotalMesDepenses()
    {
        double total = 0;
        
        for (Depense uneDepense : mesDepenses) {
            
            total += uneDepense.getMontant();
        }
        
        
        return total;
    }
}
