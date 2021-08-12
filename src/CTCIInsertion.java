public class CTCIInsertion {
    public static void main(String[] args) {
        try{
            CTCIInsertion obj = new CTCIInsertion();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Prints the result of inserting M into N between position j and i
        System.out.println(insertMIntoN("10011","10000000000",6,2));
    }
    public String insertMIntoN(String m,String n,int j,int i){
        int mNum = Integer.parseInt(m,2) << i;
        int clearMask = ~((~(-1 >>> (j-i+1))) >>> ((32-i) - (j-i+1)));
        int nNum = Integer.parseInt(n,2) & clearMask;
        return Integer.toString(nNum|mNum,2);
    }
}