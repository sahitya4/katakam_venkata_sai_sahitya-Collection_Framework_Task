import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        FW frame = new FW();
        System.out.println("Initially list is : "+" ");
        frame.display();
        System.out.println("Initially list size : "+frame.list_size());
        while(true)
        {
            System.out.println("List operations are :");
            System.out.println("1.Insert"+"\n"+"2.Remove"+"\n"+"3.Fetch-element");
            int option = s.nextInt();
            if(option==1)
            {
                System.out.println("Enter element to be added to list :");
                int ele = s.nextInt();
                frame.insert_element(ele);
            }
            else if(option==2)
            {
                System.out.println("Enter index to remove element from list :");
                int index1 = s.nextInt();
                if(index1<0 || index1>frame.list_size())
                {
                    System.out.println("Index Out Of Bound");
                }
                else
                {
                    frame.removing_element(index1);
                }
            }
            else if(option==3)
            {
                System.out.println("Enter index to display  element from list :");
                int index2 = s.nextInt();
                if(index2<0 || index2>frame.list_size())
                {
                    System.out.println("Index Out Of Bound");
                }
                else
                {
                    System.out.println("element is : " + frame.fetch_element(index2));
                }
            }
            else if(option==4)
            {
                continue;
            }
            else
            {
                System.out.println("Please enter valid option");
                break;
            }
            System.out.println("After performing operation size of list :"+frame.list_size());
            frame.display();
        }
    }
}
