package com.casestudy.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class cucumberJVMreort {
	public static void getReport() {
		File reportOutputDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\adactin\\report\\JVMReport");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(System.getProperty("user.dir")+"\\src\\resources\\com\\opencart\\reports\\cucumber-report1.json");

		String buildNumber = "1";
		String projectName = "Cucmberproject";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setBuildNumber(buildNumber);

		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "chrome");

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();

		}
		}

