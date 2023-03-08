package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateInstance {

//	@GetMapping(value="/makeInstance")
	@RequestMapping("/makeInstance")
	public String index() {
		return "test";
	}
	
//	@PostMapping(value="/test")
//	@ResponseBody
//	public String test(JsonObject param){
////		String name = "testInstance";
////		String amiId = "";
////		Region region = Region.US_EAST_1;
////		Ec2Client ec2 = Ec2Client.builder()
////								.region(region)
////								.credentialsProvider(ProfileCredentialsProvider.create())
////								.build();
////
////		String instanceId = createEC2Instance(ec2, name, amiId);
////
////		System.out.println("The Amazon EC2 Instance ID is " + instanceId);
////		ec2.close();
//		
//		JsonObject json = new JsonObject();
//		return json.toString();
//	}


//	public static String createEC2Instance(Ec2Client ec2, String name, String amiId) {
//
//		RunInstancesRequest runRequest = RunInstancesRequest.builder().imageId(amiId)
//				.instanceType(InstanceType.T1_MICRO).maxCount(1).minCount(1).build();
//
//		RunInstancesResponse response = ec2.runInstances(runRequest);
//		String instanceId = response.instances().get(0).instanceId();
//		Tag tag = Tag.builder().key("Name").value(name).build();
//
//		CreateTagsRequest tagRequest = CreateTagsRequest.builder().resources(instanceId).tags(tag).build();
//
//		try {
//			ec2.createTags(tagRequest);
//			System.out.printf("Successfully started EC2 Instance %s based on AMI %s", instanceId, amiId);
//			return instanceId;
//
//		} catch (Ec2Exception e) {
//			System.err.println(e.awsErrorDetails().errorMessage());
//			System.exit(1);
//		}
//
//		return "";
//	}

}
