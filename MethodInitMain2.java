package section5_construct;
/**
 * 생성자가 필요한 이유 - 반복을 메소드로 추출했다.
 */
public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        initMember(m1, "user1", 15, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "user2", 13, 85);

        MemberInit[] m = {m1, m2};

        for (MemberInit mem : m) {
            System.out.println("이름: " + mem.name + " 나이: " + mem.age + " 성적: " + mem.grade);
        }
    }
    static void initMember(MemberInit m, String name, int age, int grade){
        m.name = name;
        m.age = age;
        m.grade = grade;
    }
}
