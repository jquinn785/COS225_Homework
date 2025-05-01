public class MorseTree extends TreeNode<Character> {
    public TreeNode<Character> root;

    public MorseTree(){
        this.root = new TreeNode<>(null);
    }

    // Uses the structure of the preorder function from TreeNode.java
    public String preOrder(TreeNode<Character> node){
        String outStr = "";
        if (node == null) {
            return "";
        }
        outStr += node.getElement() + " ";
        outStr += preOrder(node.getLeft());
        outStr += preOrder(node.getRight());
        return outStr;
    }

    // Uses the structure of the postorder function from TreeNode.java
    public String postOrder(TreeNode<Character> node){
        String outStr = "";
        if (node == null) {
            return "";
        }
        outStr += postOrder(node.getLeft());
        outStr += postOrder(node.getRight());
        outStr += node.getElement() + " ";
        return outStr;
    }

    public String englishToMorse(){

    }

    public String morseToEnglish(){

    }
}
