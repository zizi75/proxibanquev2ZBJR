package proxibanque.utilisation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Compte {

	// ATTRIBUTS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private double solde;
	private String dateOuverture;
	private String ncompte;
	
	@ManyToOne
	@JoinColumn(name = "client_id", unique = true)
	private Client Client;
	
	
	
	//getters and setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNcompte() {
		return ncompte;
	}
	public void setNcompte(String ncompte) {
		this.ncompte = ncompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public Client getClient() {
		return Client;
	}
	public void setClient(Client Client) {
		this.Client = Client;
	}
	
	
	@Override
	public String toString() {
		return "Compte [id=" + id + ", ncompte=" + ncompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ "]";
	}
	
	// CONSTRUCTOR
	
	public Compte() {
		super();
	}


	

	
	
}