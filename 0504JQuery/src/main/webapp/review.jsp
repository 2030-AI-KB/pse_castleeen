<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- "Ajax�� ���α׷��� ���� �ƴϴ�." -->
	<!-- Ajax :: �ε����� �������� �����ϰ�, ��׶��� -> �������� ������ ��ȣ���� ��� -->
	<!-- "�ٴҶ�(����) Js ���� ����" or Jquery ���� ���� -->
	
	<!-- id�� btn�̰�, Ŭ���� �ϸ� Func() �Լ��� �����ϴ� ��ư ���� -->
	<button id="btn" onclick="Func()">��ư�� �����ּ���</button>
	
	<p id="test"></p>	<!-- onprogress �Լ� ���� ��� ��� -->
	<p id="text"></p>	<!-- onload �Լ� ���� ��� ��� -->
	
	<script>
		// XMLHttpRequest ��ü :: �� ������ "������ ��ȯ"�� ��� (Js���� �����ڷ� ����)
		//		�� ��ü�� ���ؼ�, ������ �� �Ϻθ� ������Ʈ ����
		
		// * �ݹ� �Լ� ����
		// onload :: xhr ��ü�� �����κ��� �����͸� ���������� ���� �� ������ �Լ�
		// onerror :: xhr ��ü ���� ������ �߽�/���� �Ǵ� xhr ��ü ��ü�� ���� �߻� �� ������ �Լ�
		// onprogress :: xhr ��ü���� ������ ���Ź��� �� ȣ���� �Լ�
		// ...
		
		function Func(){
			// 1. XMLHttpRequest ��ü ���� -> ����� ������ �̿�
			// let/const ��ü�� = new XMLHttpRequest();
			let xhttp=new XMLHttpRequest();
			// 2. �ݹ� �Լ�(������ ����/�߽��� �� �� ������ �Լ�) ����
			// xhr��ü��.�ݹ��Լ��� = function(){
			//	(�ݹ��Լ��� �����Ű�� ������ ������ ��)������ ��ɹ�
			// }
			xhttp.onload=function(){
				document.getElementById("text").innerHTML=this.responseText;
			}
			xhttp.onprogress=function(){
				alert("Ȯ���� ���� �����͸� Ȯ���ϼ���.")
			}
			// �ݹ��Լ� ������ ������ ���� ����
			
			// 3. ������ ��û ������ :: open(), send()
			// open() :: ������ ��û�� ���� ���
				// xhr��ü��.open("GET/POST", "������ ��û�� ������");
				// GET :: �����κ��� �����͸� �޾ƿ� �� ��� (=�����͸� ��û�� �� ���)
				// POST :: ������ �����͸� ���� �� ���
			// send() :: ������ ��û�� ����
				// xhr��ü��.send();	-> POST ������ ��, string�� �Ű������� �־���� (send(string))
			xhttp.open("GET", "text.txt");	// "text.txt ������ �޾ƿ� ���� ��û�Ѵ�."
			xhttp.send();
			// GET ������ ����� ��, open()�� �ι�° �Ű����� �ʿ�� ��
			// POST ������ ����� ��, send()�� ù��° �Ű����� �ʿ�� ��
		}
		</script>
</body>
</html>