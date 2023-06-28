<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입테스트</title>
</head>

<script type="text/javascript">
	
	function register() {
		
		const frm = document.registerForm;
		
		frm.action="registerMethod";
		frm.method="post";
		frm.submit();
		
		
	}
	
</script>

<body>
	<form name="registerForm">
		<div>
			<div>아이디</div>
			<input type="text" name="userid" id="userid" />
		</div>
		<div>
			<div>비밀번호</div>
			<input type="text" name="passwd" id="passwd" />
		</div>
		<div>
			<div>이메일</div>
			<input type="text" name="email" id="email" />
		</div>
		<div>
			<div>이름</div>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<div>전화번호</div>
			<input type="text" name="mobile" id="mobile" />
		</div>
		<button type="button" onclick="register();">확인</button>
	</form>
</body>
</html>