package optional;

import java.util.Optional;

public class User {
	
	public static Optional<String> getUserById(int id){
		String str=null;
		if(id==100) {
			str="ravi";
		}
		else if(id == 101) {
			str="pavi";
		}
		else if(id==102)
			str="tomya";
		
		return Optional.ofNullable(str);
	}
}
