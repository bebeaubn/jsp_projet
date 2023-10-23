<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tag.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tag.fmt"
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="loginUrl" value="/member/login" />
<c:url var="joinUrl" value="member/join" />
<c:url var="logoutUrl" value="/member/logout" />
<c:url var="mypageUrl" value="/mypage" />

<layout:main title="메인..">
     <c:if test = "${sessionScope.member == null}"> <%--미 로그인> 상태 -- %>
    <a href = "{$loginUrl}">로그인</a>
    <a href = "{$logUrl}">


     </c:if>
      <c:if test = "${sessionScope.member != null}"> <%--미 로그인 상태 -- %>
        <fmt:message key="LOGIN_MSG">
        <fmt:param>$<sessionScope.member.usserNm></fmt:param>
        <fmt:param>$<sessionScope.member.userId
      </c:if>
      <layout:main>