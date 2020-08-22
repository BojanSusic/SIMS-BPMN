/***********************************************************************
 * Module:  Zadatak.java
 * Author:  Bojan
 * Purpose: Defines the Class Zadatak
 ***********************************************************************/

import java.util.*;

/** @pdOid 994cf9c7-c4c6-4c9f-8467-dec1a5ce3c3c */
public class Zadatak extends Element {
   /** @pdOid 7b8e6056-9729-48ad-a1bf-9f962f3cc35c */
   private int trajanjeUSekundama;
   
   /** @pdRoleInfo migr=no name=Zadatak assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=* */
   public java.util.Collection<Zadatak> zadatakB;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Zadatak> getZadatakB() {
      if (zadatakB == null)
         zadatakB = new java.util.HashSet<Zadatak>();
      return zadatakB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorZadatakB() {
      if (zadatakB == null)
         zadatakB = new java.util.HashSet<Zadatak>();
      return zadatakB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newZadatakB */
   public void setZadatakB(java.util.Collection<Zadatak> newZadatakB) {
      removeAllZadatakB();
      for (java.util.Iterator iter = newZadatakB.iterator(); iter.hasNext();)
         addZadatakB((Zadatak)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newZadatak */
   public void addZadatakB(Zadatak newZadatak) {
      if (newZadatak == null)
         return;
      if (this.zadatakB == null)
         this.zadatakB = new java.util.HashSet<Zadatak>();
      if (!this.zadatakB.contains(newZadatak))
         this.zadatakB.add(newZadatak);
   }
   
   /** @pdGenerated default remove
     * @param oldZadatak */
   public void removeZadatakB(Zadatak oldZadatak) {
      if (oldZadatak == null)
         return;
      if (this.zadatakB != null)
         if (this.zadatakB.contains(oldZadatak))
            this.zadatakB.remove(oldZadatak);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllZadatakB() {
      if (zadatakB != null)
         zadatakB.clear();
   }

public int getTrajanjeUSekundama() {
	return trajanjeUSekundama;
}

public void setTrajanjeUSekundama(int trajanjeUSekundama) {
	this.trajanjeUSekundama = trajanjeUSekundama;
}

}