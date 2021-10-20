
public class CommissionEmployee extends Employee {
	float grossSales;
	int commision;
	
	CommissionEmployee(String _firstName,	String _lastName, int _id, float _grossSales, int _commision)
	{
		super(_firstName, _lastName, _id);
		if(_grossSales < 0 || _commision < 0 || _commision > 100)
			throw new IllegalArgumentException();
		this.grossSales = _grossSales;
		this.commision = _commision;
	}
	
	CommissionEmployee()
	{
		super();
		this.grossSales = 0;
		this.commision = 0;
	}
	
	void SetGrossSales(float _grossSales) {
		if(_grossSales < 0)
			throw new IllegalArgumentException();
		this.grossSales = _grossSales;
	}
	void SetCommision(int _commision) {
		if(_commision < 0)
			throw new IllegalArgumentException();
		this.commision = _commision;
	}
	
	float GetGrossSales() {
		return this.grossSales;
	}
	int GetCommision() {
		return this.commision;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", grossSales: " + Float.toString(this.grossSales) + ", commision: " + Integer.toString(this.commision);
    }
	
	@Override
	public boolean equals(Object obj){
		if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().isAssignableFrom(this.getClass()))
            return false;
        CommissionEmployee ce = (CommissionEmployee) obj;
        if(this.grossSales == ce.grossSales && this.commision == ce.commision && super.equals(ce))
        	return true;
        return false;
	}
	
	@Override
	float earnings() {
		return ((float)(this.commision)/(float)(100.0))*this.grossSales;
	}

}
