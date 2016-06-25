/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author KhadDev
 */
public class Depense {

    private Participant payeur;
    private LocalDate dateDepense;
    private Double montant;
    private String Description;
    private List<Participant> lesBeneficiaires;

    public Depense(Participant payeur, LocalDate dateDepense, Double montant, String Description, List<Participant> lesBeneficiaires) {
        this.payeur = payeur;
        this.dateDepense = LocalDate.now();
        this.montant = montant;
        this.Description = Description;
        this.lesBeneficiaires = lesBeneficiaires;
    }

//<editor-fold defaultstate="collapsed" desc="Accesseurs">
    /**
     * @return the payeur
     */
    public Participant getPayeur() {
        return payeur;
    }

    /**
     * @param payeur the payeur to set
     */
    public void setPayeur(Participant payeur) {
        this.payeur = payeur;
    }

    /**
     * @return the dateDepense
     */
    public LocalDate getDateDepense() {
        return dateDepense;
    }

    /**
     * @param dateDepense the dateDepense to set
     */
    public void setDateDepense(LocalDate dateDepense) {
        this.dateDepense = dateDepense;
    }

    /**
     * @return the montant
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the lesBeneficiaires
     */
    public List<Participant> getLesBeneficiaires() {
        return lesBeneficiaires;
    }

    /**
     * @param lesBeneficiaires the lesBeneficiaires to set
     */
    public void setLesBeneficiaires(List<Participant> lesBeneficiaires) {
        this.lesBeneficiaires = lesBeneficiaires;
    }

//</editor-fold>
}
