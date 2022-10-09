package abtractDemo;

public class CustomerManager {

	private BaseDataBaseManager dataBaseManager;

	public CustomerManager(BaseDataBaseManager dataBaseManager) {
		this.dataBaseManager = dataBaseManager;
	}

	public void getCustomers() {
		dataBaseManager.getData();
	}
}
