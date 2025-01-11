
/**
 * Describe about subject of year 2 in IP class.
 * @author DY Daly
 * @version 1.0
 * @modified 01/11/2025
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

}	


