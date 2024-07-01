package lesson3;

public class DList {
    //the node of list
    private  class StaffNode
    {
        public StaffNode front;
        public  int item;
        public StaffNode next;
        public StaffNode(StaffNode f, int im, StaffNode n)
        {
            front = f;
            item = im;
            next = n;
        }     
    }
    private StaffNode sentinel;
    private int size;
    
}
