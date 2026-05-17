// 문제
// 한 변의 길이를 입력받아 정육면체의 부피와 넓이의 합을 구하는 코드를 "클래스"를 활용하여 완성하시오.
// 조건 : extends를 사용한 클래스, 소수점 2자리까지 표현 (double 사용)

import java.util.Scanner;

class Shape {
    double side;

    Shape(double side) {
        this.side = side;
    }
}

class Cube extends Shape {
    Cube(double side) {
        super(side);
    }

    double vol() {
        return side * side * side;
    }

    double surfArea() {
        return 6 * side * side;
    }
}

public class Java_10_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("한 변의 길이를 입력하시오 : ");
        double side = sc.nextDouble();

        Cube cube = new Cube(side);

        System.out.printf("정육면체의 부피 : %.2f\n", cube.vol());
        System.out.printf("정육면체의 넓이의 합 : %.2f", cube.surfArea());

        sc.close();
    }
}
