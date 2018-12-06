

public class OpNode implements TreeNode{

  String operation;
  TreeNode left;
  TreeNode right;


  public OpNode(TreeNode left, String operation, TreeNode right){
    this.left = left;
    this.operation = operation;
    this.right = right;
  }

  public void print(int depth){
    for (int i = 0; i < depth; i++){
      System.out.print("     ");
    }
    right.print(depth+1);
    System.out.println("");


    for (int i = 0; i < depth; i++){
      System.out.print("     ");
    }
    System.out.print(this.operation);
    System.out.println("");

    for (int i = 0; i < depth+1; i++){
      System.out.print("     ");
    }
    left.print(depth+1);
    System.out.println("");
  }

  public double evaluate(){
    if (operation == "+"){
      return left.evaluate() + right.evaluate();
    }
    else if(operation == "-"){
      return left.evaluate() - right.evaluate();
    }
    else if(operation == "*"){
      return left.evaluate() * right.evaluate();
    }
    else if(operation == "/"){
      return left.evaluate() / right.evaluate();
    }
    return 0;
  }


}
