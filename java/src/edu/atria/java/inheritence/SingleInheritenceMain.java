package edu.atria.java.inheritence;

public class SingleInheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Employee eOne = new Employee(2117376, 3475376, "Indian", 156, "alex", "Front End developer", 40000.00);
				System.out.println(eOne);
				
				Citizen eTwo = new Employee(76487245,3765748,"Indian", 78, "sony", "Software tester", 50000.00);
				System.out.println(eTwo);
				
				Citizen cOne  = new Student(26546,8866,"Indian", 23,"mony","cse","sneha");
				System.out.println(cOne);
				
				Citizen cTwo  = new MP(265456,88566,"Indian", 25,"bony","ABC");
				System.out.println(cTwo);


	}

}
