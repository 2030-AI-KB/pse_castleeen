<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
	// Jquery�� �̿��� Ajax ����
	// A jax :: �ε����� �������� �����ϴ� ���� ������ �ִ� ���� 
	//S(function(){
		//$("#btn").click(function(){
			//$("#p").load("��ż���.txt");	
		//})
	//})
	
	// get(), post() �޼ҵ� ���
	// $.get("�޾ƿ� ������", "�ݹ��Լ�");
	$(function(){
		$("#btn").click(function(){
			$.get("��ż���.txt",function(){
				// ����� ������ ���� �Ű��Լ��̱� ������, Jquery ���� ���� X
				//alert("��� �����Ͽ����ϴ�.");
				$("p").html("������:"+data+"<br>����:"+status);
			})
		})
		
	})
	//$.post("������ ����", ������, �ݹ��Լ� )
	$(function(){
		$("#btn").cilck(function(){
			$.post("input.txt",
					{name:"�ڼ���", age:27},
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