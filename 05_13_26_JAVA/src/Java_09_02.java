// 2에서 작성한 프로그램에서 객체 ani 생성하는 실행문과 feed 메서드를 다음과 같이 작성했다고
// 했을 때 생성자를 그에 맞게 수정하시오.(단 생성자의 파라미터는 속성명과 다르게 하시오.)
// 주어진 조건은 다음과 같다.
// Animal ani = new Animal("강아지");
// double feed() { return weight * 0.07; }

class Animal2 {
    String species;
    double weight;

    Animal2(String s) {
        species = s;
    }
    double feed (double weight) {
        return weight * 0.07;
    }
}

public class Java_09_02 {
    public static void main(String[] args) {
        double weight;
        Animal2 ani = new Animal2("강아지");

//      ani.species = "강아지"; ==> 14번 라인 삭제
        weight = 5;

        System.out.println(ani.species + "의 사료의 양 : " + ani.feed (weight));
    }
}