<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script>
	//실행을 하면, 이미지 태그와 p/div 태그에 각각 임의의 이미지와 txt 파일을 불러오게끔한다.
	$(fuction(){
		$("img").attr("src","Ex_ham.jpg");
		$("img").css("width","50px");
		$("p").load("Ex_ham.txt");
	})
	
	$(function(){
		$("button").click(function(){
			$get.("nyang.txt",function(data,status){
				alert("통신 결과:" + status);
				$("p").html(data);
			})
			$("img").attr()
			
		})
	})
</script>

<title>Insert title here</title>
</head>
<body>
<!-- html태그 구성 :: 버튼1개 이미지태그 1개 p또는 div태그 1개 -->
<button>이미지변경</button>
<img>
<p></p>
</body>
</html>