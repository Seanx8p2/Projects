package sean.storknet.StorkNet.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
public class MessageController {

	//Dependency injection
	@Autowired 
	private MessageService messageService;
	
	//GET Request for all Messages
	@RequestMapping("/message")
	public List<Message> getAllTopics() {
		return messageService.getAllMessages();
	}
	
	//GET Request for a single message
	//inserts id variable into {}
	@RequestMapping("message/{id}")
	//Path variable = Pointer
	public Message getTopicService(@PathVariable String id) {
		return MessageService.getMessage(id);
	}

	//POST Request
	@RequestMapping(method=RequestMethod.POST, value="/message")
	public void addTopic(@RequestBody Message message) {
		//Creates Topic 
		MessageService.addMessage(message);
	}
	
	//PUT Request
	@RequestMapping(method=RequestMethod.PUT, value="/message/{id}")
	public void updateTopic(@RequestBody Message message, @PathVariable String id) {
		//Updates Message 
		MessageService.updateMessage(id, message);
		}
	
	//Delete Request	
	@RequestMapping(method=RequestMethod.DELETE, value="/message/{id}")
	public void deleteMessage(@PathVariable String id) {
		MessageService.deleteMessage(id);
		}
		
}
*/