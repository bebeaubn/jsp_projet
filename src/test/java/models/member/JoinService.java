package models.member;

import commons.BadRequestException;
import commons.Validator;

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
}