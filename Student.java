import java.util.Date;
class student[]
{
public static void main[string args()]
{
private id;
private fullName;
private birthDate;
private avgMark;
}
public class Student implements Comparable {

	private int id;
	private String fullName;
	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;
	private double avgMark;
public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}
private int id="14241"
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
private string fullName="mandi dadakhalandar"
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
private Date birthDate="1997-02-22"
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
private double avgMark="50"
	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
