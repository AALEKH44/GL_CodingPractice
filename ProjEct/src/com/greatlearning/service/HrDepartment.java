package com.greatlearning.main;

//HrDepartments aims at extending SuperDepartment

public class HrDepartment extends SuperDepartment()   {
	
	
	public String doActivity;
	
	public HrDepartment (String p, String q, String r, String s)     {
		
		super(p,q,r,s);
		
	}
	
	 public String departmentName()  {
	    	System.out.println("HR Department");
	    	return departmentName;
	    }
	    
	    public String getTodaysWork()  {
	    	System.out.println("Fill today’s worksheet and mark your attendance");
	    	return getTodaysWork;
	    }
	    
	    public String getWorkDeadline()  {
	    	System.out.println("Complete by EOD");
	    	return getWorkDeadline;
	    }
	    
	    public String doActivity()  {
	    	System.out.println("team lunch");
	    	return getWorkDeadline;
}