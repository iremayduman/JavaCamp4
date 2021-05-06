package JavaCamp3;

public class ValidationManager implements ValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getBirthDay()<31 && gamer.getFirstName().length()>10) {
			return true;
		}
		return false;
	}

}
