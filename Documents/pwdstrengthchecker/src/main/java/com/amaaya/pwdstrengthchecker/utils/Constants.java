package com.amaaya.pwdstrengthchecker.utils;

import java.util.HashSet;
import java.util.Set;

public class Constants {
    //the path of dictionary
    public final static String COMMON_PASSWORD_DICTIONARY_PATH = "/dicionary/pwd-dictionary.txt";
    //to load dictionary in the memory so that we don't have to read file again and again
    public static Set<String> COMMON_PASSWORD_DICTIONARY=new HashSet<>();

}
