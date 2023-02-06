class Cookie extends Snack{

  private boolean isCooked;

  public Cookie(boolean isSalty, boolean isCrunchy, boolean isSweet, int numItemsInPackage, int numOfPackages){
     super(isSalty, isCrunchy, isSweet, numItemsInPackage, numOfPackages);
    isCooked = false;
  }

  
  public boolean getIsCooked(){

    return isCooked;
    
  }
  
    
  
}