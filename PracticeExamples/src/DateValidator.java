public class DateValidator {
	
	private static final String DATE_PATTERN = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)"; // dd-mm-yyyy


	public static void main(String[]args) {
		
		System.out.println(DateValidator.validateDate("31-05-2001"));
		System.out.println(DateValidator.validateDate("1-1-2010"));
		System.out.println(DateValidator.validateDate("31-1-2010"));
		System.out.println(DateValidator.validateDate("29-2-2008"));
		System.out.println(DateValidator.validateDate("28-2-2009"));
		System.out.println(DateValidator.validateDate("31-3-2010"));
		System.out.println(DateValidator.validateDate("30-4-2010"));
		System.out.println(DateValidator.validateDate("31-5-2010"));
		System.out.println(DateValidator.validateDate("30-6-2010"));
		System.out.println(DateValidator.validateDate("31-7-2010"));
		System.out.println(DateValidator.validateDate("31-8-2010"));
		System.out.println(DateValidator.validateDate("30-9-2010"));
		System.out.println(DateValidator.validateDate("31-10-2010"));
		System.out.println(DateValidator.validateDate("30-11-2010"));
		System.out.println(DateValidator.validateDate("31-12-2010"));
	}


	public static boolean validateDate(String str)
	{
		String[] date = str.split("-");
		String day = date[0];
		String month = date[1];
		int year = Integer.parseInt(date[2]);
		
		if(str.matches(DATE_PATTERN))
		{
			// check for months which have 30 days
			if(day.equals("31") && (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11") ||
					month.equals("04") || month.equals("06") || month.equals("09")))
			{
				return false;
			}
			else if (month.equals("2") || month.equals("02"))
			{
				// check for leap year
				
				if( year % 4 == 0)
				{
					// check dates i.e 29 and 28th.
					if(day.equals("30") || day.equals("31"))
					{
						return false;
					}
					else
					{
						return true;
					}
				}
				else
				{
					if(day.equals("29") || day.equals("30") || day.equals("31"))
					{
						return false;
					}
					else
					{
						return true;
					}
				}
			}
			else
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	
}