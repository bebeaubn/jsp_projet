<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="action" value="/member/join" />
<layout:main title="회원가입">
    <h1>회원가입</h1>
    <form method="post" action="${action}" target="ifrmProcess">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="userPw">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호 확인</dt>
            <dd>
                <input type="password" name="confirmUserPw">
            </dd>
        </dl>
        <dl>
            <dt>회원명</dt>
            <dd>
                <input type="text" name="userNm">
            </dd>
        </dl>
        <dl>
            <dt>이메일</dt>
            <dd>
                <input type="email" name="email">
            </dd>
        </dl>
        <div>
            <input type="checkbox" name="agree" value="true" id="agree">
            <label for="agree">회원가입 약관에 동의 합니다.</label>
        </div>
        <button type="submit">가입하기</button>
    </form>
</layout:main>









