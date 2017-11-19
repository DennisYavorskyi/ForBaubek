package customclasses;

public class Person {
   String name;
   String person;
   int age;
   char gender;
   String job;
   public void say(String words) {
	   System.out.println(words);
   }
   public void run(int miles) {
	   System.out.println(name+" is running " +miles+ " miles");
   }
	public void swim() {
		System.out.println(name+" is swimming");
				      }
	public void bike() {
		System.out.println(name+" is biking");
	}
	public int getAge() {
        System.out.println("getting age ");
	
    return age;
	}
	public int get10(){
	System.out.println("=");
	return 10;
	}
	public String getPersonName() {
		System.out.println("What is the name? " );
		return  name;
	}
	public String getName() {
	return "person" ;
	}
	}
