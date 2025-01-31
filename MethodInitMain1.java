package section5_construct;
/**
 * 생성자가 필요한 이유
 */
public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.name = "user1";
        m1.age = 15;
        m1.grade = 75;


        MemberInit m2 = new MemberInit();
        m2.name = "user2";
        m2.age = 13;
        m2.grade = 85;

        MemberInit[] m = {m1, m2};

        for (MemberInit mem : m) {
            System.out.println("이름" + mem.name + " 나이: " + mem.age + " 성적: " + mem.grade);
        }

    }
}
