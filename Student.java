package tp3_collections;
import java.util.Map.Entry;
import java.util.*;
public class Student implements Comparable<Student>{
	private String id;
	private Curriculum myCurriculum;
	private HashMap<String,ArrayList<Double> >resultats;
	

	
	
	public Student(String id, Curriculum myCurriculum, HashMap<String, ArrayList<Double>> resultats) {
		super();
		this.id = id;
		this.myCurriculum = myCurriculum;
		this.resultats = resultats;
	}
	public String toString() {

	return "Student [id=" + id + ", myCurriculum=" + myCurriculum

	+ ", resultats=" + resultats + "]";

	}
	public String getId() {
	return id;
	}
	public Curriculum getMyCurriculum() {
	return myCurriculum;
	}
	// ajouter une note d pour un module s et retourner true si l’ajout est réussi
    public boolean addNote(String s, Double d) {
        if (resultats.containsKey(s)) {
            resultats.get(s).add(d);
            return true;
        }
        System.out.println("Le module " + s + " n'existe pas");
        return false;
    }

	// calculer et retourner la moyenne d’un module s
	public double average(String s)
	{
		if(resultats.containsKey(s)) {
			double moy=0;
			ArrayList<Double>note=resultats.get(s);
			for(Double n:note) {
				moy+=n;			}
		
		return moy/note.size();}
		System.out.println(" le module "+ s+" n est pas trouvee");
		return -1;
	}
	// calculer et retourner la moyenne générale
	public Double average()
	{   double moy=0;
	int sc=0;
		Set<Entry<String,ArrayList<Double>>>modres=resultats.entrySet();
		Iterator<Entry<String,ArrayList<Double>>>it=modres.iterator();
		while(it.hasNext()) {
			 double m=0;
			Entry<String,ArrayList<Double>>mr=it.next();
			ArrayList<Double>note=mr.getValue();
			int coef=myCurriculum.getCoefMod(mr.getKey());
			sc+=coef;
			for(Double n:note) {
				m+=n;			}
			moy+=(m/note.size())*coef;
		}
		return moy/sc;
		
	}
	
	// comparer selon la moyenne générale
	public int compareTo(Student st) {
		if(this.average()>st.average()){
			return 1;
		}
		else {
			if(this.average()<st.average()) {
				return -1;
			}
			return 0;
		}
	}

}
