package com.amaaya.pwdstrengthchecker.entropy;

import com.amaaya.pwdstrengthchecker.utils.MathUtils;

public class EntropyCalculator {

    public double calculatePasswordEntropy(final String password) {
        double entropy=0.0;
        //Calculating password pool size.
        int poolSize = new PoolSizeCalculator().calculatePoolSize(password);
        System.out.println("Password Pool Size: "+poolSize);
        //Calculating Password length
        int passwordLength = password.length();
        System.out.println("Password Length: "+passwordLength);
        //Calculating the Entropy usint this formula E = L * log2(R), where R =  Pool Size , L = Length of the password
        entropy = passwordLength * MathUtils.log2(poolSize);
        System.out.println("Password entropy : "+entropy);
        return entropy;
    }
}
