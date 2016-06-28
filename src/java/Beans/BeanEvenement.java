/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.Participant;

/**
 *
 * @author KhadDev
 */
@ManagedBean
@SessionScoped
public class BeanEvenement {

    private String _intitule;
    private LocalDate _dateDebut;
    private LocalDate _dateFin;
    private List<Participant> _lesParticipants;

//<editor-fold defaultstate="collapsed" desc="Constructeurs">
    public BeanEvenement() {

        this._intitule = "Mes vacances";
        this._dateDebut = LocalDate.now();
        this._dateFin = LocalDate.now();

        this._lesParticipants = new ArrayList<>();
        
         _lesParticipants.add(genereParticipant());
         _lesParticipants.add(genereParticipant());
         _lesParticipants.add(genereParticipant());
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Accesseurs">
    public String getIntitule() {
        return _intitule;
    }

    public void setIntitule(String intitule) {
        this._intitule = intitule;
    }

    public LocalDate getDateDebut() {
        return _dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this._dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return _dateFin;
    }
    
    public void setDateFin(LocalDate dateFin) {
        this._dateFin = dateFin;
    }
    
    /**
     * @return the _lesParticipants
     */
    public List<Participant> getLesParticipants() {
        return _lesParticipants;
    }

    /**
     * @param _lesParticipants the _lesParticipants to set
     */
    public void setLesParticipants(List<Participant> _lesParticipants) {
        this._lesParticipants = _lesParticipants;
    }
    

//</editor-fold>

    /**
     * Genere un participant 
     * @return nouveau Participant
     */
    private Participant genereParticipant() {

        int compteurParticipant = getLesParticipants().size();
        
        Participant newParticipant = new Participant();
        newParticipant.setNom(String.format("%s %d",newParticipant.getNom(),++compteurParticipant));
        
        return newParticipant;    
    }
}
