public class Square extends Rectangle{
	private int side;
 Square(int side){
	super(side,side);
}
Square(){}
public int doubleArea(){
	return 2*area();
}
@Override
public int area(){
	return (super.length+1)*(super.breadth+1);
}	
}