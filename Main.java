class Main {
  public static void main(String[] args) {
Snack s1 = new Snack(true, true, false, 22, 3);
Cookie c1 = new Cookie(false, true, false, 66, 2);
    Chips Ch1 = new Chips(false, false, true, 44, 1);

    System.out.println("\nPrinting in the following order, SNACK, COOKIE, CHIP\n");

    System.out.println("\nPrinting total num of items\n");
   

    System.out.println(s1.totalNumOfItems());
    System.out.println(c1.totalNumOfItems());
    System.out.println(Ch1.totalNumOfItems());

     System.out.println("\nPrinting if it is salty\n");

    System.out.println(s1.getIsSalty());
    System.out.println(c1.getIsSalty());
    System.out.println(Ch1.getIsSalty());

     System.out.println("\nPrinting if it is sweet\n");

    System.out.println(s1.getIsSweet());
    System.out.println(c1.getIsSweet());
    System.out.println(Ch1.getIsSweet());

     System.out.println("\nPrinting if it is crunchy\n");

    System.out.println(s1.getIsCrunchy());
    System.out.println(c1.getIsCrunchy());
    System.out.println(Ch1.getIsCrunchy());
    

    

    
    System.out.println("\nIs the cookie cooked correctly? -- "+c1.getIsCooked());
    System.out.println("\n\nChip is stale? -- "+Ch1.getIsStale());
    
    
  }
}