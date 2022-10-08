package youTubeProject;

public class Main {

	public static void main(String[] args) {

		/*
		 * CrediManager crediManager = new CrediManager(); crediManager.calculate();
		 * crediManager.save();
		 * 
		 * Customer customer = new Customer(); customer.setId(1);
		 * customer.setCity("Ankara");
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save();
		 * 
		 * Company company = new Company(); company.setCompanyName("100000");
		 * company.setCompanyName("Arçeli"); company.setId(100);
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(company);
		 * 
		 * Person person = new Person(); person.setFirstName("Engin");
		 * 
		 * Customer c1 = new Customer(); Customer c2 = new Company(); Customer c3 = new
		 * Person();
		 */

		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManger());
		customerManager.giveCredit();
		
	}

}

class CrediManager {
	public void calculate() {
		System.out.println("Hesaplandı");
	}

	public void save() {
		System.out.println("Kredi verildi");
	}
}

interface ICreditManager {
	void calculate();

	void save();
}

abstract class BaseCredimanager implements ICreditManager{
	public abstract void calculate();
	
	public void save() {
		System.out.println("Kaydedildi");

	}
}

class TeacherCreditManager extends BaseCredimanager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");

	}

}

class MilitaryCreditManger extends BaseCredimanager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı");

	}


}

class Customer {
	private int Id;
	private String City;

	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}

class Person extends Customer {
	private String NationalIdentity;
	private String FirstName;
	private String LastName;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
}

class Company extends Customer {
	private String TaxNumber;
	private String CompanyName;

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

}

class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müşteri eklendi:");
	}

	public void delete() {
		System.out.println("Müşteri silindi:");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi hesaplandı");
	}
}
