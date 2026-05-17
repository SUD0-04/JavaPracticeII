// 17번 라인의 초기화 실행문을 삭제하고 12번 라인에서 species가 “강아지”로 초기화된
// 객체가 생성되도록 생성자를 추가하고 필요없는 실행문들을 삭제하여 같은 결과가 나오도록 수정

class Animal1 {
    String species;

    Animal1() {
        species = "강아지";
    }
    double feed (double w) {
        return w;
    }
}

public class Java_09_01 {
    public static void main(String[] args) {
        double weight;
        Animal1 ani = new Animal1();

//      ani.species = "강아지"; ==> 14번 라인 삭제
        weight = 5;

        System.out.println(ani.species + "의 사료의 양 : " + ani.feed (weight));
    }
}