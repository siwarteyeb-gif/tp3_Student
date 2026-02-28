package tp3_collections;
import java.util.*;
public class StudentGroup {
	HashSet<Student> set;
	String id;
	public StudentGroup(String id) {
	this.id = id;
	set = new HashSet<Student>() ;
	}
	public HashSet<Student> getSet() {
	return set;
	}
	public String getId() {
	return id;
	}
	// ajouter un étudient st
	public void addStudent (Student st)
	{
		if (set.contains(st)){
			System.out.println(" cet etudiant est deja trouvee");
		}
		else {
			set.add(st);
		}}
	// afficher les id des étudiants triés selon leurs moyennes générales
	public void sort() {
		TreeSet<Student>st=new TreeSet<>(set);
		System.out.println("les id des etudiants trie selon leurs moyennes generales");
		for(Student s:st) {
			System.out.println(s.getId());
		}
		
	
	}
}