package org.bai.eleve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Eleve implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String anneeScolaire;
	private String nom;
	private String prenom;	
	private String classe;
	private Long numInscription;
	private Long numDossier;
	private Long numBoite;
	private String motifSortie;	
	private String Observation;
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eleve(String anneeScolaire, String nom, String prenom, String classe, Long numInscription, Long numDossier,
			Long numBoite, String motifSortie, String observation) {
		super();
		this.anneeScolaire = anneeScolaire;
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
		this.numInscription = numInscription;
		this.numDossier = numDossier;
		this.numBoite = numBoite;
		this.motifSortie = motifSortie;
		Observation = observation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Long getNumInscription() {
		return numInscription;
	}
	public void setNumInscription(Long numInscription) {
		this.numInscription = numInscription;
	}
	public Long getNumDossier() {
		return numDossier;
	}
	public void setNumDossier(Long numDossier) {
		this.numDossier = numDossier;
	}
	public Long getNumBoite() {
		return numBoite;
	}
	public void setNumBoite(Long numBoite) {
		this.numBoite = numBoite;
	}
	public String getMotifSortie() {
		return motifSortie;
	}
	public void setMotifSortie(String motifSortie) {
		this.motifSortie = motifSortie;
	}
	public String getObservation() {
		return Observation;
	}
	public void setObservation(String observation) {
		Observation = observation;
	}
	@Override
	public String toString() {
		return "Eleve [id=" + id + ", anneeScolaire=" + anneeScolaire + ", nom=" + nom + ", prenom=" + prenom
				+ ", classe=" + classe + ", numInscription=" + numInscription + ", numDossier=" + numDossier
				+ ", numBoite=" + numBoite + ", motifSortie=" + motifSortie + ", Observation=" + Observation + "]";
	}
	
	

}
