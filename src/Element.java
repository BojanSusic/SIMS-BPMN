/***********************************************************************
 * Module:  Element.java
 * Author:  Bojan
 * Purpose: Defines the Class Element
 ***********************************************************************/

import java.util.*;

/** @pdOid 170a3ca2-7b24-49f2-87f0-bd040ee4144f */
public class Element {
   /** @pdOid 93029ba4-dae4-4c68-a999-c29da162180a */
   private String Komentar;
   /** @pdOid 0f22ff16-8543-4abd-b4cf-a3da3db4b1dc */
   private String Boja;
   
   /** @pdOid 777ab142-6bec-42a4-ab98-a064c11b4688 */
   public String Naziv;
   /** @pdOid 3dd04fd0-5402-4e99-bd2e-6841aca0a396 */
   public float Sirina;
   /** @pdOid 82bc866e-4d20-4c81-8a1a-f5d88be14cbd */
   public float Visina;
   
   /** @pdOid e7941c2a-aa25-49de-870c-63a66b8e8c67 */
   public void Promijeni_Dimenzije() {
      // TODO: implement
   }
   
   /** @pdOid bb78df4c-2563-4939-a089-d87080140a20 */
   public void Promijeni_Boju() {
      // TODO: implement
   }
   
   /** @pdOid 292742d4-a37e-4c58-b727-2417ab8e3ec3 */
   public void Promijeni_Ime() {
      // TODO: implement
   }
   
   /** @pdOid f19a2469-3873-4260-9647-eeaa515525d8 */
   public void Promijeni_Komentar() {
      // TODO: implement
   }

public String getKomentar() {
	return Komentar;
}

public void setKomentar(String komentar) {
	Komentar = komentar;
}

public String getBoja() {
	return Boja;
}

public void setBoja(String boja) {
	Boja = boja;
}

}