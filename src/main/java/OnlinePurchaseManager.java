import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int a = 0;
    for(int i = 0; i < purchases.size(); i++){
     if(opm.getMaker().equals(maker))
         a++;
    }
    return a;
  }
  public boolean hasAdjacentEqualPair()
  {
    if(purchases.size() == 2)
      return false;
    for(int i = 0; i < purchases.size() - 1; i++){
      Gizmo meep = purchases.get(i);
      Gizmo meep2 = purchases.get(i + 1);
      if(meep.equals(meep2))
          return true;
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
