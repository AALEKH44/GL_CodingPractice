package com.greatlearning.main;

public class Main {
	
	public static void main(String[] args) {
		
		AdminDepartment ad=new AdminDepartment();
		//creating object for admin department
		
		       System.out.println("Welcome to"+ad.departmentName);
		       //printing results for all methods
		
		       System.out.println("ad.getTodaysWork");
				
		       System.out.println("ad.getWorkDeadline");
				
		       System.out.println("ad.isTodayAHoliday");
				
				
	    HrDepartment hr=new HrDepartment();
				//creating object for Hr department
				
				System.out.println("Welcome to"+hr.departmentName);
				//printing results for all methods
				
				System.out.println("hr.doActivity");
						
				System.out.println("hr.getWorkDeadline");
						
				System.out.println("hr.getTodaysWork");
						
				System.out.println("ad.isTodayAHoliday");		
						
						
						
						
		 TechDepartment td=new TechDepartment();
						//creating object for Tech department
						
		        System.out.println("Welcome to"+hr.departmentName);
			    //printing results for all methods
			
			    System.out.println("hr.getTechStackInformation");
					
			    System.out.println("hr.getWorkDeadline");
					
			    System.out.println("hr.getTodaysWork");
					
			    System.out.println("ad.isTodayAHoliday");			
				
		}
}		