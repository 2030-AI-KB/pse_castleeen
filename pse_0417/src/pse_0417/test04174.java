package pse_0417;

class Women_IT{
	// women it Ŭ���� ��� ����
	 public String name;	// �ν�ź�� ����
	 public static String gender="����"; //Ŭ����(static) ������ �����ϰ�, "����"���� �ʱ�ȭ
	 public boolean student; // �л��̸� True, �ƴ϶�� False
	 
	 // ������ 
	 public Women_IT(String n, boolean s) {
		 this.name=n;
		 this.student=s;
	 }
	 //�޼ҵ�
	 //1. �̸��� ���� ����ϴ� �޼ҵ�
	 public void Print() {
		 System.out.println("�̸�: "+this.name);
		 System.out.println("����: "+this.gender);
	 }
	 //2. �л����� �������� ����ϴ� �޼ҵ�
	 public void Student() {
		 if(this.student==true) {
			 System.out.println("�л��Դϴ�.");
		 }
		 else {
			 System.out.println("�����Դϴ�.");
		 }
	 }



}




public class test04174 {
    public static void main(String[] args) {
    	// �л� ��ü ����
       Women_IT stu=new Women_IT("�ڼ���", true);
       // ���� ��ü ����
       Women_IT tc=new Women_IT("������", false);
    	
      stu.Student();
       stu.Print();
       
       
       tc.Student();
       tc.Print();
    		   
    		   
    }
	
}
