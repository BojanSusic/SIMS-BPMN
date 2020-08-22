/***********************************************************************
 * Module:  Oblik.java
 * Author:  Bojan
 * Purpose: Defines the Class Oblik
 ***********************************************************************/

import java.util.*;

/** @pdOid e9d19b52-006c-4a4e-b94f-7c35cf26c240 */
public class Oblik {
   /** @pdRoleInfo migr=no name=Tacka assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=* */
   public java.util.Collection<Tacka> tacka;
   
   /** @pdOid 38e76ff6-12a1-4da8-a807-52720ca2f572 */
   public void nacrtajObjekat() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tacka> getTacka() {
      if (tacka == null)
         tacka = new java.util.HashSet<Tacka>();
      return tacka;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTacka() {
      if (tacka == null)
         tacka = new java.util.HashSet<Tacka>();
      return tacka.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTacka */
   public void setTacka(java.util.Collection<Tacka> newTacka) {
      removeAllTacka();
      for (java.util.Iterator iter = newTacka.iterator(); iter.hasNext();)
         addTacka((Tacka)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTacka */
   public void addTacka(Tacka newTacka) {
      if (newTacka == null)
         return;
      if (this.tacka == null)
         this.tacka = new java.util.HashSet<Tacka>();
      if (!this.tacka.contains(newTacka))
         this.tacka.add(newTacka);
   }
   
   /** @pdGenerated default remove
     * @param oldTacka */
   public void removeTacka(Tacka oldTacka) {
      if (oldTacka == null)
         return;
      if (this.tacka != null)
         if (this.tacka.contains(oldTacka))
            this.tacka.remove(oldTacka);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTacka() {
      if (tacka != null)
         tacka.clear();
   }

}