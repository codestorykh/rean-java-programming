package com.learningjava;

public class StaticFinalStaticDemo {

	static String strObject1;

	String strObject2;

	@SuppressWarnings("static-access")
	public static void main(String args[])

	{
		StaticFinalStaticDemo object1 = new StaticFinalStaticDemo();

		StaticFinalStaticDemo object2 = new StaticFinalStaticDemo();

		StaticFinalStaticDemo object3 = new StaticFinalStaticDemo();

		object1.strObject1 = "Arvind";

		System.out.println("object1 : " + object1.strObject1);

		System.out.println("object2 : " + object2.strObject1);

		System.out.println("object3 : " + object3.strObject1);

		StaticFinalStaticDemo at = new StaticFinalStaticDemo();

		at.display();

	}

	void display()

	{

		StaticFinalStaticDemo object4 = new StaticFinalStaticDemo();

		StaticFinalStaticDemo object5 = new StaticFinalStaticDemo();

		StaticFinalStaticDemo object6 = new StaticFinalStaticDemo();

		object4.strObject2 = "Siva";

		System.out.println("object 4 : " + object4.strObject2);

		System.out.println("object 5 : " + object5.strObject2);

		System.out.println("object 6 : " + object6.strObject2);

	}

}
