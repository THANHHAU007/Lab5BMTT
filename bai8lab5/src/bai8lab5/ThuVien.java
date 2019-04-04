package bai8lab5;


import java.math.BigInteger;
public class ThuVien  {
   static class Keys{    
    BigInteger n = new BigInteger("9617");   
    BigInteger d = new BigInteger("3869");   
    BigInteger e = new BigInteger("17"); 
    }//end inner class Keys 
    String encode(String message) 
    {    
        byte[] textChars = message.getBytes();   
        String temp = "";   
        String encodedMsg = "";    
        //Build the encoded text string two numeric    
        // characters at a time.  Each message   
        // character is converted into two numeric     
        // characters according to the relationships    
        // given above.   
        for(int cnt = 0; cnt < message.length();cnt++){    
            temp = String.valueOf(textChars[cnt] - ' ');     
            //Convert all single-character numeric    
            // values to two characters with a leading    
            // zero, as in 09.                 if(temp.length() < 2) temp = "0" + temp;   
            encodedMsg += temp;    }//end for loop   
            return encodedMsg;  
        }//end encode 
    //---------- 
     String decode(String encodedMsg){  
         String temp = "";    
         String decodedText = "";    
         for(int cnt = 0; cnt < encodedMsg.length(); cnt += 2){     
             temp = encodedMsg.substring(cnt,cnt + 2);     
             //Convert two numeric text characters to a    
             // value of type int.     
             int val = Integer.parseInt(temp) + 32;    
             //Convert the ASCII character values to       
             // numeric String values and build the      
             // output String one character at a time. 
           decodedText += String.valueOf((char)val);    
     }  
return decodedText;   
} 
  
     String doRSA(String inputString,BigInteger exp,BigInteger n,int blockSize){   
         BigInteger block;    
         BigInteger output;    
         String temp = "";    
         String outputString = "";  
         //Iterate and process one block at a time.   
         for(int cnt = 0; cnt < inputString.length();cnt += blockSize){   
             //Get the next block of characters      
             // and encapsulate them in a BigInteger    
             // object.      
             temp = inputString.substring(cnt,cnt + blockSize);    
             block = new BigInteger(temp);      
             //Raise the block to the power exp, apply      
             // the modulus operand n, and save the                  // remainder.  This is the essence of the     
             // RSA algorithm.   
             output = block.modPow(exp,n);    
             //Convert the numeric result to a      
             // four-character string, appending leading     
             // zeros as necessary.      
             temp = output.toString();    
             while(temp.length() < blockSize){  
                 temp = "0" + temp;      
             }//end while    
             //Build the outputString blockSize    
             // characters at a time.  Each character   
             // in the inputString results in one   
             // character in the outputString. 
             outputString += temp;  
         }   
           return outputString;  
    } 
}
