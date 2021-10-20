
public class Payroll {

	public static void main(String[] args) {
		Employee[] allEmployees;
		allEmployees = new Employee[3];
		
		boolean flag = true;
		try {
			allEmployees[0] = new HourlyEmployee("Abraham", "Avino", 11111, 46, 35);
			allEmployees[1] = new CommissionEmployee("Itzhak", "Avino", 22222, 1200, 45);
			allEmployees[2] = new BasePlusCommissionEmployee("Jacob", "Avino", 33333, 1600, 10, 700);
		} catch (IllegalArgumentException e) {
			flag = false;
		}
		
		if(flag)
			for (int i = 0; i<allEmployees.length; i++) {
				if(allEmployees[i] instanceof BasePlusCommissionEmployee)
					((BasePlusCommissionEmployee) allEmployees[i]).SetBaseSalary((float)(((BasePlusCommissionEmployee) allEmployees[i]).GetBaseSalary()*1.10));
				System.out.println(allEmployees[i] + ". Earns per week: " + Float.toString(allEmployees[i].earnings()) + " NIS.");
			}
		else 
			System.out.println("Data error");
	}

}
