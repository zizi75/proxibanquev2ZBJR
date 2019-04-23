package proxibanque.utilisation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {

	// ATTRIBUTS
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String prenom;
	private String ville;
	private int codePostal;
	private String telephone;
	private String adresse;
	
	
	
	@ManyToOne//(cascade = {CascadeType.PERSIST})//
	@JoinColumn(name="Conseiller_id", unique=true)
	private Conseiller conseiller;
	
	@OneToMany(mappedBy = "Client")
	private Set<Compte> listecompte = new HashSet<Compte>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public Set<Compte> getListecompte() {
		return listecompte;
	}
	public void setListecompte(Set<Compte> listecompte) {
		this.listecompte = listecompte;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", prenom=" + prenom + ", ville=" + ville + ", codePostal="
				+ codePostal + ", telephone=" + telephone + ", adresse=" + adresse + ", conseiller=" + conseiller
				+ ", listecompte=" + listecompte + "]";
	}
	public Client() {
		super();
	}
	
	
	
	


}
