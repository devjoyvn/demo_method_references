
public class Student {
    private String name;
    private int age;
    private String sex;
    private int score;

    public Student(String name, int age, String sex, int score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public void print() {
        System.out.println(this.name + " " + this.age + " " + this.sex + " " + this.score);
    }

    public static int compareByAge(Student a, Student b) {
        return a.getAge() - b.getAge();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
