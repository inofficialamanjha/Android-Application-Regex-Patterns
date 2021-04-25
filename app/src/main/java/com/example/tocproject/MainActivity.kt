package com.example.tocproject

import androidx.appcompat.app.AppCompatActivity
import com.example.tocproject.regexFunctions
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        validDate.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validDateText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidDate(s.toString())){
                        validDateText.visibility = View.VISIBLE
                        validDateText.text = "Valid Date"
                    }
                    else{
                        validDateText.visibility = View.VISIBLE
                        validDateText.text = "Not a Valid Date"
                    }
                }
            }
        })
        validHTML.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validHTMLText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidHTMLTag(s.toString())){
                        validHTMLText.visibility = View.VISIBLE
                        validHTMLText.text = "Valid HTML Tag"
                    }
                    else{
                        validHTMLText.visibility = View.VISIBLE
                        validHTMLText.text = "Not a Valid HTML Tag"
                    }
                }
            }
        })
        validURL.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validUTLText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidURL(s.toString())){
                        validUTLText.visibility = View.VISIBLE
                        validUTLText.text = "Valid URL"
                    }
                    else{
                        validUTLText.visibility = View.VISIBLE
                        validUTLText.text = "Not a Valid URL"
                    }
                }
            }
        })
        validAadharNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validAadharNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidAadharNumber(s.toString())){
                        validAadharNumberText.visibility = View.VISIBLE
                        validAadharNumberText.text = "Valid Aadhar Number"
                    }
                    else{
                        validAadharNumberText.visibility = View.VISIBLE
                        validAadharNumberText.text = "Not a valid Aadhar Number"
                    }
                }
            }
        })
        validLicenseNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validLicenseNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidLicenseNo(s.toString())){
                        validLicenseNumberText.visibility = View.VISIBLE
                        validLicenseNumberText.text = "Valid License Number"
                    }
                    else{
                        validLicenseNumberText.visibility = View.VISIBLE
                        validLicenseNumberText.text = "Not a Valid License Number"
                    }
                }
            }
        })
        isValidCVV.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    isValidCVVText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidCVVNumber(s.toString())){
                        isValidCVVText.visibility = View.VISIBLE
                        isValidCVVText.text = "Valid CVV"
                    }
                    else{
                        isValidCVVText.visibility = View.VISIBLE
                        isValidCVVText.text = "Not a Valid CVV"
                    }
                }
            }
        })
        validTime.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validTimeText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidTime(s.toString())){
                        validTimeText.visibility = View.VISIBLE
                        validTimeText.text = "Valid Time"
                    }
                    else{
                        validTimeText.visibility = View.VISIBLE
                        validTimeText.text = "Not a Valid Time"
                    }
                }
            }
        })
        validPhoneNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validPhoneNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidIndianNumber(s.toString())){
                        validPhoneNumberText.visibility = View.VISIBLE
                        validPhoneNumberText.text = "Valid Phone Number"
                    }
                    else{
                        validPhoneNumberText.visibility = View.VISIBLE
                        validPhoneNumberText.text = "Not a Valid Phone Number"
                    }
                }
            }
        })
        validIndianPassportNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validIndianPassportNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidIndianPassportNo(s.toString())){
                        validIndianPassportNumberText.visibility = View.VISIBLE
                        validIndianPassportNumberText.text = "Valid Indian Passport Number"
                    }
                    else{
                        validIndianPassportNumberText.visibility = View.VISIBLE
                        validIndianPassportNumberText.text = "Not a Valid Indian Passport Number"
                    }
                }
            }
        })
        validVisaCardNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validVisaCardNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidVisaCardNo(s.toString())){
                        validVisaCardNumberText.visibility = View.VISIBLE
                        validVisaCardNumberText.text = "Valid Visa Card Number"
                    }
                    else{
                        validVisaCardNumberText.visibility = View.VISIBLE
                        validVisaCardNumberText.text = "Not a Valid Visa Card Number"
                    }
                }
            }
        })
        validIPAddress.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validIPAddressText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidIPAddress(s.toString())){
                        validIPAddressText.visibility = View.VISIBLE
                        validIPAddressText.text = "Valid IP Address"
                    }
                    else{
                        validIPAddressText.visibility = View.VISIBLE
                        validIPAddressText.text = "Not a Valid IP Address"
                    }
                }
            }
        })
        validMacAddress.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validMacAddressText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidMACAddress(s.toString())){
                        validMacAddressText.visibility = View.VISIBLE
                        validMacAddressText.text = "Valid Mac Address"
                    }
                    else{
                        validMacAddressText.visibility = View.VISIBLE
                        validMacAddressText.text = "Not a Valid Mac Address"
                    }
                }
            }
        })
        validPinCode.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validPinCodeText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidPinCode(s.toString())){
                        validPinCodeText.visibility = View.VISIBLE
                        validPinCodeText.text = "Valid Pin Code"
                    }
                    else{
                        validPinCodeText.visibility = View.VISIBLE
                        validPinCodeText.text = "Not a Valid Pin Code"
                    }
                }
            }
        })

        validIFSC.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validIFSCText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidIFSCode(s.toString())){
                        validIFSCText.visibility = View.VISIBLE
                        validIFSCText.text = "Valid IFSC Code"
                    }
                    else{
                        validIFSCText.visibility = View.VISIBLE
                        validIFSCText.text = "Not a Valid IFSC Code"
                    }
                }
            }
        })


        validPanNumber.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validPanNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidPanCardNo(s.toString())){
                        validPanNumberText.visibility = View.VISIBLE
                        validPanNumberText.text = "Valid Pan Number"
                    }
                    else{
                        validPanNumberText.visibility = View.VISIBLE
                        validPanNumberText.text = "Not a Valid Pan Number"
                    }
                }
            }
        })

        validYoutubeID.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s==null || s.length==0){
                    validVisaCardNumberText.visibility = View.GONE
                }
                else{
                    if(regexFunctions.isValidYoutubeVideoId(s.toString())){
                        validYoutubeIDText.visibility = View.VISIBLE
                        validYoutubeIDText.text = "Valid Youtube ID"
                    }
                    else{
                        validYoutubeIDText.visibility = View.VISIBLE
                        validYoutubeIDText.text = "Not a Valid Youtube ID"
                    }
                }
            }
        })

    }
}