package section5_construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1", 15, 90);

        MemberInit m2 = new MemberInit();
        m2.initMember("user2", 13, 85);

        MemberInit[] m = {m1, m2};

        for (MemberInit mem : m) {
            System.out.println("이름: " + mem.name + " 나이: " + mem.age + " 성적: " + mem.grade);
        }
    }
}
