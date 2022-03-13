// Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.


import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

public class MergeIntervals {

  public static List<Interval> merge(List<Interval> intervals) {
     if (intervals.size() < 2)
      return intervals;

    // sort the intervals by start time
    Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
    
    List<Interval> mergedIntervals = new LinkedList<Interval>();
    int s= intervals.get(0).start,e= intervals.get(0).end;        
    for(int i=1;i<intervals.size();i++)
    {
        if(s <= intervals.get(i).start && intervals.get(i).start < e)
            e=Math.max(intervals.get(i).end,e);
        else
        {
            mergedIntervals.add(new Interval(s,e));
            s=intervals.get(i).start;
            e=intervals.get(i).end;
        }
    }
    mergedIntervals.add(new Interval(s,e));
    return mergedIntervals;
  }

  public static void main(String[] args) {
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(6, 7));
    input.add(new Interval(2, 4));
    input.add(new Interval(5, 9));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();

    input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 6));
    input.add(new Interval(3, 5));
    System.out.print("Merged intervals: ");
    for (Interval interval : MergeIntervals.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
    System.out.println();
  }
}
