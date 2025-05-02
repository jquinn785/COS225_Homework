public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();

        tree.root.setElement('-');
        tree.root.insertLeft('e');
        tree.root.insertRight('t');

        TreeNode<Character> eNode = tree.root.getLeft();
        eNode.insertLeft('i');
        eNode.insertRight('a');

        TreeNode<Character> tNode = tree.root.getRight();
        tNode.insertLeft('n');
        tNode.insertRight('m');

        TreeNode<Character> iNode = eNode.getLeft();
        iNode.insertLeft('s');
        iNode.insertRight('u');
        
        TreeNode<Character> aNode = eNode.getRight();
        aNode.insertLeft('r');
        aNode.insertRight('w');

        TreeNode<Character> nNode = tNode.getLeft();
        nNode.insertLeft('d');
        nNode.insertRight('k');

        TreeNode<Character> mNode = tNode.getRight();
        mNode.insertLeft('g');
        mNode.insertRight('o');

        TreeNode<Character> sNode = iNode.getLeft();
        sNode.insertLeft('h');
        sNode.insertRight('v');

        TreeNode<Character> uNode = iNode.getRight();
        uNode.insertLeft('f');
        uNode.insertRight('-');

        TreeNode<Character> rNode = aNode.getLeft();
        rNode.insertLeft('l');
        rNode.insertRight('-');

        TreeNode<Character> wNode = aNode.getRight();
        wNode.insertLeft('p');
        wNode.insertRight('j');

        TreeNode<Character> dNode = nNode.getLeft();
        dNode.insertLeft('b');
        dNode.insertRight('x');

        TreeNode<Character> kNode = nNode.getRight();
        kNode.insertLeft('c');
        kNode.insertRight('y');

        TreeNode<Character> gNode = mNode.getLeft();
        gNode.insertLeft('z');
        gNode.insertRight('q');

        TreeNode<Character> oNode = mNode.getRight();
        oNode.insertLeft('-');
        oNode.insertRight('-');

        System.out.println(tree.preOrder(tree.root));
        System.out.println(tree.postOrder(tree.root));

        String str = "The quick fox";
        String morse = tree.englishToMorse(str);
        System.out.println(morse);
        System.out.println(tree.morseToEnglish(morse));

    }
}
