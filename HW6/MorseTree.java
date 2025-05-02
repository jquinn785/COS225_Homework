public class MorseTree{
    public TreeNode<Character> root;
    public String[] map = {
        "e", "o", "t", "-", "i", "o o", "a", "o -", "n", "- o", "m", "- -", "s", "o o o", "u", "o o -", "r", "o - o", "w", "o - -", "d", "- o o", "k", "- o -", "g", "- - o", "o", "- - -", "h", "o o o o", "v", "o o o -", "f", "o o - o", "l", "o - o o", "p", "o - - o", "j", "o - - -", "b", "- o o o", "x", "- o o -", "c", "- o - o", "y", "- o - -", "z", "- - o o", "q", "- - o -"
    };

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

    public String englishToMorse(String english){
        String outStr = "";
        english = english.toLowerCase();
        english = english.replaceAll("\\s", "");
        for (int i = 0; i < english.length(); i++){
            char ch = english.charAt(i);
            for (int j = 0; j < map.length; j += 2) {
                if (ch == map[j].charAt(0)) {
                    outStr += map[j + 1] + " | ";
                }
            }
        }
        return outStr;
    }

    public String morseToEnglish(String morse){
        String outStr = "";
        String[] morseSegments = morse.split(" \\| ");
        for (int i = 0; i < morseSegments.length; i++) {
            for (int j = 1; j < map.length; j += 2){
                if (morseSegments[i].equals(map[j])){
                    outStr += map[j - 1];
                }
            }
        }
        return outStr;
    }
}  
