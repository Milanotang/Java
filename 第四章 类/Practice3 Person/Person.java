package 第四章类.Person;

public class Person {
        String name;
        int age;
        int sex;
        /**
        男性是1，女性是0
         */
        public void study(){
            System.out.println("studying");
        }
        public void getAge(){
            System.out.println("age：" + age);
        }
        public int addAge(int i) {//i是个形参，实际上也是一个局部变量，放在堆空间中
            age += i;
            return age;
        }
}
