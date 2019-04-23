package proxibanque.utilisation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Conseiller {

	// ATTRIBUTS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String prenom;

	
	@OneToMany(mappedBy = "conseiller")
	private Set<Client> listeclient = new HashSet<Client>();
	
	
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
	public Set<Client> getListeclient() {
		return listeclient;
	}
	public void setListeclient(Set<Client> listeclient) {
		this.listeclient = listeclient;
	}
	public Conseiller() {
		super();
	}

	
	
	// CONSTRUCTEUR
}