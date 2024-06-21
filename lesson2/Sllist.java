package lesson2;



public class Sllist {
    private IntNode first;
    private int size;
    public Sllist()
    {
        first = null;
        size = 0;
    }
    public Sllist(int x)
    {
        first = new IntNode(x, null);
        size = 1;
    }
    public void addsllist(int x)
    {
        first = new IntNode(x, first);
        size += 1;
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
        size+=1;
    }
    /*Return the length of List.*/
    public int listsize()
    {
        return size;
    }

    public static void main(String[] args)
    {
        Sllist  L = new Sllist();
        L.addsllist(15);
        L.addsllist(5);
        int r = L.getsllist();
        L.printlist();
        L.addlast(20);
        L.printlist();
        System.out.println("L.item:"+r);
        System.out.println("L size:"+ L.listsize());

    }
}
