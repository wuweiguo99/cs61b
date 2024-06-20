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
    public void printlist()
    {
        IntNode p;
        
        p = this.first;
        for(int i = 0;p!= null;p = p.Next,i++)
        {
            System.out.println("list"+i+" item :"+p.item);
        }
    }
    public void addlast(int x)
    {
        IntNode p;
        p = first;
        while(p.Next !=null)
        {
            p = p.Next;
        }
        p.Next = new IntNode(x, null);
    }
    public static void main(String[] args)
    {
        Sllist  L = new Sllist(10);
        L.addsllist(15);
        L.addsllist(5);
        int r = L.getsllist();
        L.printlist();
        L.addlast(20);
        L.printlist();
        System.out.println("L.item:"+r);

    }
}
