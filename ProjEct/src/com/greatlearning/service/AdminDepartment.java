package com.greatlearning.main;

//AdminDepartment aims to extend SuperDepartment

public class AdminDepartment extends SuperDepartment()   {
	
	public AdminDepartment (String p, String q, String r, String s)     {
		
		super(p,q,r,s);
		
	}
	
	 public String departmentName()  {
	    	System.out.println("Admin Department");
	    	return departmentName;
	    }
	    
	    public String getTodaysWork()  {
	    	System.out.println("Complete your documents Submission");
	    	return getTodaysWork;
	    }
	    
	    public String getWorkDeadline()  {
	    	System.out.println("Complete by EOD");
	    	return getWorkDeadline;
	    }
}