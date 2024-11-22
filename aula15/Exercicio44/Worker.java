package aula15.Exercicio44;

public abstract class Worker implements Person {
    
    private static String name;
    private static int age;

    private static double salary;

    public Worker(String name, int age, double salary) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getSalary(){
        return salary;
    };

}
