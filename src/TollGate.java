public class TollGate {
    
    public static boolean check(char[][] way,String path){
        int rows=way.length;
        int cols=way[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(way[i][j]==path.charAt(0)){
                    if(dfs(way,path,0,i,j)){
                        return true;
                    }
                }            }
        }
        return false;
    }

    private static boolean dfs(char[][] way,String path,int index,int i,int j){
        if(index==path.length()){
            return true;
        }
        if(i<0||i>=way.length||j<0||j>=way[0].length||way[i][j]!=path.charAt(index)){
            return false;
        }
        char temp=way[i][j];
        way[i][j]='.';
        boolean found=dfs(way,path,index+1,i+1,j) || dfs(way,path,index+1,i-1,j) || dfs(way,path,index+1,i,j+1) || dfs(way,path,index+1,i,j-1);
        way[i][j]=temp;
        return found;
    }

    public static void main(String[] args) {
        char[][] way={
            {'A','B','C','D'},
            {'F','F','C','R'},
            {'G','I','O','N'}
        };
        System.out.println(check(way,"ABCCON"));
    }
}