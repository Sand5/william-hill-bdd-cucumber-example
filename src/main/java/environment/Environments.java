package environment;


/**
 * This is the AUT environments
 * class which can be configured
 * to store more environments.
 * We can build on the enums
 * based on the environments
 * that will be tested against.
 */


public abstract class Environments {

    public enum Environment {


        QA("QA");

        private String value;

        Environment(String value) {

            this.value = value;
        }

        public String getQAEnv() {


            return value;
        }
    }

    /**
     The getEnvironment() method returns
     the selected environment via a enum argument.Using enums
     helps to ensure correct environments are used all of the
     hardcode to the URL can be changed in one place.
     **/
    public static String getEnvironment(Environment environment) {

        String envo = null;
        switch (environment) {

            case QA:
                envo = "https://sports.williamhill.com/sr-admin-set-white-list-cookie.html";
                break;
        }


        return envo;
    }



}
