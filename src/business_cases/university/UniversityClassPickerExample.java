package business_cases.university;


public class UniversityClassPickerExample {

    public void universityPickerExample(){

        // Subjects Catalogue Page
        Subject appliedMathematics = new Subject(122, "Applied Mathematics", 150);
        Subject linearAlgebra = new Subject(123, "linear Algebra", 150);
        Subject kineticMechanics = new Subject(124, "kinetic Mechanics", 150);
        Subject dynamicsMovers = new Subject(125, "Dynamics Movers", 150);

        Student sid = new Student("2011-Mechanical-183", "Sid", Department.MECHANICAL);
        Student csStudent = new Student("2011-CS-100", "CS Student", Department.COMPUTER_SCIENCE);

        sid.setSubjects(appliedMathematics, linearAlgebra, kineticMechanics, dynamicsMovers);
        csStudent.setSubjects(appliedMathematics,linearAlgebra,kineticMechanics );

        System.out.println(sid);
        System.out.println(csStudent);
        Subject sb = sid.addMarks(149, 0);
        System.out.println("Marks added into Subject:" + sb);
        sid.addMarks(149, 1);
        sid.addMarks(149, 2);
        sid.addMarks(149, 3);
        
        System.out.println(sid);
        System.out.println(csStudent);

    }
}
