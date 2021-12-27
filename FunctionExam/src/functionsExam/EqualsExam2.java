package functionsExam;
class Person{
	long id;
	
	public boolean equals (Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
			//obj가 object타입이므로 id값을 참조 하기 위해서는 person 
			
		}else {
			return false; //타입이 Person 이 아니면 값을 비교할 필요가 없다.
		}
	}
		Person(long id){
			this.id = id;
		}
	}


public class EqualsExam2 {

	public static void main(String[] args) {
	
     Person p1 = new Person(8011021111222L);
     Person p2 = new Person(8011081111222L);
     
     if (p1 == p2) // == 는 주소값을 비교한다.
    	 System.out.println("p1과 p2는 같은 사람 입니다.");
     else                                          //결과 p1과 p2는 다른사람 입니다.
    	 System.out.println("p1는 p2는 다른 사람 입니다.");
     
     if(p1.equals(p2)) //그 값 자체만을 비교한다.
    	 System.out.println("p1과 p2는 같은 사람 입니다.");
     else                                         //결과 p1과 p2는 같은 사람 입니다.
    	 System.out.println("p1과 p2는 다른 사람 입니다.");
     
     
     System.out.println(p1.hashCode());
     System.out.println(p2.hashCode());
     
     String str1 = new String("abc");
     String str2 = new String("abc");
     String str3 = "abc";
     
     System.out.println(str1.equals(str2));  //true 문자비교 .equals
     System.out.println(str1.equals(str3));
     
     System.out.println(str1 == str2);   //false 
     System.out.println(str1 == str3);
     
     System.out.println(System.identityHashCode(str1));
     System.out.println(System.identityHashCode(str2));
     System.out.println(System.identityHashCode(str3));
     
        //String 은 문자열의 내용이 같으면 동일한 해시코드를 반환  hashcode() 
        //반면에  System.identityHashCode()는 객체의 주소값으로 해시코드를 생성하기 때문에
        //모든 객체에 때해 항상 다른 해시코드 값이 반환된다. 
     
     }


	}


