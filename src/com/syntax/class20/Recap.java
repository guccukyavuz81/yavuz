 package com.syntax.class20;

 class Employee{
	 static String company;
	 int empNumber;
	 double salary;
	 
	 void getPaid() {
		 System.out.println("Employee "+empNumber+" "+salary);
	 }
	 static void work() {
		 System.out.println("Employee "+company);
	 }
 }
 class ScrumTeam extends Employee{
	 String ceremonies;
	 void attendMeetings() {
		 System.out.println("ST attends "+ ceremonies);
	 }
 }
 class ProductOwner extends ScrumTeam{
	 void priorotizeBacklog(){
		 System.out.println("po is a part of "+company);
	 }
 }
 class ScrumMaster extends ScrumTeam{
	 void navigateTeam(){	
		 System.out.println("SM gets "+salary);
	 }
 }
 class Developer extends ScrumTeam{
	 void coding(){
		 System.out.println("dev attends "+ceremonies);
	 }
 }
 class Tester extends ScrumTeam{
	 void test(){	 
	 }
 }
 class BusinessAnalyst extends ScrumTeam{
	 void workwithRequirements(){	 
	 }
 }
public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		ScrumTeam st=new ScrumTeam();
		ProductOwner po=new ProductOwner();
		ScrumMaster sm=new ScrumMaster();
		Developer d=new Developer();
		Tester t=new Tester();
		BusinessAnalyst ba=new BusinessAnalyst();
		Employee.company="Syntax";
		ba.empNumber=101;
		ba.salary=75000;
		ba.getPaid();
		ba.work();
		t.ceremonies="dailyscrum";
		e.empNumber=102;
		e.salary=55000;
		System.out.println(e.company);
		po.priorotizeBacklog();
		sm.salary=120000;
		sm.navigateTeam();
		d.ceremonies="retro";
		d.coding();
	}

}
