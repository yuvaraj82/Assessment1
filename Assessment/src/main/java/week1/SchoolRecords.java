package week1;

public class SchoolRecords {
	int schoolId;
	String schoolName;
	String schoolAddress;
	String schoolDetails;
	
	void addSchoolDetails(int schoolId,String schoolName,String schoolAddress)
	{
		schoolDetails=schoolId+", "+schoolName+", "+schoolAddress;
	}
	void dispSchoolDetails()
	{
		System.out.println(schoolDetails);
	}

}
