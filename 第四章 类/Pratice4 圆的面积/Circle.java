package 第四章类.Practice4;

public class Circle {
    /*这种形式不够专业，半径应当作为一个属性出现更好
    public double area(int radium){
        double s = Math.PI * radium * radium;
        return s;
    }*/

    double radium;
    double s;
    public void findarea(){
        s = Math.PI * radium * radium;
        System.out.println(s);
    }
}
