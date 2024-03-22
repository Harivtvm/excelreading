package Excelread;

public class Stu {
String name;
int id;
Add a;
Stu(String name,int id,Add a){
	this.name=name;
	this.id=id;
	this.a=a;}
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(a.place);
		System.out.println(a.city);
	}

	public static void main(String[] args) {
		Add ob1=new Add("tvm","kerala");
	Stu obj=new Stu("hari",101,ob1);
obj.display();
	
			

	}

}
