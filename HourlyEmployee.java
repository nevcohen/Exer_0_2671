
public class HourlyEmployee extends Employee {
	int hours;
	float wage;
	
	HourlyEmployee(String _firstName,	String _lastName, int _id, int _hours, float _wage)
	{
		super(_firstName, _lastName, _id);
		if(_hours < 0 || _wage < 0)
			throw new IllegalArgumentException();
		this.hours = _hours;
		this.wage = _wage;
	}
	
	HourlyEmployee()
	{
		super();
		this.hours = 0;
		this.wage = 0;
	}
	
	void SetHours(int _hours) {
		if(_hours < 0)
			throw new IllegalArgumentException();
		this.hours = _hours;
	}
	void SetWage(float _wage) {
		if(_wage < 0)
			throw new IllegalArgumentException();
		this.wage = _wage;
	}
	
	int GetHours() {
		return this.hours;
	}
	float GetWage() {
		return this.wage;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", hours: " + Integer.toString(this.hours) + ", wage: " + Float.toString(this.wage);
    }
	
	@Override
	public boolean equals(Object obj){
		if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().isAssignableFrom(this.getClass()))
            return false;
        HourlyEmployee he = (HourlyEmployee) obj;
        if(this.hours == he.hours && this.wage == he.wage && super.equals(he))
        	return true;
        return false;
	}
	
	@Override
	float earnings() {
		return this.hours*this.wage;
	}

}
