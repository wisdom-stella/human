package singleton;

public class StudentEx {
	public static void main(String[] args) {
		//접근 제어자 =>  public protected () private
		
//		Student student = new Student();
//		System.out.println(student);
		
		// Factory pattern >prototype
		Student student2 = Student.getInstance();
		Student student3 = Student.getInstance();
		
		System.out.println(student2);
		System.out.println(student3);
		
		// Factory > singleton (인스턴스 취득 방법 中 1)
		Student student4 = Student.getInstance2();
		Student student5 = Student.getInstance2();
		
		System.out.println(student4);
		System.out.println(student5);
	}
	
}
