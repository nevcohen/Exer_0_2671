
public class BasePlusCommissionEmployee extends CommissionEmployee {
	float baseSalary;
	
	BasePlusCommissionEmployee(String _firstName,	String _lastName, int _id, float _grossSales, int _commision, float _baseSalary)
	{
		super(_firstName, _lastName, _id, _grossSales, _commision);
		if(_baseSalary < 0)
			throw new IllegalArgumentException();
		this.baseSalary = _baseSalary;
	}
	
	BasePlusCommissionEmployee()
	{
		super();
		this.baseSalary = 0;
	}
	
	void SetBaseSalary(float _baseSalary) {
		if(_baseSalary < 0)
			throw new IllegalArgumentException();
		this.baseSalary = _baseSalary;
	}
	
	float GetBaseSalary() {
		return this.baseSalary;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", baseSalary: " + Float.toString(this.baseSalary);
    }
	
	@Override
	public boolean equals(Object obj){
		if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().isAssignableFrom(this.getClass()))
            return false;
        BasePlusCommissionEmployee bpc = (BasePlusCommissionEmployee) obj;
        if(this.baseSalary == bpc.baseSalary && super.equals(bpc))
        	return true;
        return false;
	}
	
	@Override
	float earnings() {
		return this.baseSalary + super.earnings();
	}

}

