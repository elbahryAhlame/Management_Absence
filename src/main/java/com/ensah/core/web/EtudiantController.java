package com.ensah.core.web;
import com.ensah.core.bo.Absence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.Matiere;
import com.ensah.core.bo.dmandeAbsence;
import com.ensah.core.bo.reclamation;
import com.ensah.core.services.IServiceAbsence;
import com.ensah.core.services.IServiceDemande;
import com.ensah.core.services.IServiceEtudiant;

@Controller
public class EtudiantController {
@Autowired
private IServiceEtudiant serviceEtudiant;
@Autowired
private IServiceAbsence serviceAbsence;
@Autowired
private IServiceDemande servicedemande;
    //accueil
    @RequestMapping("/")
    public String accueilEtudiant(Model model) { 
        Etudiant e = serviceEtudiant.getEtudiant(1);
        model.addAttribute("etudiant", e);
        return "accueil"; 
    }
   //modifecation de profile 
    
    @RequestMapping("/modifierProfile")
    public String modifierInfoProfile(Model model) { 
    	 Etudiant e = serviceEtudiant.getEtudiant(1);
         model.addAttribute("etudiant", e);
        System.out.println("page modifier");
        return "modifierProfile"; 
    }
    //enregestrer les modefications de profile 
    
    @RequestMapping("/ValiderProfile")
    public String validerProfile(@ModelAttribute("etudiant") Etudiant etudiant,Model model)
    {
    	Etudiant e = serviceEtudiant.getEtudiant(1);
        model.addAttribute("etudiant", e);
    	serviceEtudiant.enregestrer(etudiant);
    	return "accueil";
    }
    //ajouter une reclamation
    @RequestMapping("/reclamation")
    public String envoyerReclamation(Model model)
    {
    	Etudiant e = serviceEtudiant.getEtudiant(1);
        List<Absence> absences=e.getAbsence();
        model.addAttribute("absences",absences);
    	  return "reclamation";
    }
    //enregstrer reclamation
    @RequestMapping("/envoyerReclamation")
	public String ajouterGroupe(@RequestParam("reclamation") String message, @RequestParam("selectedContacts")  String[] contactsSelectionnes ,Model m)
	{
    	Etudiant e = serviceEtudiant.getEtudiant(1);
        m.addAttribute("etudiant", e);
       List<Absence> absences = new ArrayList<>();
       for (String id : contactsSelectionnes)
       {
    	   Absence abs = serviceAbsence.getAbsence(Long.valueOf(id));
    	  reclamation r= new reclamation();
    	  r.setMessage(message);
    	  r.setAbsence(abs);
    	  r.setReponse("pas de reponse encore traité ");
    	 
    	  abs.setReclamations(r);
    	  serviceAbsence.enregestrerAbsence(abs);
       }
      
	return "accueil";
	}
    //afficher avvertissment
    @RequestMapping("/avertissement")
    public String avertissement(Model model)
    {
    	String avvertissement ="vous avez depassez 3 absence en ces matieres ";
        Etudiant e = serviceEtudiant.getEtudiant(1);
        model.addAttribute("etudiant", e);
        
        System.out.println("Je suis dans accueilE  tudiant");
        //traitement de matiere 
        List<String> matieresDepassees = new ArrayList<>(); // Liste pour stocker les matières dépassant 3 absences
        Map<Matiere, Integer> compteurAbsences = new HashMap<>(); // Dictionnaire pour stocker le nombre d'absences pour chaque matière

        List<Absence> absences = e.getAbsence(); // Récupérer la liste des absences de l'étudiant

        for (Absence absence : absences) {
            Matiere matiere = absence.getMatiere(); // Récupérer la matière associée à l'absence
            System.out.println(matiere.getNom());
            // Vérifier si la matière existe déjà dans le dictionnaire
            if (compteurAbsences.containsKey(matiere)) {
                int nombreAbsences = compteurAbsences.get(matiere);
                compteurAbsences.put(matiere, nombreAbsences + 1);
            } 
            else 
            {
                compteurAbsences.put(matiere, 1);
            }
        }
        //teste les matiere qui depasse 3 absence 
        for (Map.Entry<Matiere, Integer> entry : compteurAbsences.entrySet()) {
            if (entry.getValue() > 2) {
             Matiere matiere =entry.getKey();
             avvertissement = avvertissement +"  "+matiere.getNom();
             model.addAttribute("infoMsg",avvertissement);
            
            }
        }
    	return "avertissement";
    }
    //consultation de reclamation
    @RequestMapping("/consulterReclamation")
    public String consulterReclamation(Model model)
    {
    	Etudiant e = serviceEtudiant.getEtudiant(1);
        List<Absence> absences=e.getAbsence();
        model.addAttribute("absences",absences);
    	  return "consulterReclamation";
    }
    //ajouter demandes
    @RequestMapping("/demandes")
    public String demande(Model model)
    {
    dmandeAbsence demande =new dmandeAbsence();
    model.addAttribute("demande",demande);
    
    return "demandes";
    }
    
    //enregestrer demande
    @RequestMapping("/envoyerDemande")
    public String envoyerDemande(@ModelAttribute("demande") dmandeAbsence demande,Model model)
    {
  
    	List<dmandeAbsence> demandes;
    	Etudiant e = serviceEtudiant.getEtudiant(1);
    	demandes=e.getDemandes();
    	System.out.println(demandes);
    	if(demandes == null)
    		demandes= new ArrayList<>();
    	demandes.add(demande);
    	 demande.setEtudiant(e); // Ajouter cette ligne pour définir l'objet Etudiant dans la demande
    	    e.setDemandes(demandes);
    	serviceEtudiant.enregestrer(e);
        model.addAttribute("etudiant", e);
    	return "accueil";
    }
    
    
  // consulter demande  
    @RequestMapping("/consulterDemandes")
    public String consulterDemande(Model model)
    {
    dmandeAbsence demande =new dmandeAbsence();
    model.addAttribute("demande",demande);
	List<dmandeAbsence> demandes;
	Etudiant e = serviceEtudiant.getEtudiant(1);
	demandes = e.getDemandes();
	model.addAttribute("demandes",demandes);
    return "consulterDemandes";
    }
}
