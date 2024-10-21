public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Travessia em ordem da arvore binaria:");
        tree.inorder();

        int searchValue = 40;
        System.out.println("\n\nBuscando valor " + searchValue + " na arvore:");
        System.out.println(tree.search(searchValue) ? "Valor encontrado!" : "Valor não encontrado!");
    }
}