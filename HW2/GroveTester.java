public class GroveTester {
    public static void main(String[] args){
        Grove grove1 = new Grove("Grove 1", 16);
        System.out.println(grove1);

        for (int i = 0; i < 6; i++){
            Tree tree = new Tree(i + 1, 37, "Spruce");
            grove1.addTree(tree);
        }
        System.out.println(grove1);

        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1);

        Tree tree1 = new Tree(7, 13, "Maple");
        grove1.addTree(tree1);
        System.out.println(grove1);
    }
}