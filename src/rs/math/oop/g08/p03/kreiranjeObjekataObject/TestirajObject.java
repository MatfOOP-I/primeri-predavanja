package rs.math.oop.g08.p03.kreiranjeObjekataObject;

public class TestirajObject {

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
	}
}
