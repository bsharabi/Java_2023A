package L04;

 interface B {

        }
public class UML {
}
    class Person implements B {
        private String name;
        private String lastName;
        private String id;
        private double age;
        private A a;
        public Person(String name, String lastName, String id, double age) {
            this.name = name;
            this.lastName = lastName;
            this.id = id;
            this.age = age;
        }

        //-------------------Setter %% Getter---------------------------
        public void setName(String name) {
            this.name = name;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getId() {
            return id;
        }

        public double getAge() {
            return age;
        }

    }

    class Student extends Person {

        private String universityName;

        public Student(String name, String lastName, String id, double age, String universityName) {
            super(name, lastName, id, age);
            this.universityName = universityName;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }
    }

    class Employee extends Person {
        private String workplaceName;
        public String getWorkplaceName() {
            return workplaceName;
        }

        public void setWorkplaceName(String workplaceName) {
            this.workplaceName = workplaceName;
        }

        public Employee(String name, String lastName, String id, double age, String workplaceName) {
            super(name, lastName, id, age);
            this.workplaceName = workplaceName;
        }


    }



class A{

}