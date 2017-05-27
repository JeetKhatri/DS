package Exam.Q3;


public class q2Method {

	int stack[] = new int[50];
	int temp[] = new int[50];
	int top=-1,toptemp=-1;
	public void add(int no) {
		if(top==-1 || no <= stack[top]){
			System.out.println("ok");
			top++;
			stack[top]=no;
		}else{
			while(no > stack[top] && top!=0){
				int n = stack[top];
				top--;
				toptemp++;
				temp[toptemp]=n;
			}
			top++;
			stack[top]=no;
			while(toptemp!=-1){
				int n = temp[toptemp];
				toptemp--;
				top++;
				stack[top]=n;
			}
		/*	if(no > stack[top]){
				int n = stack[top];
				top--;
				toptemp++;
				temp[toptemp]=n;
				top++;
				stack[top]=no;
				top++;
				stack[top]=n;
			}*/
		}
	}
	public void pop(){
		if(top!=-1)
		top--;
	}
	public String findMin() {
		if(top!=-1)
			return stack[top]+"";
		else
			return "Empty stack";
	}
}
