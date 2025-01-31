package section5_construct;

/**
 * 생성자 - 도입 및 오버로딩, this()
 * 생성자는 클래스명과 같아야 한다.
 * 생성자는 반환타입이 없다.
 * 생성자의 장점: 중복호출 제거, 생성자 호출이 필수기에 개발자가 실수를 방지해준다.
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 오버로딩 - 성적이 불필요한 경우는 grade가 없는 생성자를 호출 / 성적이 필요한 경우는 grade가 있는 생성자를 호출
    MemberConstruct(String name, int age){
       /*
        this.name = name;
        this.age = age;
        this.grade = 50;를 이하로 변경
        */
        this(name, age, 50); // 중복제거 - 생성자 코드의 첫줄에만 작성할수 있다
       
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + " ,age = " + age + " ,grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
