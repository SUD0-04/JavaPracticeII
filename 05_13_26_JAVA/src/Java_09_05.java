import java.util.Scanner;

class Car {
    String carT;
    String carN;
    private double speed;

    Car(String carT, String carN) {
        this.carT = carT;
        this.carN = carN;
        this.speed = 0;
    }

    void setSpeed(char pedal) {
        if (pedal == 'E' || pedal == 'e') {
            speed += 5;
            if (speed > 120) {
                System.out.println("<경고> 과속하여 속도를 제한합니다.");
                speed = 120;
            }
            System.out.println("현재 속도 : " + speed);
        } else if (pedal == 'B' || pedal == 'b') {
            speed -= 5;
            if (speed <= 0) {
                System.out.println("<안내> 차량을 정지합니다.");
                speed = 0;
            }
            System.out.println("현재 속도 : " + speed);
        } else if (pedal == 'S' || pedal == 's') {
            speed = 0;
            System.out.println("<안내> 차량을 정지합니다.");
            System.out.println("현재 속도 : " + speed);
        } else {
            // 오입력 시 작동 방지를 위한 공란 else
        }
    }
}

public class Java_09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("차종 : ");
        String carT = sc.nextLine();

        System.out.print("차량번호 : ");
        String carN = sc.nextLine();

        Car yourcar = new Car(carT, carN);

        System.out.println(carT + " " +  carN + " " + "출발 =====");

        while (true) {
            System.out.print(carN + "의 페달 신호 : ");
            char pedal = sc.next().charAt(0);

            yourcar.setSpeed(pedal);

            if (pedal == 'S' || pedal == 's') {
                break;
            }
        }

        sc.close();
    }
}