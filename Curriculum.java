package tp3_collections;
import java.util.*;
import java.util.Map.Entry;
public class Curriculum {
	private String id;
	private HashMap<String,Integer > Mod_Coef;
	public Curriculum(String s) {
	id=s;
	Mod_Coef= new HashMap<String,Integer >();
	}
	public String getId() {
		return id; }
		public HashMap<String, Integer> getMod_Coef() {
		return Mod_Coef;
		}
		// ajouter un module s et son coefficient i dans une formation
		public void addModCoef(String s, int i) {
			Mod_Coef.put(s, i);
		}
		// connaitre le coefficient d’ un module s
		public int getCoefMod(String s ) {
			if(Mod_Coef.containsKey(s)) {
				return Mod_Coef.get(s);
			}
			return -1;
		}
		// connaitre l’ensemble des modules de la formation
		public HashSet <String > getModSet() {
			 Set<String>setmod=Mod_Coef.keySet();
			 HashSet<String>hs=new HashSet<String>(setmod);
			 return hs;}
		@Override
		public String toString() {
			return "Curriculum [id=" + id + ", Mod_Coef=" + Mod_Coef + "]";
		}
	    
}


