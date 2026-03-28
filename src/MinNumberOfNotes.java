//greedy approach minimum nuber is 348 notes given 100,50,20,10,5,2,1 o/p should be 
//3 of 100,1 of 20,2 of 10,1 of 5,1 of 2,1 of 1
public class MinNumberOfNotes {
    public static void main(String[] args) {
        int amount =348;
        int[] notes={100,50,20,10,5,2,1};
        int count=0;
        for(int note: notes)
        {
       if(amount>=note)
       {
        int num =amount/note;
        count=count+num;
        amount=amount % note;
        System.out.println(note+"->"+num);
       }
        }
        System.out.println("Minimum number of notes are= " + count);
    }
    
}
