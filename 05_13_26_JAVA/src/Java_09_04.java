// 작성한 내용 중 weight 속성을 private로 접근 제한했다.
// 4와 같은 결과가 나오도록 프로그램을 수정하라.

class Animal4 {
    String species;
    private double weight;

    Animal4(String species) {
        this.species = species; // this를 사용하여 동일한 이름을 사용
    }

    void setW(double weight) {
        this.weight = weight;
    }

    double feed (double weight) {
        return weight * 0.07;
    }
}

public class Java_09_04 {
    public static void main(String[] args) {
        double weight;
        Animal4 ani = new Animal4("강아지");

//      ani.species = "강아지"; ==> 14번 라인 삭제
        weight = 5;

        System.out.println(ani.species + "의 사료의 양 : " + ani.feed (weight));
    }
}