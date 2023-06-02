<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>아래는 인적사항입니다.</h2>
<button id="intro" onclick="Intro()">인적사항 불러오기</button>
 <!-- id가 intro이고 요소 클릭을 하면 Intro() 함수를 수행하는 버튼 생성 -->
<script>
 function Intro(){
 	// 1. xhr 객체 생성
 	let xhr=new XMLHttpRequest(); // 생성자 사용
 	// 2.콜백 함수 정의 (서버로부터 introduce.txt 파일 받아올 것)
 	xhr.onload=function(){ //수신, 발신 성공적으로 완료되면, 다음 함수를 실행하라. 
 	}
 }
</script>

</body>
</html>