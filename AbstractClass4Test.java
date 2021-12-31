

abstract class Plan {
    double rate;
	
	public abstract void fixedRate();
	
	public void computeMyBill(int noUnits) {
		System.out.println("No.of Units Consumed : "+noUnits);
		System.out.println("Rate per Unit : Rs. "+rate+" /-");
		System.out.println("Outstanding Amount : Rs. "+this.rate * noUnits+" /-");
	}	
	
}

class DeomesticPlan extends Plan{
	
	public void fixedRate() {
		
	   rate = 8.0;	
	   
	}
}

class CommercialPlan extends Plan {
	
	public void fixedRate() {
		rate = 10.0;
	}
	
}

class InstitutionalPlan extends Plan {
	
	public void fixedRate() {
		rate = 5.0;
	}
	
}



class PlanMaker {
	
	public Plan acceptMyPlan(String planName) {
		
		
		if("Domestic".equals(planName)) {
			DeomesticPlan domesticPlan = new DeomesticPlan();
			return domesticPlan;
			
		}else if("Commercial".equals(planName)) {
			
			CommercialPlan commercialPlan = new CommercialPlan();
			return commercialPlan;
		}else if("Institutional".equals(planName)) {
			
			InstitutionalPlan institutionalPlan = new InstitutionalPlan();
			return institutionalPlan;
		}
		
		return null;
	}
}



public class AbstractClass4Test {
	
	public static void main(String[] args) {
		
		PlanMaker planMaker = new PlanMaker();
		
		Plan domestic = planMaker.acceptMyPlan("Domestic");		
		domestic.fixedRate();		
		domestic.computeMyBill(45);
		
		
		Plan commercial = planMaker.acceptMyPlan("Commercial");
		commercial.fixedRate();
		commercial.computeMyBill(100);
		
		
		Plan institutional = planMaker.acceptMyPlan("Institutional");
		institutional.fixedRate();
		institutional.computeMyBill(25);
		
						
	}
	
}