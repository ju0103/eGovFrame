# 전자정부프레임워크 예제

## 💻 실행 환경

- eGovFrameDev-3.10.0
- Apache Tomcat 8.5
- Oracle Database

## ⚙ 오라클 및 JDBC 설정

1. ojdbc6.jar를 복사하여 src > main > webapp > WEB-INF > lib에 붙여넣는다. 만약 Maven Dependencies에서 ojdbc6.jar를 인식하지 못할 경우, 해당 프로젝트에서 오른쪽 마우스를 클릭하여 Maven > Update Project(Alt+F5)를 클릭한다.
   
2. pom.xml에 오라클 설정을 추가한다.
    ``` xml
      <?xml version="1.0" encoding="UTF-8"?>
      <project>

        <repositories>
          <!-- 오라클 설정 start -->
          <repository>
            <id>codelds</id>
            <url>https://code.lds.org/nexus/content/groups/main-repo</url>
          </repository>
          <!-- 오라클 설정 end -->
        </repositories>

        <dependencies>
          <!-- 오라클 설정 start -->
          <dependency>
            <groupId>ojdbc</groupId>
            <artifactId>ojdbc</artifactId>
            <version>6-11</version>
            <scope>system</scope>
            <systemPath>${basedir}/src/main/webapp/WEB-INF/lib/ojdbc6.jar</systemPath>
          </dependency>
          <dependency>
            <groupId>commons-dbcp</groupId>
            <artifactId>commons-dbcp</artifactId>
            <version>1.4</version>
          </dependency>
          <!-- 오라클 설정 end -->
        </dependencies>
    </project>
    ```

3. src/main/resources > egovframework > spring > context-datasource.xml에 JDBC 설정을 추가한다.
    ```xml
      <?xml version="1.0" encoding="UTF-8"?>
      <beans>
        <bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
            <property name="driverClassName" value="oracle.jdbc.driver.OracleDriver"/>
            <property name="url" value="jdbc:oracle:thin:@127.0.0.1:1521:xe" />
            <property name="username" value="scott"/>
            <property name="password" value="tiger"/>
        </bean>
      </beans>
    ```
     - property 태그에 JDBC 드라이버 설정에 필요한 driverClassName, url, username, password의 value 값을 넣는다.

## 🚩 실행 예제

### [dept_project]

- dept 테이블
  
    <img width="250" alt="dept_project 테이블" src="https://user-images.githubusercontent.com/53552121/146708837-64089305-efa6-4bd5-a55e-688d5c74f51d.PNG">

- 부서 등록

    <img width="307" alt="부서 등록" src="https://user-images.githubusercontent.com/53552121/146714654-4850f2d0-618a-4da3-8535-6fb384ddecfe.PNG">

- 부서 목록
  
    <img width="305" alt="부서 목록" src="https://user-images.githubusercontent.com/53552121/146714662-10d44c71-980d-41f8-a572-e6ccca3364f0.PNG">

- 부서 상세 정보 조회
  
    <img width="364" alt="부서 상세 정보 조회" src="https://user-images.githubusercontent.com/53552121/146714663-7396bff2-597c-43d6-9945-0e802ec8bcf9.PNG">

- 부서 정보 수정
  
    <img width="373" alt="부서 정보 수정" src="https://user-images.githubusercontent.com/53552121/146714664-e42648e8-b9bf-4e5c-bf6c-be8fe19e5b87.PNG">

- 부서 삭제

### [emp_project]

- emp 테이블
  
    <img width="250" alt="emp_project 테이블" src="https://user-images.githubusercontent.com/53552121/146709016-4fd5270b-9e5d-4705-9134-4869de23478a.PNG">


- 사원 등록
  
    <img width="308" alt="사원 등록" src="https://user-images.githubusercontent.com/53552121/146714792-46bfc712-7534-4b33-96b5-45fa3cd1676c.PNG">

- 사원 목록
  
    <img width="761" alt="사원 목록" src="https://user-images.githubusercontent.com/53552121/146714793-621467ce-18f3-4c98-90df-a78d4d0eca02.PNG">

- 사원 상세 정보 조회
  
    <img width="377" alt="사원 상세 정보 조회" src="https://user-images.githubusercontent.com/53552121/146714784-df78fd1a-4726-40d0-8c70-7e30c46f42dc.PNG">

- 사원 정보 수정
  
    <img width="384" alt="사원 정보 수정" src="https://user-images.githubusercontent.com/53552121/146714790-9d858649-8560-4e32-bb8a-f6f547588c70.PNG">
  
- 사원 삭제

### [item_project]

- item 테이블
  
    <img width="250" alt="item_project" src="https://user-images.githubusercontent.com/53552121/146708951-8050dc5c-05ee-4d11-aee2-0795519befe7.PNG">

- 상품 등록
  
    <img width="314" alt="상품 등록 화면" src="https://user-images.githubusercontent.com/53552121/146719264-fd387609-9fac-4bed-885f-1701c7b04304.PNG">

- 상품 목록
  
    <img width="610" alt="상품 목록 화면" src="https://user-images.githubusercontent.com/53552121/146719267-bfc42627-840c-4358-87c5-39a5ce92f2fd.PNG">


### [member_project]

- member 테이블
  
    <img width="250" alt="member_project 테이블" src="https://user-images.githubusercontent.com/53552121/146708982-0b7d9a08-aaca-4359-9934-c4b37184cddb.PNG">

- 회원가입

    <img width="312" alt="회원가입 화면" src="https://user-images.githubusercontent.com/53552121/146715169-ded93a87-645e-4c68-98ae-4729783c31d9.PNG">

- 로그인 및 로그인 성공 화면
  
    <img width="303" alt="로그인 화면" src="https://user-images.githubusercontent.com/53552121/146715176-06ca514e-9a07-48ce-91f1-225d1de58fa8.PNG">
  
    <img width="320" alt="로그인 성공 화면" src="https://user-images.githubusercontent.com/53552121/146715175-d59f5567-c83b-4ade-bc85-02eb856104be.PNG">


### [code_project]

- 파일 위치 설정
  - jsp 파일들이 위치할 경로 지정(dispatcher-servlet.xml)

    ```xml
      <bean class="org.springframework.web.servlet.view.UrlBasedViewResolver" p:order="1"
	    p:viewClass="org.springframework.web.servlet.view.JstlView"
	    p:prefix="/" p:suffix=".jsp"/>
    ```
    - p:prefix의 경로를 수정하여 jsp 파일들이 위치할 경로 설정
  
  - 쿼리 파일이 위치할 경로 지정(sql-map-config.xml)

    ```xml
      <?xml version="1.0" encoding="UTF-8"?>
      <sqlMapConfig>
        <sqlMap resource="egovframework/sqlmap/Code_SQL.xml"/>
      </sqlMapConfig>

    ```
    - sqlMap 태그의 resource 속성에서 연결할 쿼리 경로 설정

- codes 테이블
  
    <img width="250" alt="code_project 테이블" src="https://user-images.githubusercontent.com/53552121/146708894-c76c2c64-41bb-474b-b217-11d3cc518e0f.PNG">

- 최종 화면
  
    ![code_project](https://user-images.githubusercontent.com/53552121/146723432-f2e96fc9-e5b8-40b4-9ff5-68c15eae5b70.gif)
