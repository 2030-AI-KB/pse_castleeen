<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
	// Jquery를 이용한 Ajax 구현
	// A jax :: 로딩없이 페이지를 갱신하는 데에 도움을 주는 역할 
	//S(function(){
		//$("#btn").click(function(){
			//$("#p").load("통신성공.txt");	
		//})
	//})
	
	// get(), post() 메소드 사용
	// $.get("받아올 데이터", "콜백함수");
	$(function(){
		$("#btn").click(function(){
			$.get("통신성공.txt",function(){
				// 여기는 서버로 보낼 매개함수이기 때문에, Jquery 문법 쓰진 X
				//alert("통신 성공하였습니다.");
				$("p").html("데이터:"+data+"<br>상태:"+status);
			})
		})
		
	})
	//$.post("저장할 공간", 데이터, 콜백함수 )
	$(function(){
		$("#btn").cilck(function(){
			$.post("input.txt",
					{name:"박성은", age:27},
					function(data,status){
						$(#text)
					})
					
		})	
	})
	
	</script>
<body>
	<p id="p"></p>
</body>
</html>