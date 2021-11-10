package HighSchool;

public class Person {
    protected String name;
    protected GENDER gender;

    public enum GENDER {male, female};

    protected String faculty;


    public void print() {
        System.out.print("This is " + name+". ");
        System.out.print((this.gender == GENDER.male) ? "He " : "She ");
        if(this instanceof Student)
        {
            System.out.print("studies");
        }
        else if(this instanceof Professor)
        {
            System.out.print("teaches");
        }
        System.out.print(" at " + this.faculty+".");
    }

    public static void printAll(Person[] persons)
    {
        if(persons!=null)
        for(Person person: persons)
        {
            if(person!=null)
            {
                person.print();
            }
        }
    }


    public static void main(String[] args) {
        Person persons[] =new Person[6];
        persons[0]=new Professor("Ronald Turner", GENDER.male, Professor.DEGREE.PhD, "Computer Science", "Programming paradigms");
        persons[1]=new Professor("Ruth Hollings", GENDER.female, Professor.DEGREE.MSc, "Jurisprudence", "Domestic Arbitration");
        persons[2]=new Student("Leo Vilkinson", Student.STEP.Bachelor, GENDER.male, 3, "Computer science");
        persons[3]=new Student("Anna Cunningham", Student.STEP.Bachelor, GENDER.female, 1, "World Economy");
        persons[4]=new Student("Jill Lindquist", Student.STEP.Master, GENDER.female, 1, "Jurisprudence");
        persons[5]=new Student("Ronald Correa", Student.STEP.Aspirant, GENDER.male, "Design of a functional programming language", "Computer Science");
        Person.printAll(persons);
    }
}