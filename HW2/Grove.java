public class Grove {
    public Tree trees[];
    public String name;

    public Grove(String name, int numOfTrees){
        this.name = name;
        trees = new Tree[numOfTrees];
    }

    public int addTree(Tree tree){
        for (int i = 0; i < trees.length; i++){
            if (trees[i] == null){
                trees[i] = tree;
                return i;
            }
        }
        return -1;
    }

    public Tree removeTree(int treeNum){
        Tree tmpTree = trees[treeNum];
        trees[treeNum] = null;
        return tmpTree;
    }

    @Override
    public String toString(){
        String outStr = "";
        int numTrees = 0;
        for (int i = 0; i < trees.length; i++){
            if (trees[i] != null){
                numTrees += 1;
            }
        }
        return outStr + "Number of Trees: " + numTrees;
    }
}
