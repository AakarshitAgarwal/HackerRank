public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    
    if(node==null){
        return null;
    }
    
    Node lnn =transBackFromLeftClonedTree(node.left.left);
    Node rnn =transBackFromLeftClonedTree(node.right);
    
    node.left=lnn;
    node.right=rnn;
    
    return node;
    
  }