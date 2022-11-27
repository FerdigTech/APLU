package com.amaaya.pwdstrengthchecker.dictionary;

import com.amaaya.pwdstrengthchecker.utils.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DictionaryUtil {
    /**
     * 10,000 most common passwords dictionary , copied from wikipedia
     * https://en.wikipedia.org/wiki/Wikipedia:10,000_most_common_passwords
     */
    //public static final String passwords = "passwords.txt";

    //To load dictionary into the object from a file. We are calling this on startup inside static block.
    public static Set<String> loadCommonPasswordDictionary(final String path)
    {
        Set<String> commonPasswordDictionary = new HashSet<>();
        //String path = "/dictionaries/pwd-dictionary.txt";
        try (
                InputStream is = DictionaryUtil.class.getResourceAsStream(path);
                BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8")))
        {
            String line;
            int i = 1;
            while ((line = br.readLine()) != null)
            {
                commonPasswordDictionary.add(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error while reading " + path);
        }

        return commonPasswordDictionary;
    }

//To detect whether password exists in dict or not

    public static boolean isFoundInDictionary(final String password) {
        return Constants.COMMON_PASSWORD_DICTIONARY.contains(password);
    }

}
