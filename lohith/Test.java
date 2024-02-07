public class Test {
	public static void main(String args[]){
	 Rectangle  rec = new Rectangle(2,3);
	System.out.println("Area = "+rec.area()+"  Perimeter =   "+rec.perimeter());
	Rectangle sq=new Square(5);

 	System.out.println("Area = "+sq.area()+"  Perimeter =   "+sq.perimeter());

	System.out.println("double Area = "+((Square)sq).doubleArea()); //typecasting
}
}