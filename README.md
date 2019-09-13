# ProgramScheduling

CSC 401 (Design and Analysis of Algorithms) Project I - California State University, Dominguez Hills

### Project Problem:

  Implement the greedy algorithms for Interval Scheduling and Interval Partitioning using heapsort and priority queue. Both algorithms 
require sorting, which should be done through heapsort (implement the heapsort algorithm yourself shown on PPT slide 60 of Chapter 2 
Basics of Algorithm Analysis), and priority queue should be used to improve the efficiency of the greedy algorithm for Interval 
Partitioning (PPT slide 29 of Chapter 4 Greedy Algorithms). Also, your program should randomly generate n intervals within time range 
[sTime;eTime], these three parameters should be received from keyboard. For example, user may want to randomly generate 10 intervals
within the time range [5;30], then we know n = 10, sTime = 5 and eTime = 30.

After execution, your program should have the following three print outs:
  1. the randomly generated intervals
  2. the set of mutually compatible intervals of maximum possible size for Interval Scheduling
  3. the minimum number of classrooms needed to schedule all intervals and the intervals in each classroom for Interval Partitioning
