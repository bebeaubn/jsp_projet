<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="action" value="/member/login" />
<layout:main title="로그인">
    <h1>로그인</h1>
    <form method="post" action="${action}" target="ifrmProcess">
        <dl>
            <dt>아이디</dt>
            <dd>
                <input type="text" name="userId" value="{$cookie.saveId.value}">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="userPw">
            </dd>
        </dl>
        <div>
        <input type="checkbox" name="saveId" value="true" id="saveId" ${cookie.saveId == null '': ' checked'}>
        <label for=""

        <button type="submit">로그인</button>
    </form>
</layout:main>
