package sk.upjs.ics.novotnyr.smmd;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/files")
public class MultipartController {
	private static final Log log = LogFactory.getLog(MultipartController.class);
	
	@RequestMapping(method = POST)
	@ResponseStatus(CREATED)
	public void upload(@RequestParam MultipartFile file) {
		log.info("File " 
				+ file.getOriginalFilename() 
				+ " was uploaded (" + file.getSize() + " bytes)");
	}
}
