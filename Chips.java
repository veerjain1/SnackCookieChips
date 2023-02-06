class Chips extends Snack{

  private boolean isStale;


  public Chips(boolean isSalty, boolean isCrunchy, boolean isSweet, int numItemsInPackage, int numOfPackages){

    super(isSalty, isCrunchy, isSweet, numItemsInPackage, numOfPackages);
    isStale = false;
    
  }

  public boolean getIsStale(){
    return isStale;
    }

  
  }
  
    
  
