package lesson2;

public class SLList<LochNess> {
    private class StuffNode{
        public LochNess item;
        public StuffNode next;
        public StuffNode(LochNess i, StuffNode n)
        {
            item = i;
            next = n;
        }
    }
    private StuffNode sentinel;
    private int size;
    private LochNess initsent;
    public SLList()
    {
        sentinel = new StuffNode(initsent, null);
        size = 0;
    }
    public SLList(LochNess x)
    {
        sentinel = new StuffNode(initsent, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }
    public void addsllist(LochNess x)
    {
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }
    public void insertlist(LochNess new_x,LochNess wf_x)
    {
        StuffNode p ,new_node;
        p = sentinel.next;
        new_node = new StuffNode(new_x, null);
        for(;p != null;p=p.next)
        {
            if(p.item == wf_x)
            {
                new_node.next = p.next;
                p.next = new_node;
            }
        }
        size+=1;
    }
    public LochNess getsllist()
    {
        return sentinel.next.item;
    }
    public void printlist()
    {
        StuffNode p;
        p = sentinel.next;
        if(p == null)
        {
            System.out.println("empty List!");
        }
        for(int i = 0;p!= null;p = p.next,i++)
        {
            System.out.println("list "+i+" item :"+p.item);
        }
    }
    public void addlast(LochNess x)
    {
        StuffNode p;
        p = sentinel;
        while(p.next !=null)
        {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
        size+=1;
    }
    /*Return the length of List.*/
    public int listsize()
    {
        return size;
    }
}
