<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="title" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<c:url var="commonCss" value="/css/style.css" />
<c:url var="commonJs" value="/js/common.js" />
<c:url var="cssUrl" value="/css/" />
<c:url var="jsUrl" value="/js/" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <link rel="stylesheet" type="text/css" href="${commonCss}">
        <c:if test="${addCss != null}">
            <c:forEach var="path" items="${addCss}">
            <link rel="stylesheet" type="text/css" href="${cssUrl}${path}.css">
            </c:forEach>
        </c:if>

        <script src="${commonJs}"></script>
        <c:if test="${addScript != null}">
            <c:forEach var="path" items="${addScript}">
                <script src="${jsUrl}${path}.js"></script>
            </c:forEach>
        </c:if>
    </head>
    <body>
        <header>
            <jsp:invoke fragment="header" />
        </header>
        <main>
            <jsp:doBody />
        </main>
        <footer>
            <jsp:invoke fragment="footer" />
        </footer>
    </body>
</html>