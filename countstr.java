public class countstr {
  public static void main(String[] args) {
   String str ="harrypotter";
    int count[] = new int [256];
      for (int i = 0; i < str.length(); i++) 
          count[str.charAt(i)]++;
          int m =-1;
        char result = ' ';
        for(int i =0; i<str.length(); i++){
            if(m<count[str.charAt(i)] ){
              m = count[str.charAt(i)];
            }
        }
        System.out.println(result);


  }  
}
