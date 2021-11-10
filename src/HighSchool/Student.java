package HighSchool;

public class Student extends Person
{
    private STEP step;
    private int course;
    private String disTheme;

    public enum STEP {Bachelor, Magister, Aspirant, Master}

    public Student(String newName, STEP newStep, GENDER newGender, int newCourse, String newFaculty)
    {
        this.name=newName;
        this.gender=newGender;
        this.step=newStep;
        this.course=newCourse;
        this.faculty=newFaculty;
    }

    public Student(String newName, STEP newStep, GENDER newGender, String newDisTheme, String newFaculty)
    {
        this.name=newName;
        this.gender=newGender;
        this.step=newStep;
        this.disTheme=newDisTheme;
        this.faculty=newFaculty;
    }

    public void print()
    {
        super.print();
        if(this.step==STEP.Magister || this.step==STEP.Bachelor || this.step==STEP.Master)
        {
            System.out.print((this.gender == GENDER.male) ? " He " : " She ");
            System.out.println("is "+this.course+"\'th year "+this.step+" student.");
        }
        else if(this.step==STEP.Aspirant)
        {
            System.out.print((this.gender == GENDER.male) ? " His " : " Her ");
            System.out.println("thesis title is \""+this.disTheme+"\".");
        }
    }

}

