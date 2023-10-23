package models.member;

import commons.BadRequestException;
import commons.Validator;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Objects;

public class JoinService {
    private Validator validator;
    private MemberDao memberDao;

    public JoinService(Validator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void join(Member member) {

        validator.check(member);

        memberDao.register(member);
    }

    public void join(HttpServletRequest request) {
        String _agree = Objects.requireNonNullElse(request.getParameter("agree"), "false");
        boolean agree = _agree.equals("true") ? true : false;

        Member member = Member.builder()
                .userId(request.getParameter("userId"))
                .userPw(request.getParameter("userPw"))
                .confirmUserPw(request.getParameter("confirmUserPw"))
                .email(request.getParameter("email"))
                .userNm(request.getParameter("userNm"))
                .agree(agree)
                .build();
        join(member);
    }
}