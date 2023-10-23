# jsp 프로젝트

##TDD를 통한 설계
 -의존성 추가
      -junit5 
      -mockito
      -maven-sure-fire plugin
        -servlet-api
        -servlet.jsp-api
        -jstl api
        -jstl implementation
        -lombok
- 
- 
- 회원가입 기능 설계 (join service)
         -models/member/JoinService.java
         -필수항목 검증(아이디, 비밀번호 ,비밀번호 확인, 회원명,이메일,회원가입 약관 동의)
          -아이디 자리수 (6자리 이상), 비밀번호 자리수(8자리 이상) 체크
          -비밀번호, 비밀번호 확인 입력 데이터 일치여부 체크
          -아이디 중복 여부 체크 -중복된 경우 불가
           -회원 정보를 저장 


-로그인 기능 설계(LoginService)
  -models/member/LoginService.java 
   - 필수항목 검증(아이디, 비밀번호)
   - 아이디에 해당하는 회원정보가 있는지 체크
   - 로그인 처리(세션에 회원정보를 저장)
     




##
기능통합
-회원가입
   -Controller : /member/join
   -controller/member/JoinController
   -GET : 회원가입 양식
   -Post : 회원가입 처림
   - view : /WEB-INF/templates/member/join.jsp
-로그인
   - controller : /member/login
   - controllers/member/LoginController.jave
   - GET : 로그인 양식
   - POST : 로그인 처리
   - VIEW : /WEB-INF/templates/member/join.jsp

-메인페이지
  -로그인한 경우 
  -사용자명(아이디) 로그인 메세지 출력
  -로그아웃(/member/logout), 마이페이지(/mypage)링크
-미로그인 상태
  회원가입(/member/join), 로그인(/member/login)링크

-로그아웃
-Controller
  -controllers/member/LogoutController.jave
-GET,POST 메서드 상관없이 기능할수있도록 처리
   