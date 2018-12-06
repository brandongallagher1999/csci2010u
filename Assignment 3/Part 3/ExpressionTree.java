

public class ExpressionTree{

  TreeNode root;

  public ExpressionTree(TreeNode node){
    this.root = node;
  }

  public double evaluate(){
    return root.evaluate();
  }

  public void print(){

    root.print(0);
    //root.evaluate();


  }




}
