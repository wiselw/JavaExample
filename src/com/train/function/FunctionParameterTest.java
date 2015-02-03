package com.train.function;
/**
 * Java中参数传递的都是值:对应基本类型,传递的是原值的拷贝;
 *                   对于类类型,传递的是引用即地址的拷贝.
 * 对于函数对参数的改变是否会影响原值的问题:值类型自然不会影响到原值.
 *                                对于类类型要看改变的是参数的地址还是值,
 *                                如果是前者,参数和原引用指向了不同的地址,它们自然脱离了关系;
 *                                如果是后者,修改的实例就是原引用指向的实例,这当然对原值进行了修改.
 * @author weiliang
 *
 */
public class FunctionParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		StringParameter(str);
		System.out.println("str:"+str);
		int i=2;
		System.out.println("i:"+i);	
		Persion persion=new Persion("嘎子","男");
		ObjectParameter(persion);
		System.out.println("persion:"+persion);	
		ObjectParameter1(persion);
		System.out.println("persion:"+persion);	
	}
	public static void StringParameter(String param){
		param+="!";
	}
	public static void IntParameter(int param){
		param+=1;
	}
	public static void ObjectParameter(Persion persion){
		persion.setName("大龙");
		System.out.println(persion);
	}
	public static void ObjectParameter1(Persion persion){
		persion=new Persion("郭敬明", "男");
		System.out.println(persion);
	}
	public static class Persion{
		private String name;
		private String gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Persion(String name,String gender){
			this.name=name;
			this.gender=gender;
		}
		public String toString(){
			return "name:"+getName()+";gender:"+getGender();
		}
		
	}
}
