package com.greatlearning.main;

//TechDepartment aims to extend SuperDepartment


public class TechDepartment extends SuperDepartment()   {
	

	public String getStackInformation;
	
	public TechDepartment (String p, String q, String r, String s)     {
		
		super(p,q,r,s);
		
		
	}
	
	 public String departmentName()  {
	    	System.out.println("Tech Department");
	    	return departmentName;
	    }
	    
	    public String getTodaysWork()  {
	    	System.out.println("Complete coding of module 1");
	    	return getTodaysWork;
	    }
	    
	    public String getWorkDeadline()  {
	    	System.out.println("Complete by EOD");
	    	return getWorkDeadline;
	    }
	    
	    public String getStackInformation()  {
	    	System.out.println("Core Java");
	    	return getWorkDeadline;
}