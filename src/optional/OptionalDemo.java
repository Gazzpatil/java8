package optional;

import java.util.Optional;

public class OptionalDemo {
public static void main(String[] args) {
	
	Optional<String> userById = User.getUserById(100);
//	if(userById.isPresent()) {
//		System.out.println("User by given id is present "+userById.get());
//	}
//	else
//		System.out.println("User by given name is not pressent");
	System.out.println("present if");
//	userById.ifPresent(value -> System.out.println("Value: " + value));
	
//	userById.orElseGet(()->{
//		userById.get();
//	});
	
	userById.ifPresent(userByid->System.out.println(userById.get()));
	
}
}
