# mvc_practice
1주차 과제 제출

> 어려웠던 점 :
  
   * 500 오류가 계속 떴음 - applicationContext-datasource.xml 에서 username과 password 설정을 안 해두어 안 되었던 것.   
     지금은 잘 됩니다.   
   * 과제 가이드의 new 1-4. datasource & mybatis 연동 항목을 따라하는 동안 어디에 어떤 파일을 생성하여 넣어야 하는지 지시가 명확하지 않아 조금 헤맸습니다 ^^; 그래도 마지막에 첨부해주신 구조 보고 전부 설계하긴 했어요.

> 질문 :
    * 현재 잘 작동하고 있기는 한데, 다음과 같은 오류가 뜹니다.   
```
C:\Users-\OneDrive\문서\Spring_mvc\mvc_practice\src\main\webapp\WEB-INF\web.xml
  오류:(7, 20) 'org.springframework.web.servlet.DispatcherServlet'을(를) 'javax.servlet.Servlet,jakarta.servlet.Servlet'에 대입할 수 없습니다
  오류:(21, 19) 'org.springframework.web.filter.CharacterEncodingFilter'을(를) 'javax.servlet.Filter,jakarta.servlet.Filter'에 대입할 수 없습니다
```
라이브러리 문제일까요?
