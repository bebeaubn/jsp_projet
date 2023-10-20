package models.member;

import org.mindrot.jbcrypt.BCrypt;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {
    private static Map<String, Member> members = new HashMap<>();

    public void register(Member member) {

        String userPw = BCrypt.hashpw(member.getUserPw(), BCrypt.gensalt(12));
        member.setUserPw(userPw);
        members.put(member.getUserId(), member);

    }

    public Member get(String userId){
        return members.get(userId);
    }

    public boolean exists(String userId){
        return members.containsKey(userId);

    }

    public static void clearDate() {
        members = new HashMap<>();
    }

}
