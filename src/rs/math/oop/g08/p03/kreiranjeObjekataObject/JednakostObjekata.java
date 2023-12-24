package rs.math.oop.g08.p03.kreiranjeObjekataObject;

import rs.math.oop.g02.p01a.klaseObjekti.Student;

public class JednakostObjekata {

	public static void main(String[] args) {
		// декларација променљиве без креирања објекта
		Object o1;
		// креирање објекта и подешавање да инстанцна променљива o1 
		// показује на тај новокреирани објекат
		o1 = new Object();
		// испис објекта у текстуалном облику
		System.out.println(o1);
		// ово изнад је еквивалентноследећем
		System.out.println(o1.toString());
		Student s = new Student();
		System.out.println(s);
		if(s.equals(o1))
			System.out.println("jednaki su");
		else
			System.out.println("nisu jednaki");
	}
}
