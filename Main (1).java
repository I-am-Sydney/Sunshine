class Main{
  public static void rain(){
    System.out.print("gloomy");
  }
  public static void seeds(int flowers){
    if(flowers > 6){ // changed the num of flowers
      System.out.print(" \uD83C\uDF38");
      flowers -=1;
      seeds(flowers);
    }
  
  }
  public static void main(String[] args){
    rain();
    seeds(8);
  }
}
