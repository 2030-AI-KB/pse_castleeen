<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script>
	//������ �ϸ�, �̹��� �±׿� p/div �±׿� ���� ������ �̹����� txt ������ �ҷ����Բ��Ѵ�.
	$(fuction(){
		$("img").attr("src","Ex_ham.jpg");
		$("img").css("width","50px");
		$("p").load("Ex_ham.txt");
	})
	
	$(function(){
		$("button").click(function(){
			$get.("nyang.txt",function(data,status){
				alert("��� ���:" + status);
				$("p").html(data);
			})
			$("img").attr()
			
		})
	})
</script>

<title>Insert title here</title>
</head>
<body>
<!-- html�±� ���� :: ��ư1�� �̹����±� 1�� p�Ǵ� div�±� 1�� -->
<button>�̹�������</button>
<img>
<p></p>
</body>
</html>