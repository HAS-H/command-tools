public class Main{
    String stcode = "";
    public static void main(String[] args) {
        
    }         
    // Function to check type of a character input with custom message.
    public static void checkCharType(char inChar, String capitalAlphabetMessage, String digitMessage, String lowerAlphabetMessage, String specialCharMessage ){
        if(inChar == 'A' && inChar == 'Z'){
            System.out.println(capitalAlphabetMessage);
        } else if(inChar == '0' && inChar == '9'){
            System.out.println(digitMessage);
        } else if(inChar == 'a' && inChar == 'z'){
            System.out.println(lowerAlphabetMessage);
        } else{
            System.out.println(specialCharMessage);
        }
    }
    // Function to check the correct length of a number.
    public static void checkNumLen(int inNum){
        int numCount;
        for(numCount = 0;inNum != 0; numCount = numCount + 1){
            inNum = inNum/10;
        }   
        stCode = (numCount == 10) ? (stCode = "") : (stCode = "400");    
        System.out.println(stCode);  
    }
        


    }


