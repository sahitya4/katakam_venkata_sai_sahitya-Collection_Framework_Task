import java.util.*;
public class FW
{
    ArrayList<String> alist=new ArrayList<String>();
    FW()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements initially :);
        for(int i=0;i<10;i++)
        {
            alist.add(sc.next());
        }
    }
    public void insert_element(int element)
    {
        alist.add(String.valueOf(element));
    }
    public void display()
    {
        System.out.println(alist);
    }
    public void removing_element(int index)
    {
        alist.remove(index);
    }
    public String fetch_element(int index)
    {
        return String.valueOf(alist.get(index));
    }
    public int list_size()
    {
        return alist.size();
    }
}
