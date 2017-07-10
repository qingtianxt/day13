package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import domain.Person;

public class Demo {
	@Test
	public void f1() throws Exception{
		//1.��ȡclass����
		Class clazz = Class.forName("domain.Person");
//		Person p = (Person) con.newInstance();//ʹ��ctrl1�������͵�ת��
		//2.��ȡ���������˽⣩
		//Constructor conn =clazz.getConstructor();
		//2.1��ȡ���εĹ�����
		Constructor con = clazz.getConstructor(String.class,String.class);
		Person p = (Person) con.newInstance("tom","123");
		
		System.out.println(p.getPassword());
	}
	@Test
	public void f2() throws Exception{
		//��ȡclass����
		
		Class clazz = Class.forName("domain.Person");
		
		//2.��ȡ������
		Person  p = (Person) clazz.newInstance();
	}
	@Test
	public void f3() throws Exception{
		//��ȡclass����
		
		Class clazz = Class.forName("domain.Person");
		
		Person p = (Person) clazz.newInstance();
		//2.��ȡ����
		//Method m = clazz.getMethod("sleep");//��ȡ�����ķ���
		Method m  = clazz.getDeclaredMethod("sleep");//��ȡ����ķ���
		//2.1����˽�еķ����������ø÷������Է���
		m.setAccessible(true);
		
		//ִ�з���
		m.invoke(p);
		
		
	}
	
	@Test
	public void f4() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		//1.��ȡclass����
		
		Class clazz = Class.forName("domain.Person");
		
		//2.��ȡ˽�еķ�����
		Method m=clazz.getDeclaredMethod("sleep",String.class);
		//�÷������Է���
		m.setAccessible(true);
		
		//3.�÷���ִ��
		String res=(String) m.invoke(clazz.newInstance(),"����");
		System.out.println(res);
	}
}
