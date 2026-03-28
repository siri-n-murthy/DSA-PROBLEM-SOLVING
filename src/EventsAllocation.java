
import java.util.Arrays;
import java.util.PriorityQueue;

public class EventsAllocation {
    public static int minEventStages(int[][] events) {
        // Implementation for minimum event stages
        if (events.length==0){
            return 0;
        }
        Arrays.sort(events, (a, b) -> a[0] -b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(events[0][1]);// initial value 11

        for(int i =1;i<events.length;i++)
        {
            if(events[i][0]>=pq.peek()) 
            {
                pq.poll();
            }
            pq.add(events[i][1]);
        }
        return pq.size();
    }
     public static void main(String[] args) {
        {
            int[][] events={{7,11},{9,13},{0,5}};
            System.out.println(minEventStages(events));
        }
    }
}
