package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import domain.Person;

public class Demo {
	@Test
	public void f1() throws Exception{
		//1.获取class对象
		Class clazz = Class.forName("domain.Person");
//		Person p = (Person) con.newInstance();//使用ctrl1进行类型的转化
		//2.获取构造器（了解）
		//Constructor conn =clazz.getConstructor();
		//2.1获取带参的构造器
		Constructor con = clazz.getConstructor(String.class,String.class);
		Person p = (Person) con.newInstance("tom","123");
		
		System.out.println(p.getPassword());
	}
	@Test
	public void f2() throws Exception{
		//获取class对象
		
		Class clazz = Class.forName("domain.Person");
		
		//2.获取构造器
		Person  p = (Person) clazz.newInstance();
	}
	@Test
	public void f3() throws Exception{
		//获取class对象
		
		Class clazz = Class.forName("domain.Person");
		
		Person p = (Person) clazz.newInstance();
		//2.获取方法
		//Method m = clazz.getMethod("sleep");//获取公共的方法
		Method m  = clazz.getDeclaredMethod("sleep");//获取任意的方法
		//2.1若是私有的方法，必须让该方法可以访问
		m.setAccessible(true);
		
		//执行方法
		m.invoke(p);
		
		
	}
	
	@Test
	public void f4() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		//1.获取class对象
		
		Class clazz = Class.forName("domain.Person");
		
		//2.获取私有的方法，
		Method m=clazz.getDeclaredMethod("sleep",String.class);
		//让方法可以访问
		m.setAccessible(true);
		
		//3.让方法执行
		String res=(String) m.invoke(clazz.newInstance(),"侯镇");
		System.out.println(res);
	}
}
