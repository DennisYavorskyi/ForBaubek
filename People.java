package customclasses;

public class People {
	public static void main(String[] args) {
		Person p1=new Person();
	    p1.name="Mike";
	    p1.age=45;
	    p1.gender='M';
	    p1.job="ElBoss";
	    p1.run(5);
	    p1.swim();
	    p1.bike();
	    p1.say(" Yo!");
	    
	    Person p2=new Person();
	    p2.name="Bob";
	    p2.age=20;
	    p2.gender='M';
	    p2.job="Caterer";
	    
	    p2.run(7);
	    p2.swim();
	    p2.bike();
	    p2.say(" Hey=)");
	    int age1=p1.getAge();
	    System.out.println("person 1 age is "+age1);
	   int num=p1.get10();
	   System.out.println(num);
	    	String r=p1.getPersonName();
	    	System.out.println(r);
	     	String pep=p1.getName();
	    	System.out.println(pep);
	    }
	}


