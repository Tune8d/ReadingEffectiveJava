package com.tune8d.effectivejava3rd.unnecessaryobject;

import java.util.regex.Pattern;

public class Mudas {
    public static void main(String[] args) {

        // Using "new" keyword or calling a constructor, or autoboxing results in instance creation.
       String s = new String("bikini");
       String s1 = "bikini";
    }

    private static long sum(){
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i; // new "Long" instance being created per every iteration
        }
        return sum;
    }

    // s.matches() creates a Pattern instance every time it is used;
    //
    private	static	final Pattern ROMAN	=	Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    +	"(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static	boolean	isRomanNumeral(String	s)	{
        return	ROMAN.matcher(s).matches();
    }
}
