package lesson2;



public class Sllist {
    private IntNode sentinel;
    private int size;
    public Sllist()
    {
        sentinel = new IntNode(13, null);
        size = 0;
    }
    public Sllist(int x)
    {
        sentinel = new IntNode(13, null);
        sentinel.Next = new IntNode(x, null);
        size = 1;
    }
    public void addsllist(int x)
    {
        sentinel.Next = new IntNode(x, sentinel.Next);
        size += 1;
    }
    public int getsllist()
    {
        return sentinel.Next.item;
    }
    public void printlist()
    {
        IntNode p;
        p = sentinel.Next;
        if(p == null)
        {
            System.out.println("empty List!");
        }
        for(int i = 0;p!= null;p = p.Next,i++)
        {
            System.out.println("list "+i+" item :"+p.item);
        }
    }
    public void addlast(int x)
    {
        IntNode p;
        p = sentinel;
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
        L.addlast(20);
        L.printlist();
        System.out.println("L size:"+ L.listsize());
    }
}
