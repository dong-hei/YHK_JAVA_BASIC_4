package section5_construct;

/**
 * 생성자가 필요한 이유
 */

public class MemberInit {
    String name;
    int age;
    int grade;


    /***
     * 나 자신을 지칭하는 this. 를 추가
     * 여기서 this. 를 빼면 범위상 가까운 매개변수가 호출되는데
     * 이러면 name은 둘다 매개변수를 뜻하게 되어 멤버변수의 값이 변경되지 않음.
     */
    void initMember(String name, int age, int grade){
        this.age = age;
        this.grade = grade;
    }
}
