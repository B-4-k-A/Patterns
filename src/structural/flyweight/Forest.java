package structural.flyweight;

import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees = new ArrayList<>();

    public void addTree(Tree tree) {
        if(!trees.contains(tree)) {
            trees.add(tree);
        }
    }

    public void draw() {
        for(Tree tree : trees) {
            tree.draw();
        }
    }
}
