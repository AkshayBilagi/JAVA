
public class University {
final static String CETCODE="E30 AND E241";
school[] a=new school[8];
static
{
	System.out.println("kle tech university");
}
class school{
	int programcode;
	String schoolcoordinator;
	int noofstud;
	int noofstaff;
	public int getProgramcode() {
		return programcode;
	}
	public String getSchoolcoordinator() {
		return schoolcoordinator;
	}
	public int getNoofstud() {
		return noofstud;
	}
	public int getNoofstaff() {
		return noofstaff;
	}
	public school(int programcode, String schoolcoordinator, int noofstud,
			int noofstaff) {
		super();
		this.programcode = programcode;
		this.schoolcoordinator = schoolcoordinator;
		this.noofstud = noofstud;
		this.noofstaff = noofstaff;
	}
	
    
}
void calculate(){
	int i=0;
	for(int j=0;j<8;j++)
	{
		if( a[j].getNoofstud() > 120   )
		{
			System.out.println("Max LIMIT reached");
		}
		else
		{
			
				i=a[j].getNoofstud();
				System.out.println("total no studentb"+i+" in "+a[j].programcode);
		}	
	}
}
 void createSchool(){
	 a[0]=new school(1,"akshay",160,50);
	 a[1]=new school(2,"bilagi",187,13);
	 a[2]=new school(3,"teju",240,14);
	 a[3]=new school(4,"yashodha",190,60);
	 a[4]=new school(5,"krishna",125,40);
	 a[5]=new school(6,"sudha",110,30);
	 a[6]=new school(7,"mahesh",120,20);
	 a[7]=new school(8,"murari",210,10);
	 
			}
}

