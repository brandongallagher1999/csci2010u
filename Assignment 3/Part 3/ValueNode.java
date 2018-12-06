

public class ValueNode implements TreeNode{

  double value;


  public ValueNode(double value){
    this.value = value;
  }

  public double evaluate(){
    return value;
  }

  public void print(int depth){
   System.out.print(this.evaluate());

  }

}
