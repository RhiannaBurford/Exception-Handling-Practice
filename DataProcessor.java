public class DataProcessor {

    public void processID(int ID) throws InvalidID2Exception{
        if (ID < 0){
            throw new InvalidID2Exception("ID is not a valid number");
        }
        System.out.println("Processing ID: " + ID);
    }

    public void runBatch(){
        int[] IDs = {101, -5, 30, -2, 0, 320, 2};
        for (int i = 0; i < IDs.length; i++){
            try {
                processID(IDs[i]);
            }
            catch (InvalidID2Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
