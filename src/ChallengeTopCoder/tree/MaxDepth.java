package ChallengeTopCoder.tree;//package tree;

//public class MaxDepth {
//    static <Node> int maxDepth(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return 1 + Math.max(left, right);
//    }
//
//    public static void main(String[] args) {
//        tree.BinaryTree tree = new tree.BinaryTree();
//        String[] elements = { "1", "2", "3", "4", "N", "N", "6", "7", "8", "N", "N", "9" };
//        tree.levelOrderInsert(elements);
//        System.out.println("\nHeight of the Tree");
//        tree.printLevelOrderWithNulls();
//        System.out.println(maxDepth(tree.root));
//    }
//}


public class MaxDepth {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1}
        };
        System.out.println(rowWithMax1s(matrix, 2, 7 ));

    }
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int minIndex = -1;
        int max = -1;

        for (int i = 0; i < n; i++) {
            int count = -1;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                minIndex = i;
            }
            if (count == n) {
                break;
            }
        }

        return minIndex;
    }
}