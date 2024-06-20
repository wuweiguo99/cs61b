package lesson2;


public class Sllist {
    private IntNode first;
    public Sllist(int x)
    {
        first = new IntNode(x, null);
    }
    public void addsllist(int x)
    {
        first = new IntNode(x, first);
    }
    public int getsllist()
    {
        return first.item;
    }
    public static void main(String[] args)
    {
        Sllist  L = new Sllist(10);
        L.addsllist(15);
        L.addsllist(5);
        int r = L.getsllist();
        System.out.println("L.item:"+r);

    }
}
