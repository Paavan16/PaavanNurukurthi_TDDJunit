package task8;

public class deletion_of_A {

		public static String delete(String string)
		{
			int str_length=string.length();
			String result="";
			if(str_length>=1)
			{
				if(string.charAt(0)!='A')
					result=string;
				if(string.charAt(0)=='A') {
					if(str_length>2)
						result=string.substring(1);
				}
				if(str_length>=2&&string.charAt(0)=='A'&& string.charAt(1)=='A')
					result=string.substring(2);
				if(string.charAt(0)!='A'&&string.charAt(1)=='A')
					result=string.substring(0,1)+string.substring(2);
					
			}
			return result;
		}

}
