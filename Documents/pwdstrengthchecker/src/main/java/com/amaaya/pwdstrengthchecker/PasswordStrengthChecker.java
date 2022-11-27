package com.amaaya.pwdstrengthchecker;

import com.amaaya.pwdstrengthchecker.dictionary.DictionaryUtil;
import com.amaaya.pwdstrengthchecker.entropy.EntropyCalculator;
import com.amaaya.pwdstrengthchecker.model.Result;
import com.amaaya.pwdstrengthchecker.utils.Constants;

public class PasswordStrengthChecker {

    //Loading common passwords into in-memory collection
    //so here we are calling static block before even generating a constructor of a class.
    static {
        // it will read the file from the path of dictionary and load it in the variable.
        Constants.COMMON_PASSWORD_DICTIONARY = DictionaryUtil.loadCommonPasswordDictionary(Constants.COMMON_PASSWORD_DICTIONARY_PATH);
        System.out.println("COMMON_PASSWORD_DICTIONARY size = " + Constants.COMMON_PASSWORD_DICTIONARY.size());
    }

    public Result checkPasswordStrength(final String password) {
        Result result = new Result("NA", "NA");

        //Calculating the password entropy
        EntropyCalculator entropyCalculator = new EntropyCalculator();
        double entropy = entropyCalculator.calculatePasswordEntropy(password);

        //Searching the input password into common password dictionary
        boolean is_dictionary_password = DictionaryUtil.isFoundInDictionary(password);
        System.out.println("is_dictionary_password  = " + is_dictionary_password);

        if (entropy > 90.0 && !is_dictionary_password) {
            result = new Result("STRONG", "Password is strong");
        } else if (entropy > 50.0 && !is_dictionary_password) {
            result = new Result("GOOD", "Password is good");
        } else {
            result = new Result("WEAK", "Password is weak");
        }
        return result;
    }

}

// To use this api, one has to use our jar file and then they have to make the instance of that file and then call the method.
