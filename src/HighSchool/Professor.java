package HighSchool;

public class Professor extends Person
{
    private DEGREE degree;
    private String speciality;

    public enum DEGREE {DSc, CSc, MSc, PhD}
    public Professor(String newName, GENDER newGender, DEGREE newDegree, String newFaculty, String newSpeciality)
    {
        this.name=newName;
        this.gender=newGender;
        this.degree=newDegree;
        this.speciality=newSpeciality;
        this.faculty=newFaculty;
    }

    public void print()
    {
        super.print();
        System.out.print((this.gender == GENDER.male) ? " He " : " She ");
        System.out.print("has ");
        switch(this.degree)
        {
            case DSc:
                System.out.print("Doctor of Sciences ");
                break;
            case CSc:
                System.out.print("Candidate of Sciences ");
                break;
            case MSc:
                System.out.print("Master of Sciences ");
                break;
            case PhD:
                System.out.print("Philosophy Doctor ");
        }
        System.out.println("degree in "+speciality+".");
    }
}

