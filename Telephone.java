package telephone1;

import java.util.ArrayList;
import java.util.List;

public class Telephone {
	private double Tnumero;
	List<Contacts> mycontacts = new ArrayList();

	public Telephone(double tnumero, List<Contacts> mycontacts) {
		super();
		Tnumero = tnumero;
		this.mycontacts = mycontacts;
	}

	public double getTnumero() {
		return Tnumero;
	}

	public void setTnumero(double tnumero) {
		Tnumero = tnumero;
	}

	public List<Contacts> getMycontacts() {
		return mycontacts;
	}

	public void setMycontacts(List<Contacts> mycontacts) {
		this.mycontacts = mycontacts;
	}

	public void addContacts(Contacts cont) {
		if (!mycontacts.contains(cont)) {
			mycontacts.add(cont);
		}
	}

	public void removeContacts(Contacts cont) {
		int index = mycontacts.indexOf(cont);
		if (index > -1) {
			mycontacts.remove(index);
		}
	}
//		public String displayMycontacts() {
//			StringBuilder builder = new StringBuilder();
//			String format = "nom : %s, prénom : %s, numéro : %d%n";
//			for (Contacts sta : mycontacts) {
//				builder.append(String.format(format, contacts.getNom(), contacts.getNumero()));
//			}
//			return builder.toString();
//	}
	
}

// public void modifierContacts(Contacts mesContacts) {
//
// }
//
// // public void interrogerContacts(Contacts mesContacts) {
//
// }
