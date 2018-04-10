package net.archiloque.picross;

/**
 * Run the picross and output the result, see the readme for an example
 *
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public class Main {

    public static void main(String[] args) {
        int[][] linesBlocks = splitBlocks(args[0]);
        int[][] columnsBlocks = splitBlocks(args[1]);
        Grid grid = new Grid(linesBlocks, columnsBlocks);
        grid.process();
        System.out.println(grid.toString());
    }

    private static int[][] splitBlocks(String blocks){
        String[] splittedBlocks = blocks.split(";");
        int[][] result = new int[splittedBlocks.length][];
        for(int i = 0; i < splittedBlocks.length; i++) {
            String[] items = splittedBlocks[i].split(",");
            result[i] = new int[items.length];
            for(int j = 0; j < items.length; j++) {
                result[i][j] = Integer.parseInt(items[j]);
            }
        }
        return result;
    }
}
