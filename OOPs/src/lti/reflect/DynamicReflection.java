package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";
		
		// Manually LOADING THE CLASS
		Class custClass = Class.forName(qcn);
		
		// Getting parameterized constructor
		Constructor custConst = custClass.getConstructor(String.class);
		
		// Instantiating with parameterized constructor
		Object obj = custConst.newInstance("VK");
		System.out.println(obj);
		
		// Geeting private method
		Method printMethod = custClass.getDeclaredMethod("print", null);
		
		// calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
		
	}
}
