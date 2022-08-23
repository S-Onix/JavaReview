package stream;

import java.util.ArrayList;
import java.util.List;

class Customer implements Comparable<Customer>{
	private String name;
	private int age;
	private int price;
	
	public Customer() {
		
	}
	
	public Customer(String name, int age) {
		this.name= name;
		this.age = age;
		if(age >= 15) this.price = 100;
		else this.price = 50;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name : " + name + " age : " + age + " price : " + price; 
	}
	
	@Override
	public int compareTo(Customer c) {
		return this.name.compareTo(c.getName());
	}

}

public class StreamPractice {
	public static void main(String[] args) {
		Customer c1 = new Customer("�̼���", 40);
		Customer c2 = new Customer("������", 20);
		Customer c3 = new Customer("ȫ�浿", 14);
		
		List<Customer> cList = new ArrayList<>();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		//���� ��� ���
		cList.stream().forEach(c->System.out.println(c.getName()));
		cList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		//������ �� ��� ���
		int sum = cList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sum);
		//�� �� 20�� �̻��� ����� �̸��� �����Ͽ� ���
		cList.stream().filter(c->c.getAge()>=20).sorted().forEach(c->System.out.println(c.getName()));
		cList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
