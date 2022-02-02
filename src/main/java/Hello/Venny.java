package Hello;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
		public class Venny {

		@GetMapping(path="/Hello")
		@ResponseBody
		public String getCustomerDetails() {
		return "This is test with Controller";
		}
		}


