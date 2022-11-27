package com.amaaya.pwdstrengthchecker.entropy;

public class PoolSizeCalculator {

    public int calculatePoolSize(final String password) {
        return this.checkDigitsPoolSize(password)+this.checkLowerCasePoolSize(password)+this.checkUpperCasePoolSize(password)+this.checkSpecialCharsPoolSize(password);
    }

    /*
    Pool: Digits , Elements : 0-9 , Pool Size: 10
    * */
    private int checkDigitsPoolSize(final String password) {
        int poolSize=0;
        if(password.matches(".*\\d.*"))
        {
            poolSize=10;
        }
        return poolSize;
    }

    /*
   Pool: Lower case Latin letters , Elements : a-z , Pool Size: 26
   * */
    private int checkLowerCasePoolSize(final String password) {
        int poolSize=0;
        if(password.matches(".*[a-z].*"))
        {
            poolSize=26;
        }
        return poolSize;
    }
    /*
      Pool: Upper case Latin letters	 , Elements : A-Z , Pool Size: 26
      * */
    private int checkUpperCasePoolSize(final String password) {
        int poolSize=0;
        if(password.matches(".*[A-Z].*"))
        {
            poolSize=26;
        }
        return poolSize;
    }

    /*
     Pool: Keyboard Special symbols	 , Elements : `~!@#$%^&*()-=_+[{]}\|;':",.<>/? , Pool Size: 32
     * */
    private int checkSpecialCharsPoolSize(final String password) {
        int poolSize=0;
        if(password.matches(".*[`~!@#$%^&*()-=_+[{]}\\|;':\",.<>/?].*"))
        {
            poolSize=32;
        }
        return poolSize;
    }

}

