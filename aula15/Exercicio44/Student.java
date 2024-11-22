package aula15.Exercicio44;

import java.util.Dictionary;

public class Student implements Person {
    
    private static String name;
    private static int age;

    private static int year;
    private static String course;

    private static Dictionary<String, Dictionary<Integer, String>> schedule;
    
    public Student(String name, int age, int year, String course) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.course = course;
    }



    /**
     * Sets the student's name.
     * 
     * @param name a String representing the student's name.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Sets the student's age.
     * 
     * @param age an int representing the student's age.
     */
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the year the student is in.
     * 
     * @param year an int representing the year the student is in.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the course the student is enrolled in.
     * 
     * @param course a String representing the student's course.
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Sets the student's schedule.
     * 
     * @param schedule a Dictionary where the key is a String representing the day of the week,
     *                 and the value is another Dictionary mapping an Integer (hour) to a String (activity).
     */
    public void setSchedule(Dictionary<String, Dictionary<Integer, String>> schedule) {
        this.schedule = schedule;
    }

    /**
     * Retrieves the student's name.
     * 
     * @return a String representing the student's name.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Retrieves the student's age.
     * 
     * @return an int representing the student's age.
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the year the student is currently in.
     * 
     * @return an int representing the year the student is in.
     */
    public int getYear() {
        return year;
    }

    /**
     * Retrieves the course the student is enrolled in.
     * 
     * @return a String representing the student's course.
     */
    public String getCourse() {
        return course;
    }

    /**
     * Retrieves the student's schedule.
     * 
     * @return a Dictionary where the key is a String representing the day of the week,
     *         and the value is another Dictionary mapping an Integer (hour) to a String (activity).
     */
    public Dictionary<String, Dictionary<Integer, String>> getSchedule() {
        return schedule;
    }
}
