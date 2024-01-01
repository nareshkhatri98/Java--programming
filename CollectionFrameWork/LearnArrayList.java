package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static  void main(String [] args)
    {
//        String[] Persons = new String[30];
//        Persons[0] ="Ram";
//        Persons[2] ="Hari";
//        Persons[3] = "sita";
//        Persons[29] = "aa";
//       //new persons
//      //  Persons[30] = "Raman"; This is not possible...
//


        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(3);  // here the add function is used to add the elements on the array list....
         list.add(5);
         list.add(9);
        System.out.println(list);
        /* To traverse of display the elements */
        for( int i =0; i< list.size(); i++)
        {
            System.out.println("the element is " + list.get(i));
            System.out.println("the length of the list is " + list.size());
        }
        // using for each loop.
        for(Integer element: list)
        {
            System.out.println("foreach elements of array is " +element);
        }

        // using iteration..
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("iterators  is " +it.next());
        }

        list.add(6); // here 6 will be added end of the list
        System.out.println(list);
        list.add(1, 50); // the 50 will be added at the position of 1st index..
        System.out.println(list);

        list.set(2, 1000); // the set() function is used to update the elements of the list.
        System.out.println(list);

        System.out.println(list.contains(500)); /* The contains() function is used to checks the elements is presents or
        in the list. It returns ture/false. */


        // we can easily add the element the one list to another list with the helps of the addAll function.
        //creating new list
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        //now we add the all elements of the new list into old list...
        list.addAll(newList); // this will add all element of new list into old list.
        // also the element of new elements are add at the end of the list.
        System.out.println(list);

        // the get() function is used to get the particular elements which is contains the list
        System.out.println(list.get(1));

        // the remove() function is used to remove the elements of the list.
        list.remove(0); // this will remove the element of the index =>0.
        System.out.println(list);

        list.remove(Integer.valueOf(150)); // this line remove the particular elements from the list.(it remove 150 from the list)
        System.out.println(list);
        list.clear(); // this will remove the all elements of the list. i.e. list is empty.
        System.out.println(list);
    }


}
