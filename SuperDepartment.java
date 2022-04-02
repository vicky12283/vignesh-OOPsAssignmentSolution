
 class SuperDepartment {
	public String departmentName() {
		return "Super department";
	}
	
	public String getTodaysWork () {
		return "No work as of now";
	}
	
	public String getWorkDeadline() {
		return "Nil";
	}
	
	public String isTodayAHoliday(){
		return "Today is not a holiday";
	}

}

 class AdminDepartment extends SuperDepartment{
	 public String departmentName() {
		 return "Admin Department";
	 }
	 
	 public String getTodaysWork () {
		 return "Complete your document submission";
	 }
	 
	 public String getWorkDeadlin() {
		 return "Complete by EOD";
	 }

}
 
 class HrDepartment extends SuperDepartment{
	 public String departmentName() {
		 return "Hr Department";
	 }
	 
	 public String getTodaysWork() {
		 return "Fill today's worksheet and mark your attendance";
	 }
	 
	 public String getWorkDeadline() {
		 return "Complete by EOD";
	 }
	 
	 public String doActivity() {
		 return "Team lunch";
	 }

	 
 }
 
 class TechDepartment extends SuperDepartment{
	 public String departmentName() {
		 return "Tech Department";
		 }
	 
	 public String getTodaysWork() {
		 return "Complete coding of module 1";
		 }
	 
	 public String getWorkDeadline() {
		 return "Complete by EOD";
		 }
	 
	 public String getTechStackInformation() {
		 return "Core java";
		 }
 }
 
 class assigment1{
	 public static void main(String args[]) {
		 AdminDepartment obj1 = new AdminDepartment();
		 HrDepartment obj2 = new HrDepartment();
		 TechDepartment obj3 = new TechDepartment();
		 
		 System.out.println(obj1.departmentName());
		 System.out.println(obj1.getTodaysWork());
		 System.out.println(obj1.getWorkDeadlin());
		 System.out.println(obj1.isTodayAHoliday());
		 
		 System.out.println(" ");
		 
		 System.out.println(obj2.departmentName());
		 System.out.println(obj2.getTodaysWork());
		 System.out.println(obj2.getWorkDeadline());
		 System.out.println(obj2.doActivity());
		 System.out.println(obj2.isTodayAHoliday());
		 
		 System.out.println(" ");
		 
		 System.out.println(obj3.departmentName());
		 System.out.println(obj3.getTodaysWork());
		 System.out.println(obj3.getWorkDeadline());
		 System.out.println(obj3.getTechStackInformation());
		 System.out.println(obj3.isTodayAHoliday());
		 

		 
		 
		 
	 }
 }
