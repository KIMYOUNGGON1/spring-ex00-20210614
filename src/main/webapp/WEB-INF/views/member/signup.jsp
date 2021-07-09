<%@ page  contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="bd" tagdir="/WEB-INF/tags/board"%>


<!DOCTYPE html>
<html>
<head>

<%@ include file = "/WEB-INF/subModuels/bootstrapHeader.jsp" %>

<title>Insert title here</title>
<script>
$(function() {
	$("#signup-input2, #signup-input4").keyup(function() {
		var pw1 = $("#signup-input2").val();
		var pw2 = $("#signup-input4").val();
		
		if (pw1 != pw2) {
			$("#password-message").text("패스워드가 일치하지 않습니다.");	
		} else {
			$("#password-message").empty();
		}
	});
});

</script>

</head>
<body>
<bd:navbar></bd:navbar>
<div class = "container">
	<c:if test="${not empty param.error }">
		<div id="alert1" class="alert alert-danger" role="alert">
			회원 가입에 실패하였습니다.
		</div>
	</c:if>
	
	<h1>회원 가입</h1>
	<div class="row">
		<div class="col-12">
			<form action="${appRoot}/member/signup" method="post">
				<div class="form-group">
					<label for="signup-input1]">아이디</label>
					<input type="text" class="form-control" id="signup-input1" name="userid">
				</div>
				<div class="form-group">
					<label for="signup-input2">패스워드</label>
					<input type="password" class="form-control" id="signup-input2" name="userpw">
				</div>
				<div class="form-group">
					<label for="signup-input4">패스워드 확인</label>
					<input type="password" class="form-control" id="signup-input4">
					<small id="password-message" class="form-text text-danger"></small>
				</div>
				<div class="form-group">
					<label for="signup-input3">이름</label>
					<input type="text" class="form-control" id="signup-input3" name="userName">
				</div>
				<button type="submit" class="btn btn-primary" id="signup-btn1">회원 가입</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>