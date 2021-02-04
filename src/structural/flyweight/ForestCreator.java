package structural.flyweight;

import java.util.Random;

public class ForestCreator {
    public static void main(String[] args) {
        Forest forest = new Forest();
        TextureFactory textureFactory = new TextureFactory();
        Random rand = new Random();

        int windowSize = 1000;
        int maxHighOfTree = 25;
        int maxSizeOfTree = 10;


        for (int i = 0; i < 100000; i++) {
            Tree appleTree = new Tree(
                    rand.nextInt(windowSize),
                    rand.nextInt(windowSize),
                    rand.nextInt(maxHighOfTree),
                    rand.nextInt(maxSizeOfTree),
                    textureFactory.getTexture("apple"));
            Tree orangeTree = new Tree(
                    rand.nextInt(windowSize),
                    rand.nextInt(windowSize),
                    rand.nextInt(maxHighOfTree),
                    rand.nextInt(maxSizeOfTree),
                    textureFactory.getTexture("orange"));
            Tree apricotTree = new Tree(
                    rand.nextInt(windowSize),
                    rand.nextInt(windowSize),
                    rand.nextInt(maxHighOfTree),
                    rand.nextInt(maxSizeOfTree),
                    textureFactory.getTexture("apricot"));
            forest.addTree(appleTree);
            forest.addTree(orangeTree);
            forest.addTree(apricotTree);
        }

        forest.draw();
        /* In conclusion, we can have so many tree with some texture
        * There are 3 types of texture and we use them in tree by address
        * so in result tree(x, y, high, size, addressOfTexture)
        * int + int + int + int + 8 = 40b
        * and sizeOfTexture, for example, 20Kb
        * So our forest get memory:
        * 40b * 100000 = 4000000b = 4Mb (near)
        * 20Kb * 3 = 60Kb
        * 60Kb + 4Mb = 4.60Mb*/
    }
}