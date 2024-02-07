public class Rectangle{
protected int length;
protected int breadth;
Rectangle(int length,int breadth){
	this.length=length;
	this.breadth=breadth;
}
Rectangle(){}
public int area(){
  return length*breadth;
}		
public int perimeter(){
return (length+breadth)*2;
}
}
