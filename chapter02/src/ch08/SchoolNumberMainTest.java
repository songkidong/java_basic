package ch08;

public class SchoolNumberMainTest {

	public static void main(String[] args) {

		SchoolNumber schoolNumberSong = new SchoolNumber("송");
		SchoolNumber schoolNumberSin = new SchoolNumber("신");
		SchoolNumber schoolNumberKim = new SchoolNumber("김");
		SchoolNumber schoolNumberLee = new SchoolNumber("이");
		SchoolNumber schoolNumberPark = new SchoolNumber("박");
		schoolNumberSong.PrintSchoolNumber();
		schoolNumberSin.PrintSchoolNumber();
		schoolNumberKim.PrintSchoolNumber();
		schoolNumberLee.PrintSchoolNumber();
		schoolNumberPark.PrintSchoolNumber();

	} // end of main

} // end of class
