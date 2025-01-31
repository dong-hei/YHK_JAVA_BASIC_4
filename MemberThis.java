package section5_construct;
/**
 * 생성자가 필요한 이유
 */
public class MemberThis {
    String nameField;

    //지역변수명과 매개변수명이 다른경우는 this 생략 가능
    void initMember(String nameParam){
        nameField = nameParam;
    }
}
