
public abstract class Employee {
	String firstName;
	String lastName;
	int id;
	
	Employee() {
		this.firstName = "plony";
		this.lastName = "almony";
		this.id = 0;
	}
	
	Employee(String _firstName,	String _lastName, int _id) {
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.id = _id;
	}
	
	void SetFirstName(String _firstName) {
		this.firstName = _firstName;
	}
	void SetLastName(String _lastName) {
		this.lastName = _lastName;
	}
	void SetId(int _id) {
		this.id = _id;
	}
	
	String GetFirstName() {
		return this.firstName;
	}
	String GetLastName() {
		return this.lastName;
	}
	int GetId() {
		return this.id;
	}
	
	@Override
    public String toString() {
        return "firstName: " + this.firstName + ", lastName: " + this.lastName + ", id: " + Integer.toString(this.id);
    }
	
	@Override
	public boolean equals(Object obj){
		if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().isAssignableFrom(this.getClass()))
            return false;
        Employee emp = (Employee) obj;
        if(this.firstName == emp.firstName && this.lastName == emp.lastName && this.id == emp.id)
        	return true;
        return false;
	}
	
	abstract float earnings();
}
