package nomer1;
public class Node {
    /*
    a) B merupakan predesor dari A dan C
    b) A dan C merupakan succesor dari B
    c) B dan D merupakan ancestor dari C atau A
    d) B dan C merupakan descendent dari D
    e) B merupakan parent dari C
    f) C merupakan child dari B
    g) A dan C adalah sibling, E dan G adalah sibling
    h) subtree B,A,C dan subtree F,E,G
    */
    char data;
    Node left;
    Node right;
    public Node(char data){
        this.data = data;
    }
}
