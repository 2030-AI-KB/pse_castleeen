<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- jquery 적용방법 -->
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	// Jquery문의 script 태그는 보통 head 안에서 작성함
	// Jquery :: Js 언어 사용을 간편하게 하는 데에 도움을 주는 Js 라이브러리
	// Jquery는 프로그래밍 언어가 아니다.
	
	// Jquery 기본 문법 :: $(선택자). 동작함수()
	// $(document).ready == document.onload == $
	//		-> 생략 O [홈페이지를 불러오는건 당연하니까]
	//  	=> "문서"를 불러온다, 홈페이지를 이렇게 "구성한다"
	$(function(){ // ==window.onload
		// $ "실행을 하면" + $"id가 h인 태그에 해당 문자열을 삽입한다.""
		// Js 코드도 함께 작성 O
		//document.getElementById("h").innerHTML="성공적으로 문자열 삽입이 수행되었음;"
		$("#h").html("성공적으로 문자열 삽입이 수행되었음");
		
	})
	$(function(){ // "실행을 해서 홈페이지를 불러올 때, 아래 함수를 수행하라." (의미적으로 생략O)
  $("button").click(function(){  //button 태그를 클릭하면, 아래 함수를 수행하라.
								// (이때, html에 있는 모든 button 태그에 적용한다.)
	  $("p").hide(); //"html에 있는 모든  p 태그 요소를 숨겨라."
  });
});
	// => $"button태그를 클릭하면" + $"모든 p태그 요소를 숨겨라."
	
	// Css 처리 -> 태그style에 대한 적용 (이벤트도 가능)
	// id는 #, class는 . 
	$(function(){
		$("#h").css("color","coral");
	});
	$(function(){
		$("p").click(function(){ //$"p태그를 클릭하면"
			$("p").css("fontSize","25px");
			$("p").css("color","blue");
		})
	});
	
	}
</script>

<title>Insert title here</title>
</head>
<body>
 	<h2 id="h"> heading</h2>

<p>This is a paragraph.</p>
<p>This is another paragraph.</p>

<button>Click me</button>
 	


</body>
</html>