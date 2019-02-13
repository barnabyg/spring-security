<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- <form:form method="post" action="j_spring_security_check"> -->
<form action="<c:url value="/j_spring_security_check"></c:url>" method="post" role="form">

<div id="login-error">${error}</div>

  <label for="j_username">Username</label>
  <input id="j_username" name="j_username" type="text" />
  </p>
  <p>


    <label for="j_password">Password</label> <input id="j_password"
      name="j_password" type="password" />
  </p>
  <input type="submit" value="Login" />

</form:form>
