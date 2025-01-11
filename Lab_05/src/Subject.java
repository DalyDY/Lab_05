/**
 * Describe about subject of year 2 in IP class.
 * @author DY Daly
 * @version 1.1
 * @modified 01/11/2025
 * @update: throw exception when name is and empty string or null.
 */

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Subject {
	private String subjectName;
	private int subjectCode;
	private int numberofCredits = 1;
	
	@Override
	public String toString() {
	    return "Subject Name: " + subjectName + "\n" +
	           "Subject Code: " + subjectCode + "\n" +
	           "Number of Credits: " + numberofCredits;
	}
	
	public void setName(String name) {
	    if (name == null || name.trim().isEmpty()) {
	        throw new IllegalArgumentException("Subject name cannot be null or empty.");
	    }
	    this.subjectName = name;
	}
}
	


