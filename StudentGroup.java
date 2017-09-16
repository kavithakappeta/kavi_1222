import java.util.Date;

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

class IllegalArgumentException extends Exception
{
	public IllegalArgumentException(String s)
	{
		super(s);
	}
}

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
	public Student[] getStudents() {
		// Add your implementation here
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try
		{
			if(students==null)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				this.students=students;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				return students[index];
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				students[index]==student;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int j=students.length;j--;j>0)
				{
					students[j]=students[j-1];
				}
				students[0]=student;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				throw new IllegaArgumentException;
			}
			else
			{
				students[students.length]=student;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int j=students.length;j--;j>index)
				{
					students[j]=students[j-1];
				}
				students[index]=student;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int j=index;j<students.length-1;j++)
				{
					students[j]=students[j+1];
				}
				students[(student.length-1)]=NULL;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int flag=0;
		try
		{
			if(student==NULL)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int i=0;i<students.length;i++)
				{
					if(students[i]==student)
					{
						flag=1;
						for(int j=i;j<students.length;j++)
						{
							students[j]=students[j+1];
						}
					}
				}
			}
			if(flag==0){throw new IllegalArgumentException(""Student not exist");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				/*for(int j=index;j<students.length-1;j++)
				{
					students[j]=students[j+1];
				}
				students[(student.length-1)]=NULL;*/
				students[index+1]=NULL;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int i=0;i<students.length;i++)
				{
					if(students[i]==student)
					{
						students[i+1]=NULL;
						break;
					}
				}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				students=&(students[index+1]);
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try
		{
			if(student==NULL)
			{
				throw new IllegalArgumentException;
			}
			else
			{
				for(int i=0;i<students.length;i++)
				{
					if(students[i]==student)
					{
						students=&(students[i+1]);
						break;
					}
				}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Exception caught");
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
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
