package webAPP.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
	Long id;
	String Name;
	String Number;
	String Email;
    String Address;

	public BuddyInfo(){};
	
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

	public BuddyInfo(String name)
	{
		Name = name;
	}
	
	public void setAll(String name, String number, String email, String address)
	{
		setName(name);
		setNumber(number);
		setEmail(email);
		setAddress(address);
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
