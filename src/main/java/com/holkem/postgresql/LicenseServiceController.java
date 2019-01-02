package com.holkem.postgresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
@RequestMapping(value="/licenses")
public class LicenseServiceController {
	
	@Autowired
	LicenseJpaRepository licenseRepo;
	
	@GetMapping
	public List<License> getAll() {
		return licenseRepo.findAll();
	}
	
//	@RequestMapping(value="/{licenseId}", method=RequestMethod.GET)
//	public License getLicense(
//			@PathVariable("organizationId") String organizationId,
//			@PathVariable("licenseId") String licenseId) {
//		return new License()
//				.withId(licenseId)
//				.withProductName("Teleco")
//				.withLicenseType("Seat")
//				.withOrganizationId("TestOrg");
//	}
	
}
/*
HolkemNotes:
1. @Controller : exposes the services endpoint and maps the data from incoming HTTP req to a java method that will process the req
2. use HTTP as invocation protocol for the service (HTTP is the language of the web)
3. use JSON serialization format : coz JSON is the native format for serializing and deserializing data being consumed by javascript-based front-ends web
4. @RestController : class-level @ that tells Spring that this class is for REST-based service. this will automatically handle the serialization of the data as JSON or XML
5, difference between @RestController and plain @Controller : plain requires u to return a ResponseBody while @RestController already includes the @ResponseBody annotation
6. @RequestMapping : 1) value defines the endpoint that the service will expose to the world. defining this endpoint at class-level means this endpoint will be the root URL for all other endpoints exposed by this class 2) method defines the HTTP verb that a method (f=when used in method-level) is matched on
7. {placeholder} : url placeholder, how u want the URL to be parameterized
8. @PathVariable : maps the parameter {placeholder} in the URL with the method parameter
*/
