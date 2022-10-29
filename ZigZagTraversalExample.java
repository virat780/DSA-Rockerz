// import statement  
import java.util.*;  
  
class TreeNode   
{  
// for holding value of the node  
int val;  
  
// for referring to the other nodes   
// left for the left child and right to the right child  
TreeNode left, right;  
  
// constructor of the class TreeNode  
// the construct initializes the class fields  
public TreeNode(int i)  
{  
val = i;  
right = left = null;  
}  
}  
class BTreeZigZag   
{  
TreeNode r;  
// method to display the  
// zigzag traversal of a binary tree  
void displayZigZagTraversal()   
{  
// if node is null then return  
if (r == null)   
{  
return;  
}  
// declaring two stacks  
// currLevel and the nextLevel stack  
Stack<TreeNode> currLevel = new Stack<TreeNode>();  
Stack<TreeNode> nextLevel = new Stack<TreeNode>();  
// push the root  
currLevel.push(r);  
boolean LtoR = true;  
// check if the stack is empty  
while (!currLevel.isEmpty())   
{  
// the node is popped out  
//  from the current level stack  
TreeNode currNode = currLevel.pop();  
// display the value of it  
System.out.print(currNode.val + " ");  
// store the data according to the current order.  
// if LtoR is true, then the traversal is from left to right  
// and if LtoR is false, then the traversal is from right to left  
if (LtoR)   
{  
if (currNode.left != null)   
{  
nextLevel.push(currNode.left);  
}  
if (currNode.right != null)   
{  
nextLevel.push(currNode.right);  
}  
}  
else   
{  
if (currNode.right != null)   
{  
nextLevel.push(currNode.right);  
}  
if (currNode.left != null)   
{  
nextLevel.push(currNode.left);  
}  
}  
if (currLevel.isEmpty())   
{  
// toggle the value of LtoR  
LtoR = !LtoR;  
// interchanging the currLevel stack   
// and the nextLevel stack  
Stack<TreeNode> stk = currLevel;  
currLevel = nextLevel;  
nextLevel = stk;  
}  
}  
}  
}  
public class ZigZagTraversalExample   
{  
// main method  
public static void main(String[] args)  
{  
// creating an object of the class BTreeZigZag   
BTreeZigZag  tree = new BTreeZigZag ();  
// root node  
tree.r = new TreeNode(18);  
// remaining nodes of the tree  
tree.r.left = new TreeNode(20);  
tree.r.right = new TreeNode(30);  
tree.r.left.left = new TreeNode(60);  
tree.r.left.right = new TreeNode(34);  
tree.r.right.left = new TreeNode(45);  
tree.r.right.right = new TreeNode(65);  
tree.r.left.left.left = new TreeNode(12);  
tree.r.left.left.right = new TreeNode(50);  
tree.r.left.right.left = new TreeNode(98);  
tree.r.left.right.right = new TreeNode(82);  
tree.r.right.left.left = new TreeNode(31);  
tree.r.right.left.right = new TreeNode(59);  
tree.r.right.right.left = new TreeNode(71);  
tree.r.right.right.right = new TreeNode(41);  
System.out.println("The zigzag traversal of the binary tree is: ");  
tree.displayZigZagTraversal();  
}  
}  
