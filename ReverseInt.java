class ReverseInt{
    public static void main(String arg[]){
    int N=896;
    int reverse=0;
    while(N>0)
    {
      int rem= N%10;
       N =N/10;
       reverse=reverse*10+rem;
    }System.out.println(reverse);
   }
}
