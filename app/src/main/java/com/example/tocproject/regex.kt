package com.example.tocproject
import android.util.Log
import java.util.regex.Matcher
import java.util.regex.Pattern

object regexFunctions {

    /**
     * Accepts data in format "dd/mm/yyyy". Example -
     * 23/11/199 is not a valid date, but 23/11/1999 is a valid date
     */
    fun isValidDate(d: String?): Boolean {
        Log.i("tagg",d!!)
        val regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])$"
        val pattern: Pattern = Pattern.compile(regex)
        val matcher: Matcher = pattern.matcher(d as CharSequence?)
        return matcher.matches()
    }


    /**
     * Example - <br/>  is a valid HTML Tag but br/> is not a valid HTML tag
     * "<input value = '>'>" is also a valid HTML TAG
     */
     fun isValidHTMLTag(str: String?): Boolean {
        val regex = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>"

        // Compile the ReGex
        val p = Pattern.compile(regex)

        // If the string is empty
        // return false
        if (str == null) {
            return false
        }
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        val m = p.matcher(str)

        // Return if the string
        // matched the ReGex
        return m.matches()
    }


    /**
     * "https://www.geeksforgeeks.org" is valid URL whereas
     * "htts://www.geeksforgeeks.org" ,"https//www.geeksforgeeks.org",etc are not
     */
    fun isValidURL(url: String?): Boolean {
        // Regex to check valid URL
        val regex = "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
                "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
                "([).!';/?:,][[:blank:]])?$"

        // Compile the ReGex
        val p = Pattern.compile(regex)

        // If the string is empty
        // return false
        if (url == null) {
            return false
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        val m = p.matcher(url)

        // Return if the string
        // matched the ReGex
        return m.matches()
    }


    /**
     * The valid Aadhar number must satisfy the following conditions:
     * It should have 12 digits.
     * It should not starts with 0 and 1.
     * It should not contains any alphabet and special characters.
     * It should have white space after every 4 digits.
     *
     * E.g - "3675 9834 6012" is a valid Aadhar Number whereas "3675 9834 6012 8” is not as it contains 13 digits.
     */
    fun isValidAadharNumber(str: String?): Boolean {
        val regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$"

        // Compile the ReGex
        val p = Pattern.compile(regex)

        // If the string is empty
        // return false
        if (str == null) {
            return false
        }

        // Pattern class contains matcher() method
        // to find matching between given string
        // and regular expression.
        val m = p.matcher(str)

        // Return if the string
        // matched the ReGex
        return m.matches()
    }


    /**
     * Valid Indian driving license number must satisfy these -
     * 1) It should be 16 characters long (including space or hyphen (-)).
     * 2) The driving license number can be entered in any of the following format - "HR-0619850034761" OR "HR06 19850034761"
     * 3) The first two characters should be upper case alphabets that represent the state code.
     * 4) The next two characters should be digits that represent the RTO code.
     * 5) The next four characters should be digits that represent the license issued year.
     * 6) The next seven characters should be any digits from 0-9.
     */
    fun isValidLicenseNo(str: String?): Boolean {
        val regex = ("^(([A-Z]{2}[0-9]{2})"
                + "( )|([A-Z]{2}-[0-9]"
                + "{2}))((19|20)[0-9]"
                + "[0-9])[0-9]{7}$")

        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }



    /**
     * Valid CVV Number is this -
     * 1) It should have 3 or 4 digit.
     * 2) It should have digit between 0-9.
     * 3) It should not have any alphabets and special characters.
     */
     fun isValidCVVNumber(str: String?): Boolean {

        val regex = "^[0-9]{3,4}$"
        /**
         * 1) ^ represents the starting of the string.
         * 2) [0-9] represents the digit between 0-9.
         * 3) {3, 4} represents the string have 3 or 4 digit.
         * 4) $ represents the ending of the string.
         */


        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }


    /**
     * Function to validate Time in 24 hour clock. Eg - "13:05” is a valid time in 24 hour format.
     * "24:00” , “10:60” , "10:15 PM” are not valid 24 Hour format time
     */
    fun isValidTime(time: String?): Boolean {
        val regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]"
        val p = Pattern.compile(regex)
        if (time == null) {
            return false
        }
        val m = p.matcher(time)
        return m.matches()
    }



    /**
     * Valid Indian Mobile Number -
     * 1) The first digit should contain number between 7 to 9.
     * 2) The rest 9 digit can contain any number between 0 to 9.
     * 3) The mobile number can have 11 digits also by including 0 at the starting.
     * 4) The mobile number can be of 12 digits also by including 91 at the starting
     */
    fun isValidIndianNumber(s: String): Boolean {
        val p = Pattern.compile("(0/91)?[7-9][0-9]{9}")
        val m = p.matcher(s)
        return m.find() && m.group() == s
    }



    /**
     * Valid Indian Passport Number rules -
     * 1) It should be eight characters long.
     * 2) The first character should be an upper case alphabet.
     * 3) The next two characters should be a number, but the first character should be any number from 1-9 and the second character should be any number from 0-9.
     * 4) It should be zero or one white space character.
     * 5) The next four characters should be any number from 0-9.
     * 6) The last character should be any number from 1-9.
     */
    fun isValidIndianPassportNo(str: String?): Boolean {
//        val regex = ("^[A-PR-WYa-pr-wy][1-9]\\d" + "\\s?\\d{4}[1-9]$")
        val regex = "^[A-Z][0-9]{7}$"
        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }


    /**
     * Valid Visa Card Number
     * 1) It should be 13 or 16 digits long, new cards have 16 digits and old cards have 13 digits.
     * 2) It should be starts with 4.
     * 3) If the cards have 13 digits the next twelve digits should be any number between 0-9.
     * 4) If the cards have 16 digits the next fifteen digits should be any number between 0-9.
     * 5) It should not contains any alphabets and special characters.
     */
    fun isValidVisaCardNo(str: String?): Boolean {
        val regex = "^4[0-9]{12}(?:[0-9]{3})?$"
        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }



    /**
     * The IP address is a string in the form “A.B.C.D”, where the value of A, B, C, and D may range from 0 to 255.
     * Leading zeros are allowed. The length of A, B, C, or D can’t be greater than 3.
     *
     * "000.12.12.034" is a valid IP address ,
     * "000.12.234.23.23" and  "I.Am.not.an.ip" is not a IP address
     */
    fun isValidIPAddress(ip: String?): Boolean {
        val zeroTo255 = ("(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])")
        val regex = (zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255)

        val p = Pattern.compile(regex)
        if (ip == null) {
            return false
        }
        val m = p.matcher(ip)
        return m.matches()
    }



    /**
     * Valid MAC Address
     * 1) It must contain 12 hexadecimal digits.
     * 2) One way to represent them is to form six pairs of the characters separated with a hyphen (-) or colon(:). For example, 01-23-45-67-89-AB is a valid MAC address.
     * 3) Another way to represent them is to form three groups of four hexadecimal digits separated by dots(.). For example, 0123.4567.89AB is a valid MAC address.
     */
    fun isValidMACAddress(str: String?): Boolean {
        val regex = ("^([0-9A-Fa-f]{2}[:-])" + "{5}([0-9A-Fa-f]{2})|" + "([0-9a-fA-F]{4}\\."
                + "[0-9a-fA-F]{4}\\." + "[0-9a-fA-F]{4})$")
        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }


    /**
     * The valid pin code of India must satisfy the following conditions.
     * 1) It can be only six digits.
     * 2) It should not start with zero.
     * 3) First digit of the pin code must be from 1 to 9.
     * 4) Next five digits of the pin code may range from 0 to 9.
     * 5) It should allow only one white space, but after three digits, although this is optional.
     * "132103" is a valid pin code but “014205” , "1473598" are not valid ZIP Codes.
     */
     fun isValidPinCode(pinCode: String?): Boolean {
        val regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"
        val p = Pattern.compile(regex)
        if (pinCode == null) {
            return false
        }
        val m = p.matcher(pinCode)
        return m.matches()
    }


    /**
     * Tha valid IFSC (Indian Financial System) Code must satisfy the following conditions:
     * 1) It should be 11 characters long.
     * 2) The first four characters should be upper case alphabets.
     * 3) The fifth character should be 0.
     * 4) The last six characters usually numeric, but can also be alphabetic.
     *
     * E.g - "SBIN0125620" is a valid IFSC Code whereas "1234SBIN012" is not a valid IFSC Code.
     */
     fun isValidIFSCode(str: String?): Boolean {
        val regex = "^[A-Z]{4}0[A-Z0-9]{6}$"
        val p = Pattern.compile(regex)
        if (str == null) {
            return false
        }
        val m = p.matcher(str)
        return m.matches()
    }

    /**
     * The valid PAN Card number must satisfy the following conditions:
     * 1) It should be ten characters long.
     * 2) The first five characters should be any upper case alphabets.
     * 3) The next four-characters should be any number from 0 to 9.
     * 4) The last(tenth) character should be any upper case alphabet.
     * 5) It should not contains any white spaces.
     * e.g - "BNZAA2318J" is a valid pan card number wheras "23ZAABN18J" is not.
     */
     fun isValidPanCardNo(panCardNo: String?): Boolean {
        val regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}"
        val p = Pattern.compile(regex)
        if (panCardNo == null) {
            return false
        }
        val m = p.matcher(panCardNo)
        return m.matches()
    }


    fun isValidYoutubeVideoId(panCardNo: String?): Boolean {
        //Just make sure that this regex expression is correct
//        val regex = "https?:\\/\\/(www\\.)?youtube.com\\/channel\\/UC([-_a-z0-9]{22})"
        val regex = "http(?:s)?:\\/\\/(?:m.)?(?:www\\.)?youtu(?:\\.be\\/|be\\.com\\/(?:watch\\?(?:feature=youtu.be\\&)?v=|v\\/|embed\\/|user\\/(?:[\\w#]+\\/)+))([^&#?\\n]+)"
        val p = Pattern.compile(regex)
        if (panCardNo == null) {
            return false
        }
        val m = p.matcher(panCardNo)
        return m.matches()
    }

}