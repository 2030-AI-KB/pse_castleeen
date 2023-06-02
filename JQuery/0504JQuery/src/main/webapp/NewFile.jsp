<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- jquery ������ -->
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>
<script>
	// Jquery���� script �±״� ���� head �ȿ��� �ۼ���
	// Jquery :: Js ��� ����� �����ϰ� �ϴ� ���� ������ �ִ� Js ���̺귯��
	// Jquery�� ���α׷��� �� �ƴϴ�.
	
	// Jquery �⺻ ���� :: $(������). �����Լ�()
	// $(document).ready == document.onload == $
	//		-> ���� O [Ȩ�������� �ҷ����°� �翬�ϴϱ�]
	//  	=> "����"�� �ҷ��´�, Ȩ�������� �̷��� "�����Ѵ�"
	$(function(){ // ==window.onload
		// $ "������ �ϸ�" + $"id�� h�� �±׿� �ش� ���ڿ��� �����Ѵ�.""
		// Js �ڵ嵵 �Բ� �ۼ� O
		//document.getElementById("h").innerHTML="���������� ���ڿ� ������ ����Ǿ���;"
		$("#h").html("���������� ���ڿ� ������ ����Ǿ���");
		
	})
	$(function(){ // "������ �ؼ� Ȩ�������� �ҷ��� ��, �Ʒ� �Լ��� �����϶�." (�ǹ������� ����O)
  $("button").click(function(){  //button �±׸� Ŭ���ϸ�, �Ʒ� �Լ��� �����϶�.
								// (�̶�, html�� �ִ� ��� button �±׿� �����Ѵ�.)
	  $("p").hide(); //"html�� �ִ� ���  p �±� ��Ҹ� ���ܶ�."
  });
});
	// => $"button�±׸� Ŭ���ϸ�" + $"��� p�±� ��Ҹ� ���ܶ�."
	
	// Css ó�� -> �±�style�� ���� ���� (�̺�Ʈ�� ����)
	// id�� #, class�� . 
	$(function(){
		$("#h").css("color","coral");
	});
	$(function(){
		$("p").click(function(){ //$"p�±׸� Ŭ���ϸ�"
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