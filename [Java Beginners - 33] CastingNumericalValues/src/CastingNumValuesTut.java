
public class CastingNumValuesTut {

	public static void main(String[] args){
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 2.834f;
		double doubleValue = 3.53535;
		
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		
		intValue = (int) longValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int) floatValue;
		System.out.println(intValue);
		
		intValue = Math.round(floatValue);
		System.out.println(intValue);
		
		// overflow
		byteValue = (byte) 130;
		System.out.println(byteValue);
		
		// can't cast from String to int
		// 2 completely different objects
		
	}
}
