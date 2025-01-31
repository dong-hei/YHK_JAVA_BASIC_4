package section5_construct;
/**
 * 생성자 -  오버로딩, this()
 */

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("이성은", 18, 88);
        MemberConstruct m2 = new MemberConstruct("차명환", 15);

        MemberConstruct[] members = {m1, m2};

        for (MemberConstruct mem : members) {
            System.out.println("이름: " + mem.name + " 나이: " + mem.age + " 성적: " + mem.grade);
        }
    }
}
