<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
	//html �����δ� �±׸� �־�ΰ�, �±� ������ Jquery�� html() ���� �ֱ�
	$(document).ready(function(){ //$"������ �ϸ�"
		$("#p1").html("-����������");
		$("#p2").html("-������");
		$("#p3").html("-�н�ƮǪ��");
		$("#p4").html("-����");
		$("#p5").html("-Į����");
		
		$("#btn1").html("1���� �޴�����");
		$("#btn2").html("2���� �޴�����");
		$("#btn3").html("3���� �޴�����");
		$("#btn4").html("�ĺ� �����");	
	})
	
	$(function(){
		$("#btn1").click(function(){
			// �۾����� ����������, �۾� ũ��� ���� ũ�� Ű���� ����
			$("#p2").css("fontSize","40px");
		 	$("#p2").css("color","red");		
		})
		$("#btn2").click(function(){
			// �۾����� �Ķ�������, �۾� ũ��� 1�������� ���� �۰� Ű���� ����
			$("#p3").css("fontSize","25px");
		 	$("#p3").css("color","blue");	
	})
		$("#btn3").click(function(){
			// �۾����� �ʷϻ�����, �۾� ũ��� 2���� ���� ���� �۰� Ű���� ����
			$("#p1").css("fontSize","10px");
		 	$("#p1").css("color","green");
})
		$("#btn4").click(function(){
			// 1,2,3���� ������ �޴� �±� ��� �����
			  $("#p4").hide();
			  $("#p5").hide();
})
	})
</script>
<body>
		<h2>***���ɸ޴�***</h2>
		<hr>
			
<p id="p1"></p>
<p id="p2"></p>
<p id="p3"></p>
<p id="p4"></p>
<p id="p5"></p>
<hr>
<button id="btn1">1���� �޴�����</button>
<button id="btn2">2���� �޴�����</button>
<button id="btn3">3���� �޴�����</button>
<button id="btn4">�ĺ������</button>
</body>
</html>