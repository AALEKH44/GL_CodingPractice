package com.greatlearning.main;

//Other 3 classes must extend the Super Class

public class SuperDepartment() {
	
	public string departmentName ;
	public string getTodaysWork;
	public string isTodayAHoliday;
	public string getWorkDeadline;
	
	public SuperDepartment (String p, String q, String r, String s) {
		departmentName=p;
		getTodaysWork=q;
		isTodayAHoliday=r;
		getWorkDeadline=s;
		
	}
    public String departmentName()  {
    	System.out.println("Super Department");
    	return departmentName;
    }
    
    public String getTodaysWork()  {
    	System.out.println("No work as of now");
    	return getTodaysWork;
    }
    
    public String getWorkDeadline()  {
    	System.out.println("Nil");
    	return getWorkDeadline;
    }
    
    public String isTodayAHoliday()  {
    	System.out.println("Today is not a holiday");
    	return isTodayAHoliday;
    }

}


