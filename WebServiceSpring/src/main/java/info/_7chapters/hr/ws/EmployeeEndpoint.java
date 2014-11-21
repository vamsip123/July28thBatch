package info._7chapters.hr.ws;

import info._7chapters.hr.schemas.HolidayRequest;

import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {
	private static Logger logger = Logger.getLogger(EmployeeEndpoint.class);
	private static final String NAMESPACE_URI = "http://_7chapters.info/hr/schemas";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "HolidayRequest")
	@ResponsePayload
	public HolidayRequest handleHolidayRequest(
			@RequestPayload HolidayRequest holidayRequest) throws Exception {
		logger.debug("holidayRequest.getEmployee().getFirstName() "
				+ holidayRequest.getEmployee().getFirstName());
		return holidayRequest;
	}
}