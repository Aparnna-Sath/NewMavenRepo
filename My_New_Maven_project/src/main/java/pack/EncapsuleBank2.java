package pack;

public class EncapsuleBank2 {
	
	
	

	public static void main(String[] args) {
		EncapsulationBank1 bank = new EncapsulationBank1();

        // Set the pin using user input
        bank.setDetails();

        // Validate the pin
        if (bank.getDetails()) {
            System.out.println("Pin is valid!");
        } else {
            System.out.println("Invalid pin!");
        }
	}

}
