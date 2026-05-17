// 수정 전 기존 코드

class Animal0 {
    String species;

    double feed (double w) {
        return w * 0.07;
    }
}

public class Java_09_00 {
    public static void main(String[] args) {
        double weight;
        Animal0 ani = new Animal0();

        ani.species = "강아지";
        weight = 5;

        System.out.println(ani.species + "의 사료의 양 : " + ani.feed (weight));
    }
}