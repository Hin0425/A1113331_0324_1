import java.util.*;

class Animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("Name\theight\tweight\tspeed");
        System.out.println(name+"\t\t"+height+"\t\t"+weight+"\t\t"+speed);
    }

    double distance(double x, double y){
        return x*y*speed;
    }

    double distance(double x){
        return x*speed;
    }
}


public class A1113331_0324_1 {
    public static void main(String [] args){
        Animal animal1, animal2, animal3, animal4;

        animal1= new Animal();
        animal2= new Animal();
        animal3= new Animal();
        animal4= new Animal();

        animal1.name="雪寶";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;
        animal1.show();
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入時間 : ");
        double x = sc.nextDouble();
        System.out.print("請輸入加速度 : ");
        double y = sc.nextDouble();
        System.out.println("跑步距離: "+animal1.distance(x, y)+"m");
        System.out.println();

        animal2.name="驢子";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;
        animal2.show();
        System.out.print("請輸入時間 : ");
        double a = sc.nextDouble();
        System.out.print("請輸入加速度 : ");
        double b = sc.nextDouble();
        System.out.println("跑步距離: "+animal2.distance(a, b)+"m");
        System.out.println();

        animal3.name="安那";
        animal3.height=1.7;
        animal3.weight=48;
        animal3.speed=120;
        animal3.show();
        System.out.print("請輸入時間 : ");
        double c = sc.nextDouble();
        System.out.print("請輸入加速度 : ");
        double d = sc.nextDouble();
        System.out.println("跑步距離: "+animal3.distance(c, d)+"m");
        System.out.println();

        animal4.name="愛沙";
        animal4.height=1.7;
        animal4.weight=50;
        animal4.speed=120;
        animal4.show();
        System.out.print("請輸入時間 : ");
        double e = sc.nextDouble();
        System.out.print("請輸入加速度 : ");
        double f = sc.nextDouble();
        System.out.println("跑步距離: "+animal4.distance(e, f)+"m");
        System.out.println();

    }

}