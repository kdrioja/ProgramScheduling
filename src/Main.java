import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     Given a sorted list of already scheduled programs and a
     list of new programs, write an algorithm to find if the
     given new programs can be scheduled or not? Each program
     is a pair of values where 1st value is the starting time
     and 2nd is the execution time.
     */

    /**
     If we actually need to add and merge valid new programs,
     I think that only a binary tree will work here (TreeMap in
     java). So if we add a new program one by one, it will be
     O(log n) complexity for each program. Using a regular array
     wouldn't be good because you need to insert a program in the
     middle and shift other elements to the right which will be
     O(n), this is worse than O(log n).

     For your example:
     (18,7), you search the highest element lower than 18, it is
     (10,5), then you search the lowest element higher than 18,
     it is (25, 15).
     Then you check if 10+5 <= 18 and 18+7 <= 25, it is true, then
     you add this node to the binary tree (O(logn)) and return true.
     (12,10), you search the highest element lower than 12, it is
     (10,5), then you search the lowest element higher than 12, it
     is (18, 7).
     Then you check 10+5 <= 12 and 12+10 <= 18, it is false. Then
     you just return false.
     */

    /**
     Understand:
     - Will the start time ever be negative?
     - Will the new programs list be sorted?
     - Can I use extra space?

     scheduled = [P1(5, 6), P2(20, 9)], newPrograms = [P3(1, 2), P4(

     Match:
     - Interval problems

     Plan/Psudocode:
     - First create the return list with the same size of
     newPrograms
     - for loop to go through all of the Program objects in
     the newPrograms list
     check if program fits into it and append result into
     */

    public static void main(String[] args) {
        Program p1 = new Program(10, 5);
        Program p2 = new Program(25, 25);

        List<Program> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);


    }

    public static boolean[] schedule(List<Program> scheduled, List<Program> newPrograms) {
        boolean[] result = new boolean[newPrograms.size()];

        for (int i = 0; i < newPrograms.size(); i++) {
            Program current = newPrograms.get(i);

            //if we check the scheduled list linearly then we will have an O(n^2)
            //run time
            
        }
        return result;
    }
}
