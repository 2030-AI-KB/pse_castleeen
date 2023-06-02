<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
	//html 상으로는 태그만 넣어두고, 태그 내용은 Jquery의 html() 통해 넣기
	$(document).ready(function(){ //$"실행을 하면"
		$("#p1").html("-편의점음식");
		$("#p2").html("-마라탕");
		$("#p3").html("-패스트푸드");
		$("#p4").html("-국밥");
		$("#p5").html("-칼국수");
		
		$("#btn1").html("1순위 메뉴보기");
		$("#btn2").html("2순위 메뉴보기");
		$("#btn3").html("3순위 메뉴보기");
		$("#btn4").html("후보 지우기");	
	})
	
	$(function(){
		$("#btn1").click(function(){
			// 글씨색은 빨간색으로, 글씨 크기는 가장 크게 키워서 설정
			$("#p2").css("fontSize","40px");
		 	$("#p2").css("color","red");		
		})
		$("#btn2").click(function(){
			// 글씨색은 파란색으로, 글씨 크기는 1순위보단 조금 작게 키워서 설정
			$("#p3").css("fontSize","25px");
		 	$("#p3").css("color","blue");	
	})
		$("#btn3").click(function(){
			// 글씨색은 초록색으로, 글씨 크기는 2순위 보단 조금 작게 키워서 설정
			$("#p1").css("fontSize","10px");
		 	$("#p1").css("color","green");
})
		$("#btn4").click(function(){
			// 1,2,3순위 제외한 메뉴 태그 모두 숨기기
			  $("#p4").hide();
			  $("#p5").hide();
})
	})
</script>
<body>
		<h2>***점심메뉴***</h2>
		<hr>
			
<p id="p1"></p>
<p id="p2"></p>
<p id="p3"></p>
<p id="p4"></p>
<p id="p5"></p>
<hr>
<button id="btn1">1순위 메뉴보기</button>
<button id="btn2">2순위 메뉴보기</button>
<button id="btn3">3순위 메뉴보기</button>
<button id="btn4">후보지우기</button>
</body>
</html>