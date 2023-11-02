package policy;

public class Policy_Data {
	private String Name;
	private String PolicyID;
	private String PolicyName;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPolicyID() {
		return PolicyID;
	}
	public void setPolicyID(String policyID) {
		PolicyID = policyID;
	}
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}
//	public Policy_Data(String name, String policyID, String policyName) {
//		super();
//		Name = name;
//		PolicyID = policyID;
//		PolicyName = policyName;
//	}
	@Override
	public String toString() {
		return "Client Name = " + Name + " | PolicyID = " + PolicyID + " | PolicyName = " + PolicyName;
	}

}
