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
 <div id="div1"></div>  <!-- 인적사항 txt 파일 출력할 공간 -->
<br>
<h4> 지금 까지 수업했던 내용들ㅇ르 불러업니다.</h4>
<p> *Java</p>
<button id="java" onclick="Jave">Java 수업내용 불러오기</button>
<div id="div2"></div>

<p>* html/css </p>
<script>
 function Intro(){
 	// 1. xhr 객체 생성
 	let xhr=new XMLHttpRequest(); //생성자 사용
 	// 2.콜백 함수 정의 (서버로부터 introduce.txt 파일 받아올 것)
 	xhr.onload=function(){ //수신, 발신 성공적으로 완료되면, 다음 함수를 실행하라. 
 		document.getElementById("div1").innerHTML=this.responseText;
 			//this.responseText :: 수신받은 데이터
 	}
 	xhr.onprogress=function(){ //서버로부터 데이터 수신받기 적전 수행
 		 alert("확인을 누르시면 결과가 나타납니다.");
 		
 	}
 	
 	//3. 서버에 요청보내기 :: open(), send()
 	xhr.open("GET","함수.txt");
 	xhr.send();
 	
 }
function Java(){
	let xhr=new XMLHttpRequest();
	xhr.onload=function90{
		document.getElementById("div2").innerHTML=this.responseText;
		}
	xhr.open("GET","함수예제");
	xhr.send();
}
function HTML)(){
	// 1. XMLHttpRequest 생성자 이용하여 xhr객체 생성
	let xhr=new MLHttpRequest();
	// 서버에 요청 보내기 :: send(), open()
	// 객체명.open() 
	// ->GET(데이터 받아올때) / POST(데이터를 줄때) -> 매개변수 구성이 다름
	// 객체명.send() -> POST인 경우, string형 매개변수 필요
	xhr.open("");
	xhr.send();
	// 콜백 함수 정의
	xhr.onload=function(){
		document.getElementById("div3").innerHTML=this.responseText;
	}
	
}
 
</script>
</body>
</html>