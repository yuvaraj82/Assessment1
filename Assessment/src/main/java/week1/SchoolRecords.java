package week1;

public class SchoolRecords {
	int schoolId;
	String schoolName;
	String schoolAddress;
	String schoolDetails;
	
	void addSchoolRecords(int schoolId,String schoolName,String schoolAddress)
	{
		schoolDetails=schoolId+", "+schoolName+", "+schoolAddress;
	}
	void dispSchoolRecords()
	{
		System.out.println(schoolDetails);
	}

}
