/***********************************************************************************************************
 * This class LoanEligibilityController is control the views and model objects 
 * 
 * DO NOT CHANGE THE CLASS NAME,  PUBLIC METHODS, SIGNATURE OF METHODS, EXCEPTION CLAUSES, RETURN TYPES
 * YOU CAN ADD ANY NUMBER OF PRIVATE METHODS TO MODULARIZE THE CODE
 * DO NOT SUBMIT THE CODE WITH COMPILATION ERRORS
 * CHANGE THE RETURN TYPE FROM NULL OF THE METHODS ONCE YOU BUILT THE LOGIC
 * DO NOT ADD ANY ADDITIONAL EXCEPTIONS IN THE THROWS CLAUSE OF THE METHOD. IF NEED BE, 
 * YOU CAN CATCH THEM AND THROW ONLY THE APPLICATION SPECIFIC EXCEPTION AS PER EXCEPTION CLAUSE
 * ADD REQUEST MAPPING URI AND RETURN TYPE AS PER DESIGN DOCUMENT
 *
************************************************************************************************************/
package com.cts.loanbazaar.loaneligibility.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.cts.loanbazaar.loaneligibility.exception.ApplicationException;
import com.cts.loanbazaar.loaneligibility.model.CustomerDetails;

/**
 * Loan Eligibility Controller
 *
 */
public class LoanEligibilityController {

	/**
	 * @param model
	 * @return String
	 */ 
	public String showHomePage(Model model) {
		return null;
	}

	/**
	 * @param model
	 * @param request
	 * @param response
	 * @param customerDetails
	 * @param result
	 * @return String
	 * @throws ApplicationException
	 */
	public String getLoanProducts(Model model, HttpServletRequest request, HttpServletResponse response,
			CustomerDetails customerDetails, BindingResult result) throws ApplicationException {

		return null;

	}

	/**
	 * @return List<String>
	 */
	public List<String> getCities() {
		return null;
	}

	/**
	 * @return List<String>
	 */
	public List<String> getEmploymentTypes() {
		return null;
	}

	/**
	 * @return List<String>
	 */
	public List<String> getGenderOptions() {
		return null;
	}

}
