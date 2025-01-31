package section5_construct;

public class ConstructMain1 {
    public static void main(String[] args) {

        MemberConstruct m1 = new MemberConstruct("이성은", 18, 88);
        MemberConstruct m2 = new MemberConstruct("차명환", 15, 95);

        MemberConstruct[] members = {m1, m2};

        for (MemberConstruct mem : members) {
            System.out.println("이름: " + mem.name + " 나이: " + mem.age + " 성적: " + mem.grade);
        }
    }
}
