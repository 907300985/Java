/**����״̬����Ϊ����ʶ*/
package cn.tedu.oop;
/**������������������Ű���*/
//��������ֻ���һ������
public class TestCreatClass {
	//main�������������
	public static void main(String[]args) {
		//����ģ�崴����һ��������Ķ���
		/**ͨ��new�ؼ��ִ�����Ӧ��Ķ���*/
		Phone p = new Phone();
		/**����ͨ��.��ʹ�ö������Դ*/
		//���ö���ķ���
		p.call();
		p.message();
		p.video();
		//�鿴���������ֵ
		System.out.println(p.brand);
		System.out.println(p.size);
		System.out.println(p.color);
		System.out.println(p.price);
		
		//�����ڶ�������
		Phone p2 = new Phone(); 
		p2.brand = "HUAWEI";
		p2.size = 5.6;
		p2.color = "��ʰ�쵵ĺ�";
		p2.price = 8888;
		System.out.println(p2.brand);
		System.out.println(p2.size);
		System.out.println(p2.color);
		System.out.println(p2.price);
		p2.call();
		p2.message();
		p2.message();
		
	}
}

//1.����ģ�壬ͨ��class�ؼ��������ֻ���һ������
//�ص㣺Ʒ�� ��ɫ �ߴ� �۸�...
//���ܣ� ��绰 ������...
class Phone{/**��װ����һ���������������Ϊ��װ��һ�����*/
	//1.���ֻ����ص�--��Ա����
	String brand;
	String color;
	double size;
	double price;
	
	//2.�����ֻ���Ĺ���--����
	public void call() {
		System.out.println("���ڴ�绰");
	}
	public void message() {
		System.out.println("��������");
	}
	public void video() {
		System.out.println("���ڿ�ֱ��");
	}
}