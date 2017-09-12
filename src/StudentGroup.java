import java.util.Date;
import java.io.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws Exception {
		// Add your implementation here
		Scanner sc=new Scanner(System.in);
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=0;i<students;i++)
			Student[i]=sc.nextInt();
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=0;i<index;i++)
			Student[index].replace(student);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=0;i<index;i++)
		{
			for(int j=students;j>index;j--)
			{
				Student[j+1]=Student[j];
			}
			Student[index]=student;

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(i=students;i>0;i--)
		{
				Students[i+1]=Student[i];
		}
		Student[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=0;i<students;i++)
			Student[students++]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=students;i<=index;i--)
		{
				i=i+1;
				ar[i]=ar[i-1];
		}
		ar[index]=student;

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		for(int i=0;i<students;i++)
		{
			if(Student[i]==student)
			{
				for(int j=1;j<students-1;j++)
				{
					Student[j]=Student[j+1];
				}
			}
			else
				System.out.println("elemnet not found");

		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try{
			if(students==0)
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException e)
			System.out.println("illegal exception");
		
		for(int i=0;i<students;i++)
		{
			if(i==index)
				i++;
			Student[i++]=Student[i];
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort(int[] ar) {
		// Add your implementation here
		int t;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{ 
					t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
