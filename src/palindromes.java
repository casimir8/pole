/*Idriss Mahamat

import java.util.Scanner;


public class Palindrome {
pubic Static void main(String[] args){
    public char [] tab ;
    public String p;
    public Palindrome (String s){
        p =s.replaceAll(" ", " ");
        tab=p.toCharArray();  
    }
      public void isPalindrome (){
      int x=0;
      int y=p.length()-1;
      while (y>x && tab[x]==tab[y]){
         x++;
         y--;
      } 
        if(y<=x)
            System.out.println("Votre chaine est Palindrome");
             else
            System.out.println("Votre chaine n est pas  Palindrome");
      }
        public static void main(String argv []){
        Scanner sc=new Scanner (System.in);
        System.out.println("Veuillez saisir le Palindrome a tester :");
        String str =sc.nextLine();
         System.out.println("Vous avez saisi :"+str);
         Palindrome m=new Palindrome(str);
         m.isPalindrome();
        
        }
    
}
