package com.qa.ims.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

	private static final Logger LOGGER = LogManager.getLogger();

	private final Scanner scanner;

	public Utils(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public Utils() {
		scanner = new Scanner(System.in);
	}

	public Long getLong() {
		String input = null;
		Long longInput = null;
		do {
			try {
				input = getString();
				longInput = Long.parseLong(input);
			} catch (NumberFormatException nfe) {
				LOGGER.info("Error - Please enter a number");
			}
		} while (longInput == null);
		return longInput;
	}

	public String getString() {
		return scanner.nextLine();
	}

	public Double getDouble() {
		String input = null;
		Double doubleInput = null;
		do {
			try {
				input = getString();
				doubleInput = Double.parseDouble(input);
			} catch (NumberFormatException nfe) {
				LOGGER.info("Error - Please enter a number");
			}
		} while (doubleInput == null);
		return doubleInput;
	}

	public int getInt() {
		String input = null;
		int input1 = 0;
		do {
			try {
				input = getString();
				input1 = Integer.parseInt(input);
			} catch (NumberFormatException nfe) {
				LOGGER.info("Error - Please enter a number");
			}
		} while (input1 == 0);
		return input1;
	}

	public Date getDate() {
		SimpleDateFormat DateFor = new SimpleDateFormat("YYYY-MM-DD");
		String input = null;
		Date input1 = null;
		do {
			try {
				input = getString();
				input1 = (Date) DateFor.parse(input);
			} catch (NumberFormatException nfe) {
				LOGGER.info("Error - Please enter a number");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (input1 == null);
		return input1;
	}

}
