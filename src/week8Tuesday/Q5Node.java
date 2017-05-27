package week8Tuesday;

public class Q5Node {

	private int mul,power;
	private Q5Node next;
	
	public Q5Node(int mul,int power)
	{
		this.mul=mul;
		this.power=power;
		this.next=null;
	}
	public Q5Node(int mul,int power,Q5Node next)
	{
		this.mul=mul;
		this.power=power;
		this.next=next;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Q5Node getNext() {
		return next;
	}
	public void setNext(Q5Node next) {
		this.next = next;
	}
	

}
