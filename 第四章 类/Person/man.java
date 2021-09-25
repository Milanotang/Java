package 第四章类.Person;

public class man {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Tom";
        person.age = 22;
        person.sex = 0;
        person.study();
        person.getAge();
        int new_age = person.addAge(2);
        System.out.println(new_age);
    }
}
