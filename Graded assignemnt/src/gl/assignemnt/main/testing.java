package gl.assignemnt.main;
import gl.Departments.superDepartment;



import gl.Departments.*;

public class testing {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to";		
		
		hrDepartment hr= new hrDepartment();
		adminDepartment ad= new adminDepartment();
		techDepartment te=new techDepartment();
		
		
		
		
				
		System.out.println(s1 + " "+ ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println( ad.isTodayAHoliday());
		System.out.println();
		
		System.out.println(s1 + " "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println(s1 + " "+ te.departmentName());
		
		System.out.println(te.getTodaysWork());
		System.out.println(te.getWorkDeadline());
		System.out.println(te.getTechStackInformation());
		System.out.println(te.isTodayAHoliday());
		
		
		
		
		
	
		
		
	}

}
