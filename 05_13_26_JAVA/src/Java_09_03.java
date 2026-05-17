// 작성한 내용의 생성자에서 파라미터의 이름을 속성명과 같게 했을 때
// 생성자의 내용을 수정하여 3과 같은 결과가 나오도록 하시오.

class Animal3 {
    String species;
    double weight;

    Animal3(String species) {
        this.species = species; // this를 사용하여 동일한 이름을 사용
    }
    double feed (double weight) {
        return weight * 0.07;
    }
}

public class Java_09_03 {
    public static void main(String[] args) {
        double weight;
        Animal3 ani = new Animal3("강아지");

//      ani.species = "강아지"; ==> 14번 라인 삭제
        weight = 5;

        System.out.println(ani.species + "의 사료의 양 : " + ani.feed (weight));
    }
}