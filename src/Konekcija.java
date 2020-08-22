/***********************************************************************
 * Module:  Konekcija.java
 * Author:  Bojan
 * Purpose: Defines the Class Konekcija
 ***********************************************************************/

import java.util.*;

/** @pdOid 43db9bc7-a6da-45c8-a268-e47f0150fef5 */
public class Konekcija {
   /** @pdOid 79cd4649-7c88-447f-984d-76564c607756 */
   private int tipKonekcije;
   /** @pdOid 4ef6cfea-2a3a-46d9-9cc7-8597e78171f0 */
   private java.lang.String naziv;
   /** @pdOid 7d9ddd22-61e7-4178-ac9f-9c518a65ad4d */
   private Element pocelement;
   /** @pdOid b584f61c-cc12-4756-b8bf-a5bae4cd5a73 */
   private Element krajnjiElement;
public int getTipKonekcije() {
	return tipKonekcije;
}
public void setTipKonekcije(int tipKonekcije) {
	this.tipKonekcije = tipKonekcije;
}
public java.lang.String getNaziv() {
	return naziv;
}
public void setNaziv(java.lang.String naziv) {
	this.naziv = naziv;
}
public Element getPocelement() {
	return pocelement;
}
public void setPocelement(Element pocelement) {
	this.pocelement = pocelement;
}
public Element getKrajnjiElement() {
	return krajnjiElement;
}
public void setKrajnjiElement(Element krajnjiElement) {
	this.krajnjiElement = krajnjiElement;
}

}