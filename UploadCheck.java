public class UploadCheck {

    public void uploadFile(int size, String type) throws FileSizeException, InvalidFormatException{
        if (size > 5){
            throw new FileSizeException("File is too large");
        }
        else if (!type.equals("jpg")){
            throw new InvalidFormatException("Only .jpg files are supported");
        }
        System.out.println("Upload successful");
    }

    public void process(){
        try {
            uploadFile(10, "txt");
        }
        catch (FileSizeException e1){
            System.out.println("ERROR: " + e1.getMessage());
        }
        catch (InvalidFormatException e2){
            System.out.println("ERROR" + e2.getMessage());
        }
    }
}
