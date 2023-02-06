class Snack{
  private boolean isSalty;
  private boolean isCrunchy;
  private boolean isSweet;
  private int numItemsInPackage;
  private int numOfPackages;

public Snack(){
  isSalty = false;
  isCrunchy = false;
  isSweet = false;
  numItemsInPackage = 0;
  numOfPackages =0;
}

  public Snack(boolean isSalty, boolean isCrunchy, boolean isSweet, int numItemsInPackage, int numOfPackages){
    this.isSalty = isSalty;
    this.isCrunchy = isCrunchy;
      this.isSweet = isSweet;
    this.numItemsInPackage = numItemsInPackage;
    this.numOfPackages = numOfPackages;
  }

  public int totalNumOfItems(){
    int total = numOfPackages*numItemsInPackage;
    return total;
  }
  public int getNumItemsInPackage(){
    return numItemsInPackage;
  }

  public int getNumOfPackages(){
    return numOfPackages;
  }
  public boolean getIsSalty(){
    return isSalty;
  }
  public boolean getIsCrunchy(){
    return isCrunchy;
  }
  public boolean getIsSweet(){
    return isSweet;
  }
  
    
  
}